package com.self.matk.HexMapCreator.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "TAGS")
public class Tags {

    @Id
    @Column(name = "ID")
    private int ID;

    @Column(name = "MAP_REFERENCE_ID")
    private int Map_Reference_Id;

    @Column(name = "TITLE")
    private String Title;

    @Column(name = "COLOR")
    private String Color;
}
