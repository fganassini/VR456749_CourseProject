package it.univr.weatherstation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class Simulator {
    @Autowired
    private WeatherDataRepository repository;

    private CollectorAndProcessor cAP = new CollectorAndProcessor();

    @RequestMapping("/")
    public String index(Model model) {
        cAP.setStatus(false);
        model.addAttribute("status", cAP.getStatus());
        return "index";
    }

    @RequestMapping("/collector")
    public String turnOnCollector(Model model) {
        cAP.setStatus(true);
        model.addAttribute("status", cAP.getStatus());
        return "home";
    }

    @RequestMapping("/collect")
    public String collectData() {
        for(int i = 0; i < 10; i++)
            cAP.collectAndProcessingData();

        List<WeatherData> list = cAP.getWeatherData();
        repository.saveAll(list);
        cAP.clearList();
        return "collect";
    }


    @RequestMapping("/list")
    public String readData(Model model) {
        List<WeatherData> list = repository.findAll();
        model.addAttribute("weatherData", list);
        return "list";
    }


    @RequestMapping("/reconfigure")
    public String reconfigure(Model model) {
        model.addAttribute("config", cAP.getConfig());
        return "reconfigure";
    }

    @RequestMapping("/change")
    public String changeConfiguration(
            @RequestParam(value = "therm1", required = true) String therm1,
            @RequestParam(value = "therm2", required = true) String therm2,
            @RequestParam(value = "barom", required = true) String barom,
            @RequestParam(value = "windm", required = true) String windm,
            @RequestParam(value = "rainm", required = true) String rainm,
            @RequestParam(value = "sunm", required = true) String sunm,
            Model model
    ) {
        Config c = cAP.getConfig();
        c.changeConfig(therm1, therm2, barom, windm, rainm, sunm);
        cAP.setConfig(c);
        return "redirect:/reconfigure";
    }

    @RequestMapping("/off")
    public String turnOffCollector() {
        return "redirect:/";
    }
}
