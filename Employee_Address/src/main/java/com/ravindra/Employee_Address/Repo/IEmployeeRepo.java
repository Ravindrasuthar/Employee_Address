package com.ravindra.Employee_Address.Repo;

import com.ravindra.Employee_Address.Model.AddressModel;
import com.ravindra.Employee_Address.Model.EmployeeModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepo extends CrudRepository<EmployeeModel, Long> {
    EmployeeModel findByaddressModel(AddressModel addressModel);
}
