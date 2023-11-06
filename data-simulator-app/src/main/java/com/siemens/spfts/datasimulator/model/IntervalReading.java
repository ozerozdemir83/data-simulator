package com.siemens.spfts.datasimulator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.*;

/**
 * Reading of the device
 */
@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class IntervalReading implements Serializable {

    /**
     * end time
     */
    @JsonProperty("endTime")
    private String endTime;


    /**
     * source of measurement
     */
    private String source;

    /**
     * measurement value
     */
    @JsonProperty("value")
    private Double value;


    /**
     * is used for logging
     *
     * @return a traceable explanation of the object
     */
    @Override
    public String toString() {
        return "Reading{" +
                "endTime='" + endTime + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

