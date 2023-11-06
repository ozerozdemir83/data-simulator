package com.siemens.spfts.datasimulator.model;



import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


/**
 * Analog Value
 */

@SqlResultSetMapping(name="Mapping.SdpAnalogDto",
        classes = @ConstructorResult(targetClass = SdpAnalogDto.class,
                columns = {
                        @ColumnResult(name="reading_type"),
                        @ColumnResult(name="service_delivery_point_mrid")}))
@NamedNativeQuery(name="findAllAnalogValues",
        query = "select distinct an.reading_type, mt.service_delivery_point_mrid " +
                " from analog_value an , meter mt where an.meter_mrid = mt.mrid " +
                " group by mt.service_delivery_point_mrid , an.reading_type",
        resultSetMapping = "Mapping.SdpAnalogDto")
@NamedNativeQuery(name="findBySdpmRID",
        query = "select distinct an.reading_type, mt.service_delivery_point_mrid  " +
                " from analog_value an , meter mt where  mt.service_delivery_point_mrid = :sdpId" +
                " and an.meter_mrid = mt.mrid",
        resultSetMapping = "Mapping.SdpAnalogDto")

@Entity
@Setter
@Getter
@NoArgsConstructor
@SuperBuilder
public class AnalogValue extends IdentifiedObject {


    /**
     * Related reading type of the metering mapping
     */
    @Column(name = "reading_type")
    private String readingType;

    /**
     * Related reading id of metering mapping
     */
    @Column(name = "reading_id")
    private String readingId;

    /***
     * Analog ID of the analog value
     */
    @Column(name = "analog_id")
    private String analogId;
}
