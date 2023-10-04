package com.ravindra.Employee_Address.Repo;

import com.ravindra.Employee_Address.Model.AddressModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<AddressModel, Long> {
}
