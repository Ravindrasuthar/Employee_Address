package com.ravindra.Employee_Address.Service;

import com.ravindra.Employee_Address.Model.EmployeeModel;
import com.ravindra.Employee_Address.Repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    IEmployeeRepo employeeRepo;

    public String AddEmployee(EmployeeModel employeeModel) {
        employeeRepo.save(employeeModel);
        return "Employee Added";
    }

    public List<EmployeeModel> GetAllEmployees() {
        return (List<EmployeeModel>) employeeRepo.findAll();
    }

    public EmployeeModel GetEmployeeById(long Id) {
        return employeeRepo.findById(Id).orElseThrow();
    }

    public String UpdateEmployeeById(EmployeeModel employeeModel) {
        List<EmployeeModel> emp = (List<EmployeeModel>) employeeRepo.findAll();
        for(EmployeeModel e : emp)
        {
            if(e.getEmpId()==employeeModel.getEmpId()) {
                employeeRepo.save(employeeModel);
                return "Employee with id"+employeeModel.getEmpId()+"is Updated";
            }
        }
        return "Employee with id"+employeeModel.getEmpId()+"can not be updated";
    }

    public String DeleteEmployeeById(long id) {
        employeeRepo.deleteById(id);
        return "Employee deleted";
    }
}
