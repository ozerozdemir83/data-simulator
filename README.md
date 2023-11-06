# Asset Importer

This service reads asset configuration files and publishes events with add/update/delete operations

## Topic Information
- siemens.asset-model.core.1
- siemens.asset-model.metering.1

See doc/asyncapi.yaml for details

## Available Environment Variables
- KAFKA_SERVERS for connecting to Kafka  
- FILERETRIEVER_SOURCE local or s3  
- POSTGRE_HOST postgre endpoint  
- POSTGRE_PASSWORD password for postgre
- POSTGRE_USER user for postgre
- POSTGRE_DB database used by service  
- POSTGRE_PORT port for database connection
- SERVER_PORT port which the application serves from  
