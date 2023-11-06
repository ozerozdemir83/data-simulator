package com.siemens.spfts.datasimulator.model;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * This is a root class to provide common identification for all classes needing identification and naming attributes.
 */
@MappedSuperclass
@NoArgsConstructor
@SuperBuilder
@Setter
@Getter
public class IdentifiedObject implements Serializable {

    private static final long serialVersionUID = -2343243243242432341L;

    /**
     * Master resource identifier issued by a model authority. The mRID is unique within an exchange context.
     */

    @Id
    @Column(name = "mrid", unique = true)
    private String mRID;


    /**
     * The name is any free human readable and possibly non unique text naming the object.
     */
    @Column(name = "name")
    private String name;

}
