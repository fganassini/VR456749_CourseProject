# DOCUMENTAZIONE

## Introduzione

Il progetto implementa il componente del sistema di gestione di una stazione meteorologica. Tale componente si occupa di
raccogliere i dati forniti da strumenti volti alla misurazione dei seguenti parametri meteorologici.  
Inoltre ne effettua una prima elaborazione al fine di trasmetterli in un formato opportuno quando vengono richiesti dal 
sistema centrale di archiviazione ed elaborazione dei dati meteorologici.

La seguente documentazione si propone di descrivere il progetto esplicitandone:  
1. i requisiti;
2. gli scenari considerati;
3. il design;
4. i test di validazione.


## Requisiti

### 1. Raccolta dei dati meteorologici

1. Il collezionatore raccoglie i seguenti dati dai rispettivi strumenti meteorologici:

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

1. Il collezionatore, una volta raccolta i dati, ne effettua una prima elaborazione per raggrupparli e formattarli.

2. Ogni elaborazione contiene l'elenco di tutti i parametri, la data e l'ora in cui è stata effettuata.

3. L'elaborazione viene effettuata dopo ogni singola raccolta.

4. I dati elaborati vengono scritti sul database interno alla stazione. Esso permette di poter recuperare eventuali dati non trasmessi.



### 3. Altri requisiti

1. Il componente prevede la possibilità di essere riconfigurato. In particolare, la configurazione contiene l'assegnamento 
degli strumenti da cui ricavare i dati, in caso di eventuali malfunzionamenti o sostituzione di essi.
    
2. Viene incluso inoltre un simulatore ad interfaccia web, con il quale l'utente può provare le varie funzionalità e servizi
forniti dal componente.



## Scenari

### 1. Avvio del collezionatore

__Assunzioni__: il simulatore è nella schermata iniziale.

__Normale esecuzione:__ l'utente seleziona la funzionalità "Avvia collezionatore". Il collezionatore viene avviato
e il simulatore passa nella schermata dedicata ai servizi del collezionatore. 

__Eventuali intoppi e comportamenti relativi:__ se nella procedura di avvio dovessero esserci errori, viene mostrato un
messaggio di errore.

__Stato finale del sistema__: il simulatore è nella schermata del collezionatore.


### 2. Collezione dei dati meteorologici

__Assunzioni__: il simulatore è nella schermata del collezionatore

__Normale esecuzione:__ l'utente seleziona la funzionalità "Colleziona dati". Il collezionatore effettua un numero predefinito
di letture dagli strumenti meteorologici, le elabora e le scrive nel database. Finita l'esecuzione, viene restituito 
all'utente il messaggio: "Collezione effettuata con successo". Viene poi fornita un'opzione all'utente per poter tornare
nella schermata del collezionatore.

__Eventuali intoppi e comportamenti relativi:__ se la procedura di collezione comporta degli errori, viene restituito all'utente
il messaggio "Collezione non riuscita". Viene poi fornita un'opzione all'utente per poter tornare nella schermata del collezionatore.

__Stato finale del sistema__: il simulatore è nella schermata del collezionatore.


### 3. Richiesta dei dati meteorologici

__Assunzioni__: il simulatore è nella schermata del collezionatore

__Normale esecuzione:__ l'utente seleziona la funzionalità "Richiedi dati". Il collezionatore ricava i dati presenti nel
database e ne restituisce l'elenco all'utente modificando lo status dei dati come "trasmessi". Viene poi fornita un'opzione all'utente per poter tornare
nella schermata del collezionatore.

__Eventuali intoppi e comportamenti relativi:__ se il database risulta vuoto, a posto della lista viene visualizzato il
messaggio "Nessun dato collezionato". Se dovessero esserci errori nel caricamento dei dati dal database, viene invece visualizzato
un relativo messaggio di errore.

__Stato finale del sistema__: il simulatore è nella schermata del collezionatore.


### 4. Riconfingurazione del collezionatore

__Assunzioni__: il simulatore è nella schermata del collezionatore.

__Normale esecuzione:__ l'utente seleziona la funzionalità "Riconfigura". Viene mostrato un form con l'attuale
configurazione. L'utente modifica nel form i parametri voluti e poi seleziona l'opzione "Applica". Viene nuovamente
mostrata la schermata con i parametri aggiornati. Viene poi fornita un'opzione all'utente per poter tornare
nella schermata del collezionatore.

__Eventuali intoppi e comportamenti relativi:__ se l'utente lascia dei campi vuoti, viene visualizzato un messaggio
che lo invita a compilare i campi obbligatori.

__Altre attività:__ l'utente può tornare in qualsiasi momento nella schermata del collezionatore. Se compila il form e torna
indietro senza prima selezionare l'opzione "Applica" non viene effettuata nessuna modifica alla configurazione. Pertanto,
al successivo accesso a "Riconfigura" verrà restituita l'ultima configurazione applicata.

__Stato finale del sistema__: il simulatore è nella schermata del collezionatore.


### 5. Spegnimento del collezionatore

__Assunzioni__: il simulatore è nella schermata del collezionatore.

__Normale esecuzione:__ l'utente seleziona l'opzione "Spegni collezionatore". Viene visualizzata la schermata iniziale.

__Eventuali intoppi e comportamenti relativi:__ se dovessero esserci errori nella procedura, viene visualizzato un messaggio
di errore.

__Stato finale del sistema__: il simulatore è nella schermata iniziale.



## Design

### Casi d'uso

![Use case diagram](/designDiagrams/UseCase.jpg)

### Diagramma delle classi

Descrizione
Immagine

### Diagrammi d'attività

Descrizione
Immagine

### Diagrammi di sequenza

Descrizione
Immagine


## Test

###Test d'accettazione

Scenario 1

Scenario 2

Scenario 3

Scenario 4

Scenario 5

Scenario 6


###Copertura test d'unità