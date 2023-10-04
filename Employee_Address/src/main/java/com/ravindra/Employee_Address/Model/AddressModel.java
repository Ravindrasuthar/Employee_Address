package com.ravindra.Employee_Address.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AddressModel {

    @Id
    private long addId;
    private String addStreet;
    private String addCity;
    private String addState;
    private String addZipcode;
}
