package com.siemens.spfts.datasimulator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.Serializable;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 *  Describes envelope message structure
 */
@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class EnvelopeDto implements Serializable {

    @JsonProperty("id")
    private String id;

    @JsonProperty("source")
    private String source;

    @JsonProperty("specversion")
    private String specVersion;

    @JsonProperty("type")
    private String type;

    @JsonProperty("time")
    private String time;

    @JsonProperty("datacontenttype")
    private String dataContentType;

    @JsonProperty("data")
    private JsonNode data;

    @Override
    public String toString() {
        return "EnvelopeDto{" +
                "id='" + id + '\'' +
                ", source='" + source + '\'' +
                ", specVersion='" + specVersion + '\'' +
                ", type='" + type + '\'' +
                ", time='" + time + '\'' +
                ", dataContentType='" + dataContentType + '\'' +
                ", data=" + data +
                '}';
    }
}
