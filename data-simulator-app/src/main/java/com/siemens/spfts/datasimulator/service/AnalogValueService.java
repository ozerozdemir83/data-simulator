package com.siemens.spfts.datasimulator.service;

import com.siemens.spfts.datasimulator.model.SdpAnalogDto;
import com.siemens.spfts.datasimulator.repository.AnalogValueRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AnalogValueService {

    private final AnalogValueRepository analogValueRepository;



    /**
     * Gets the mapped analog value by looking the
     * meter id and reading type
     *
     * @return List of sdpAnalogDto
     */
    public List<SdpAnalogDto> findAllAnalogValues() {
        return  analogValueRepository.findAllAnalogValues();

    }
    /**
     * Gets the mapped analog value by looking the
     * meter id and reading type
     *
     * @param sdpAnalogDto    analog value of service
     * @return Optional Analog Value MRID
     */
    public List<SdpAnalogDto> findBySdpMRID(SdpAnalogDto sdpAnalogDto) {
        return analogValueRepository.findBySdpMRID(sdpAnalogDto.getServiceDeliveryPointMrId());
    }
}
