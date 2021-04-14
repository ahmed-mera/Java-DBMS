# Getting Started

### Reference Documentation

i requisiti dell'elaborato, che dovrà essere consegnato entro il 19 Aprile alle 12:00.
---
Si trovi in allegato i file
comuni.csv
comuni.xls
Si tratta degli stessi dati. Nel file (1) sono salvati in un Comma Separated Values. Nel file (2) in un foglio excel.
Lo scopo dell'elaborato è di caricare i dati da uno qualsiasi dei due file all'interno di una tabella "comuni" che deve essere creata in un database.
Si chiede che il programma si connetta via JDBC (se scritto in linguaggio diverso da Java, che si connetta tramite ODBC) a un database (potrebbe essere, a esempio, MySql) e crei la tabella di destinazione dei dati (tabella da crearsi via codice, non tramite SQL eseguito da shell o client di connessione al DB). Questo lo schema della tabella:


``` code
id INT NOT NULL AUTO_INCREMENT,

name VARCHAR(255) NOT NULL,

slug VARCHAR(255) NOT NULL,

lat DECIMAL(10 , 2 ) NOT NULL,

lng DECIMAL(10 , 2 ) NOT NULL,

codice_provincia_istat INTEGER NOT NULL,

codice_comune_istat INTEGER NOT NULL,

codice_alfanumerico_istat INTEGER NOT NULL,

capoluogo_provincia BOOL NOT NULL,

capoluogo_regione BOOL NOT NULL,

PRIMARY KEY (id)

```

Il primo passaggio consiste quindi nel fare il deployment di un DB.

Dopo aver creato la tabella nel DB, il programma deve caricare tutte le righe di uno dei due file di dati e inserirle nella tabella medesima.

Per collegarsi al file di dati sorgente si può adottare la soluzione che si preferisce. A esempio, si può aprire il file in lettura e scorrerne le righe una alla volta. Oppure di può creare una connessione JDBC (oppure ODBC, a seconda del linguaggio scelto) al file excel tramite un driver apposito da cercarsi in rete.


