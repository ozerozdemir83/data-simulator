package com.siemens.spfts.datasimulator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import lombok.*;

/**
 * Container for meter readings
 */
@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class AnalogMeterReadingDto implements Serializable {

    /**
     * meter reading of the device
     */
    @JsonProperty("meterReading")
    private List<MeterReadingDto> meterReadingDtoList;

    /**
     * is used for logging
     *
     * @return a traceable explanation of the object
     */
    @Override
    public String toString() {
        return "AnalogMeterReadingDto{" +
                "meterReading=" + meterReadingDtoList +
                '}';
    }
}

