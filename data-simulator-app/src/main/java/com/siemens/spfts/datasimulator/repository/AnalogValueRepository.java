package com.siemens.spfts.datasimulator.repository;

import com.siemens.spfts.datasimulator.model.AnalogValue;
import com.siemens.spfts.datasimulator.model.SdpAnalogDto;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Repository for CRUD operations
 * of the analog value
 */
@Repository
public interface AnalogValueRepository extends CrudRepository<AnalogValue, String> {

    /**
     * For finding the mapped analog value

     * @return Analog Value
     */
    @Query(nativeQuery = true,name = "findBySdpmRID")
    List<SdpAnalogDto> findBySdpMRID(@Param("sdpId")String sdpMRID);



    /**
     * For finding the mapped analog value
     *
     * @return Analog Value
     */
   @Query(nativeQuery = true,name = "findAllAnalogValues")
   List<SdpAnalogDto> findAllAnalogValues();


}
