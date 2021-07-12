# DOCUMENTAZIONE

## Introduzione

Il progetto implementa il componente del sistema di gestione di una stazione meteorologica. Tale componente si occupa di
raccogliere i dati forniti da strumenti volti alla misurazione dei seguenti parametri meteorologici.  
Inoltre ne effettua una prima elaborazione al fine di trasmetterli in un formato opportuno quando vengono richiesti dal 
"sistema centrale di archiviazione ed elaborazione dei dati meteorologici".

La seguente documentazione si propone di descrivere il progetto esplicitandone:  
1. i requisiti;
2. gli scenari considerati;
3. il design;
4. i test di validazione.


## Requisiti

### 1. Raccolta dei dati meteorologici

1. Il componente raccoglie i seguenti dati dai rispettivi strumenti meteorologici:

    - __temperatura del suolo__, misurata da un primo termometro;
    - __temperatura dell'aria__, misurata da un secondo termometro;
    - __pressione atmosferica__, misurata da un barometro;
    - __direzione e velocità del vento__, misurate da uno strumento che integra un anemometro e un anemoscopio;
    - __quantità di pioggia giornaliera__, misurata da un pluviometro;
    - __radiazione solare__, misurata da un solarimetro.
    
2. Si assume per semplicità che i dati forniti siano già espressi in un'unità di misura standard. In particolare:

    - temperature in __Kelvin (K)__
    - pressione atmosferica in __Pascal (Pa)__;
    - velocità del vento in __metri al secondo (m/s)__;
    - quantità di pioggia giornaliera in __metri (m)__;
    - radiazione solare in __watt al metro quadro (W/m^2)__.


### 2. Elaborazione e memorizzazione dei dati

1. Il componente, una volta raccolta i dati, ne effettua una prima elaborazione per raggrupparli e formattarli.

2. Ogni elaborazione contiene l'elenco di tutti i parametri, la data e l'ora in cui è stata effettuata.

3. L'elaborazione viene effettuata dopo ogni singola raccolta.

4. I dati elaborati vengono scritti sul database interno alla stazione. Esso è presente al fine di poter recuperare eventuali dati non trasmessi.



### 3. Altri requisiti

1. Il componente prevede la possibilità di essere riconfigurato. In particolare, la configurazione contiene l'assegnamento 
degli strumenti da cui ricavare i dati, in caso di eventuali malfunzionamenti o sostituzione di essi.
    
2. Viene incluso inoltre un simulatore ad interfaccia web, con il quale l'utente può provare le varie funzionalità e servizi
forniti dal componente.



## Scenari

### 1. Avvio

__Assunzioni__: il simulatore è nella schermata delle funzionalità e il componente è spento.

__Normale esecuzione:__ l'utente seleziona la funzionalità "Turn on collector". Il componente viene avviato
e il simulatore passa nella schermata dedicata alle funzionalità. 

__Eventuali intoppi e comportamenti relativi:__ se nella procedura di avvio dovessero esserci errori, viene mostrato un
messaggio di errore.

__Stato finale del sistema__: il simulatore è nella schermata delle funzionalità e il componente è acceso.


### 2. Collezione dei dati meteorologici

__Assunzioni__: il simulatore è nella schermata delle funzionalità.

__Normale esecuzione:__ l'utente seleziona la funzionalità "Collect some weather data". Il componente effettua un numero predefinito
di letture dagli strumenti meteorologici, le elabora e le scrive nel database. Finita l'esecuzione, viene restituito 
all'utente il messaggio: "Collezione successfully done". L'utente torna nella schermata delle funzionalità selezionando un'apposita funzione.

__Eventuali intoppi e comportamenti relativi:__ se la procedura di collezione comporta degli errori, viene restituito all'utente
un messaggio di errore. Viene poi fornita un'opzione all'utente per poter tornare nella schermata delle funzionalità.

__Stato finale del sistema__: il simulatore è nella schermata delle funzionalità.


### 3. Richiesta dei dati meteorologici

__Assunzioni__: il simulatore è nella schermata delle funzionalità.

__Normale esecuzione:__ l'utente seleziona la funzionalità "Read weather data". Il componente ricava i dati presenti nel
database e ne restituisce l'elenco all'utente. L'utente torna nella schermata delle funzionalità selezionando un'apposita funzione.

__Eventuali intoppi e comportamenti relativi:__ nel caso in cui il database fosse vuoto, viene mostrato un elenco vuoto. 
Se dovessero esserci errori nel caricamento dei dati dal database, viene invece visualizzato un messaggio di errore.

__Stato finale del sistema__: il simulatore è nella schermata delle funzionalità.


### 4. Riconfingurazione

__Assunzioni__: il simulatore è nella schermata delle funzionalità.

__Normale esecuzione:__ l'utente seleziona la funzionalità "Reconfigure the collector". Viene mostrato un form con l'attuale
configurazione. L'utente modifica nel form i parametri voluti e poi seleziona l'opzione "Invia". Viene nuovamente
mostrata la schermata con i parametri aggiornati. L'utente torna nella schermata delle funzionalità selezionando un'apposita funzione.

__Eventuali intoppi e comportamenti relativi:__ se l'utente lascia dei campi vuoti, viene visualizzato un messaggio
che lo invita a compilare i campi obbligatori.

__Altre attività:__ l'utente può tornare in qualsiasi momento nella schermata delle funzionalità. Se compila il form e torna
indietro senza prima selezionare l'opzione "Invia" non viene effettuata nessuna modifica alla configurazione. Pertanto,
al successivo accesso a "Reconfigure the collector" verrà restituita l'ultima configurazione applicata.

__Stato finale del sistema__: il simulatore è nella schermata delle funzionalità.


### 5. Spegnimento del collezionatore

__Assunzioni__: il simulatore è nella schermata delle funzionalità e il componente è acceso.

__Normale esecuzione:__ l'utente seleziona l'opzione "Turn off the collector". Viene visualizzata la schermata iniziale.

__Eventuali intoppi e comportamenti relativi:__ se dovessero esserci errori nella procedura, viene visualizzato un messaggio
di errore.

__Stato finale del sistema__: il simulatore è nella schermata iniziale e il componente è spento.



## Design

### Casi d'uso

![Use case diagram](/designDiagrams/UseCase.jpg)

### Diagramma delle classi

![Class diagram](/designDiagrams/Class.jpg)

### Diagrammi d'attività

#### 1. Funzionamento generale del componente

![Collector simulation - Activity Diagram](/designDiagrams/CollectorSimulation.jpg)

#### 2. Collezione dei dati meteorologici

![Collect data - Activity Diagram](/designDiagrams/CollectData.jpg)

#### 3. Lettura dei dati meteorologici memorizzati

![Read data - Activity Diagram](/designDiagrams/ReadData.jpg)

#### 4. Modifica della configurazione

![Change configuration - Activity Diagram](/designDiagrams/Reconfigure.jpg)



### Diagrammi di sequenza

#### 1. Avvio

![Turn on - Seq. Diagram](/designDiagrams/TurnOnCollector.jpg)

#### 2. Collezione dei dati meteorologici

![Collect data - Seq. Diagram](/designDiagrams/GetAndProcessWeatherData.jpg)

#### 3. Richiesta dei dati memorizzati

![Request data - Seq. Diagram](/designDiagrams/RequestWeatherDataToCollector.jpg)

#### 4. Modifica della configurazione

![Change configuration - Seq. Diagram](/designDiagrams/ReconfigureCollector.jpg)

#### 5. Spegnimento

![Turn off - Seq. Diagram](/designDiagrams/TurnOffCollector.jpg)



## Test

### Test d'accettazione

I test di accettazione sono stati implementati utilizzando il framework JWebUnit e sono disponibili al
seguente link: [acceptance tests](https://github.com/fganassini/VR456749_AcceptanceTest).
Di seguito ne viene effettuata una descrizione.

#### Scenario 1

Il test verifica se l'avvio del componente funziona correttamente. In particolare devono essere vere le seguenti condizioni:
    
    1. la schermata iniziale del simulatore contiene la funzionalità "Turn on the collector";

    2. lo status del componente è "false", ossia spento;
    
    3. selezionando "Turn on the collector" viene mostrata la schermata delle funzionalità;
    
    4. lo status del componente viene impostato a "true, ossia acceso.
    

#### Scenario 2

Scenario 3

Scenario 4

Scenario 5

Scenario 6


###Copertura test d'unità