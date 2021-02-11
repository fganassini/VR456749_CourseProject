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

1. Il componente raccoglie i seguenti dati dai rispettivi strumenti meteorologici:

    - __temperatura del suolo__, misurata da un primo termometro;
    - __temperatura dell'aria__, misurata da un secondo termometro;
    - __pressione atmosferica__, misurata da un barometro;
    - __direzione e velocità del vento__, misurate da uno strumento che integra un anemometro e un anemoscopio;
    - __quantità di pioggia giornaliera__, misurata da un pluviometro;
    - __radiazione solare__, misurata da un solarimetro.
    
2. Si assume per semplicità che i dati forniti siano già espressi in un'unità di misura standard.


### 2. Elaborazione e memorizzazione dei dati

1. Il componente, una volta raccolta i dati, ne effettua una prima elaborazione per raggrupparli e formattarli al fine
di poterli trasmettere al sistema centralizzato di memorizzazione ed elaborazione.

2. Ogni elaborazione contiene l'elenco di tutti i parametri, la data e l'ora in cui è stata effettuata.

3. L'elaborazione viene effettuata dopo ogni raccolta.

4. Le elaborazioni viene memorizzate periodicamente (per semplicità, dopo un determinato numero di 
elaborazioni) in un file di backup apposito presente su un dispositivo di memorizzazione della stazione. 
Questo permette, in caso di mancata trasmissione o di perdita di dati del sistema centrale, di poter recuperare
le elaborazioni mancanti.


### 3. Trasmissione dei dati

1. Il sistema centrale di memorizzazione ed elaborazione dei dati meteorologici richiede i dati alla stazione.
Tale richiesta viene inoltrata al componente dal sistema di comunicazione. Il componente, pertanto, invia i dati al
sistema di comunicazione e attende da esso l'esito della trasmissione.

2. Se i dati richiesti non sono presenti nella corrente sessione d'esecuzione (si presuppone che la stazione sia 
stata spenta), essi vengono cercati nel file di backup. In caso non vengano trovati, viene inviato al sistema di comunicazione
un messaggio relativo che verrà trasmesso al sistema centrale.


### 4. Altri requisiti

1. Il componente prevede la possibilità di essere riconfigurato. In particolare possono essere eseguite le seguenti
riconfigurazioni:

    - assegnamento degli strumenti da cui ricavare i dati, in caso di eventuali malfunzionamenti o sostituzione di essi;
    - modifica del periodo di salvataggio su file.
    
2. I parametri meteorologici devono essere inviati anche al componente controllore della stazione, al fine di constatare
eventuali condizioni avverse che possano richiedere uno spegnimento della stazione.

3. Il componente, in caso di spegnimento richiesto dal controllore, provvede a memorizzare sul file di backup
le ultime elaborazioni completate e poi si spegne.



## Scenari

### Primo scenario

__Assunzioni__:

__Normale esecuzione:__

__Eventuali intoppi e comportamente relativi:__

__Altre attività__:

__Stato finale del sistema__:


### Secondo scenario

__Assunzioni__:

__Normale esecuzione:__

__Eventuali intoppi e comportamente relativi:__

__Altre attività__:

__Stato finale del sistema__:

### Terzo scenario

__Assunzioni__:

__Normale esecuzione:__

__Eventuali intoppi e comportamente relativi:__

__Altre attività__:

__Stato finale del sistema__:


### Quarto scenario

__Assunzioni__:

__Normale esecuzione:__

__Eventuali intoppi e comportamente relativi:__

__Altre attività__:

__Stato finale del sistema__:


### Quinto scenario

__Assunzioni__:

__Normale esecuzione:__

__Eventuali intoppi e comportamente relativi:__

__Altre attività__:

__Stato finale del sistema__:


## Design

### Casi d'uso

Descrizione
Immagine

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

Test d'accettazione

Copertura test d'unità