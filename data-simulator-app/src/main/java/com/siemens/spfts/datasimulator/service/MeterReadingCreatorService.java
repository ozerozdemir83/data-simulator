package com.siemens.spfts.datasimulator.service;

import com.siemens.spfts.datasimulator.common.Constants;
import com.siemens.spfts.datasimulator.model.*;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service

public class MeterReadingCreatorService {

    /**
     * time format of performance test data
     */
    private final String timeFormat = "yyyy-MM-dd HH:mm:ss.SSSSSS'Z'";

    /**
     * date formatter of performance test data
     */
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(timeFormat)
            .withZone(ZoneId.from(ZoneOffset.UTC));
    public List<MeterReadingDto> createMeterReadingMessageForSdp(List<SdpAnalogDto> sdpAnalogDtoList) {
        List<MeterReadingDto> meterReadings= new ArrayList<>();
        int index=0;
        MeterReadingDto meterReadingDto=null;
        List<IntervalBlock> intervalBlockList = new ArrayList<>();
        IntervalBlock intervalBlock=null;
        for(SdpAnalogDto sdpAnalogDto: sdpAnalogDtoList) {
             meterReadingDto = MeterReadingDto.builder().
                    usagePointDto(UsagePointDto.builder().mRID(sdpAnalogDtoList.get(0).getServiceDeliveryPointMrId()).build()).build();
            intervalBlock = IntervalBlock.builder().readingType(sdpAnalogDto.getReadingType()).
                    intervalReadingList(new ArrayList<>()).build();
            for (int i = 0; i < Constants.MESSAGE_NUMBER; i++) {
                String startTime = dateTimeFormatter.format(ZonedDateTime.ofInstant(Instant.now(), ZoneOffset.UTC));
                Double measurementValue = Math.floor(Math.random() * 10) + 0.20;
                IntervalReading intervalReading = IntervalReading.builder().endTime(startTime).value(measurementValue).source("MDM").build();
                intervalBlock.getIntervalReadingList().add(intervalReading);
                index++;
                if (index == sdpAnalogDtoList.size()) {
                    index = 0;

                }
            }
            intervalBlockList.add(intervalBlock);
        }
        meterReadingDto.setIntervalBlockList(intervalBlockList);
        meterReadings.add(meterReadingDto);
        return meterReadings;
    }
}
