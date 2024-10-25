package com.self.matk.HexMapCreator.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "MAPS")
public class Maps {

    @Id
    @Column(name = "ID")
    private int ID;

    @Column(name = "ACCOUNT_ID")
    private int Account_Id;

    @Column(name = "TITLE")
    private String Title;

    @Column(name = "DESCRIPT")
    private String Description;

}
