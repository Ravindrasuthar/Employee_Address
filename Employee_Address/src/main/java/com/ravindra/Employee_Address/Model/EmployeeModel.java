package com.ravindra.Employee_Address.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EmployeeModel {

    @Id
    private long empId;
    private String empFirstName;
    private String empLastName;

    @OneToOne
    @JoinColumn(name = "fk-address")
    AddressModel addressModel;
}
