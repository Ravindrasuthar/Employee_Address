package com.ravindra.Employee_Address.Controller;

import com.ravindra.Employee_Address.Model.AddressModel;
import com.ravindra.Employee_Address.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String AddAddress(@RequestBody AddressModel addressModel)
    {
        return addressService.AddAddress(addressModel);
    }

    @GetMapping("all/address")
    public List<AddressModel> GetAllAddress()
    {
        return addressService.GetAllAddress();
    }

    @GetMapping("address/by/{Id}")
    public AddressModel GetAddressById(@PathVariable long Id)
    {
        return addressService.GetAddressById(Id);
    }

    @PutMapping("address")
    public String UpdateAddressById(@RequestBody AddressModel addressModel)
    {
        return addressService.UpdateAddressById(addressModel);
    }

    @DeleteMapping("address/by/{Id}")
    public String DeleteAddressById(@PathVariable long Id)
    {
        return addressService.DeleteAddressById(Id);
    }
}
