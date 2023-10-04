package com.ravindra.Employee_Address.Service;

import com.ravindra.Employee_Address.Model.AddressModel;
import com.ravindra.Employee_Address.Model.EmployeeModel;
import com.ravindra.Employee_Address.Repo.IAddressRepo;
import com.ravindra.Employee_Address.Repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    @Autowired
    IEmployeeRepo employeeRepo;

    public String AddAddress(AddressModel addressModel) {
        addressRepo.save(addressModel);
        return "Address Added";
    }

    public List<AddressModel> GetAllAddress() {
        return (List<AddressModel>) addressRepo.findAll();
    }

    public AddressModel GetAddressById(long id) {
        return addressRepo.findById(id).orElseThrow();
    }

    public String UpdateAddressById(AddressModel addressModel) {
        List<AddressModel> add = (List<AddressModel>) addressRepo.findAll();
        for(AddressModel ad : add)
        {
            if(ad.getAddId() == addressModel.getAddId())
            {
                addressRepo.save(addressModel);
                return "Address Updated";
            }
        }
        return "Address can not be updated";
    }

    public String DeleteAddressById(long id) {
        AddressModel addressModel = addressRepo.findById(id).get();
        EmployeeModel employeeModel = employeeRepo.findByaddressModel(addressModel);
        if(employeeModel!=null)
        {
            employeeRepo.delete(employeeModel);
        }
        addressRepo.deleteById(id);
        return "address deleted";
    }
}
