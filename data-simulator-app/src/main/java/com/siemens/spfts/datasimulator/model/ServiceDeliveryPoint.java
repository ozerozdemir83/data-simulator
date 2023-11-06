package com.siemens.spfts.datasimulator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * A usage point which isSdp boolean is true
 * and has one meter for the spearhead model
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class ServiceDeliveryPoint extends IdentifiedObject {

    @Column(name = "connection_point_mrid")
    private String connectionPointMrid;


}
