package com.siemens.spfts.datasimulator.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.siemens.spfts.datasimulator.model.MeterReadingDto;
import com.siemens.spfts.datasimulator.model.SdpAnalogDto;
import com.siemens.spfts.datasimulator.service.AnalogValueService;
import com.siemens.spfts.datasimulator.service.FileOperationsService;
import com.siemens.spfts.datasimulator.service.MeterReadingCreatorService;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Getter
@Setter
@RequiredArgsConstructor
public class MeterReadingController {

    private final AnalogValueService analogValueService;

    private final MeterReadingCreatorService meterReadingCreatorService;

    private final FileOperationsService fileOperationsService;


    @GetMapping("/createMeterReadingByAllSdps")
    public void createMeterReadingByAllSdps() {
     /*   List<SdpAnalogDto> sdpAnalogDtoList= analogValueService.findAllAnalogValues();
        List<String> meterReadingMessages = meterReadingCreatorService.createMeterReadingMessage(sdpAnalogDtoList);
        fileOperationsService.createJsonFile(meterReadingMessages);*/


    }
    @GetMapping("/createMeterReadingBySdpId")
    public void createMeterReadingBySdpId(@RequestParam(value = "sdpId") String sdpId) throws JsonProcessingException {
        List<SdpAnalogDto> sdpAnalogDtoList= analogValueService.
                findBySdpMRID(SdpAnalogDto.builder().serviceDeliveryPointMrId(sdpId).build());
        List<MeterReadingDto> meterReadingMessages = meterReadingCreatorService.createMeterReadingMessageForSdp(sdpAnalogDtoList);
        fileOperationsService.createJsonFile(meterReadingMessages);
    }
}
