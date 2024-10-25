package com.self.matk.HexMapCreator.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "TAGS")
public class TagList {
    @Id
    @Column(name = "ID")
    private int ID;

    @Column(name = "HEX_NODE_ID")
    private int Hex_Node_ID;

    @Column(name = "TAG_NODE_ID")
    private int Tag_Node_ID;

}
