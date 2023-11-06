package com.siemens.spfts.datasimulator.common;

/**
 * A class for kafka messages format
 */
public class KafkaMessage {

    /**
     * meter reading kafka message format
     */
    public static final String METER_READING_EVENT_KAFKA_MESSAGE = "{" +
            "\"specversion\": \"1.0\"," +
            "\"type\": \"xrn:cet:mdm:changed.readingValues\"," +
            "\"time\": \"%s\"," +
            "\"id\": \"%s\"," +
            "\"source\": \"xrn:ces:ngm:mdm.elvia.1\"," +
            "\"datacontenttype\": \"application/json\"," +
            "\"data\": {" +
            "\"usagePoint\": {" +
            "\"mRID\": \"%s\"" +
            "}," +
            "\"intervalBlock\": [{" +
            "\"readingType\": \"%s\"," +
            "\"intervalReading\": [{" +
            "\"endTime\": \"%s\"," +
            "\"source\": \"MDM\"," +
            "\"value\": %s" +
            "}]" +
            "}]" +
            "}}";

}
