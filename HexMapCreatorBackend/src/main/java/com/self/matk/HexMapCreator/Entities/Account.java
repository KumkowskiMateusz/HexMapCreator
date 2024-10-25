
package com.self.matk.HexMapCreator.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;


import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "ACCOUNTS")
public class Account {
    
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "Username")
    private String username;

    @Column(name = "Pass")
    private String password;

    @Column(name="Map_Amount")
    private int map_amount;

}
