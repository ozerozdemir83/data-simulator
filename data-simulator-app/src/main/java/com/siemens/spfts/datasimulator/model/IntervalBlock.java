package com.siemens.spfts.datasimulator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import lombok.*;

/**
 * Interval objects which contains readings for meters
 */
@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class IntervalBlock implements Serializable {

    /**
     * reading type can be a concatenation form of EquipmentType and EquipmentId
     */
    @JsonProperty("readingType")
    private String readingType;

    /**
     * reading of the device
     */
    @JsonProperty("intervalReading")
    private List<IntervalReading> intervalReadingList;
}