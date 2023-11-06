package com.siemens.spfts.datasimulator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.*;

/**
 * Container for meter readings
 */
@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class UsagePointDto implements Serializable {

    /**
     * mRID
     */
    @JsonProperty("mRID")
    private String mRID;

    /**
     * is used for logging
     *
     * @return a traceable explanation of the object
     */
    @Override
    public String toString() {
        return "UsagePointDto{" +
                "mRID='" + mRID + '\'' +
                '}';
    }

}

