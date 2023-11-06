package com.siemens.spfts.datasimulator.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.siemens.spfts.datasimulator.common.Constants;
import com.siemens.spfts.datasimulator.model.AnalogMeterReadingDto;
import com.siemens.spfts.datasimulator.model.MeterReadingDto;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FileOperationsService {

    public void createJsonFile(List<MeterReadingDto> meterReadingMessages) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        AnalogMeterReadingDto analogMeterReadingDto = AnalogMeterReadingDto.builder().meterReadingDtoList(meterReadingMessages).build();
        String jsonArray= mapper.writeValueAsString(analogMeterReadingDto);
        try {

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Constants.METER_READING_FILE_NAME));
            for(int i=0;i<meterReadingMessages.size();i++) {
                bufferedWriter.write(jsonArray);
                bufferedWriter.flush();
            }
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException ioException) {
            throw new RuntimeException(ioException);
        }
    }
}
