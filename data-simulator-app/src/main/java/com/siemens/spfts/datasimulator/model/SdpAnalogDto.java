package com.siemens.spfts.datasimulator.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * cache object of meter readings
 */
@Getter
@Setter
@Builder
public class SdpAnalogDto {


    /**
     * reading id of meter reading
     */
    private String readingType;
    /**
     * service delivery point of meter reading
     */
    private String serviceDeliveryPointMrId;


    /**
     *  constructor of cache object with mRID
     */
    public SdpAnalogDto(String readingType, String serviceDeliveryPointMrId) {
        this.readingType = readingType;
        this.serviceDeliveryPointMrId = serviceDeliveryPointMrId;
    }

}
