package com.self.matk.HexMapCreator.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "hexNodes")
public class HexNodes {

    @Id
    @Column(name = "ID")
    private int ID;

    @Column(name = "MAP_REFERENCE_ID")
    private int Map_Reference_ID;

    @Column(name = "X_AXIS")
    private int X_Axis;

    @Column(name = "Y_AXIS")
    private int Y_Axis;

    @Column(name = "TITLE")
    private String Title;

    @Column(name = "DESCRIPT")
    private String Description;
}
