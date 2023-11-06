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
public class MeterReadingDto implements Serializable {

    /**
     * interval list which contains meter readings
     */
    @JsonProperty("intervalBlock")
    private  List<IntervalBlock> intervalBlockList;

    /**
     * Usage point
     */
    @JsonProperty("usagePoint")
    private UsagePointDto usagePointDto;

    /**
     * is used for logging
     * intervalBlock list size can be too long, so only size of it is used for now
     *
     * @return a traceable explanation of the object
     */
    @Override
    public String toString() {
        return "MeterReadingDto{" +
                "usagePointDto=" + usagePointDto +
                ", intervalBlock.size=" + intervalBlockList.size() +
                '}';
    }
}

