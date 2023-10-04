package com.ravindra.Employee_Address.Controller;

import com.ravindra.Employee_Address.Model.EmployeeModel;
import com.ravindra.Employee_Address.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("Employee")
    public String AddEmployee(@RequestBody EmployeeModel employeeModel)
    {
        return employeeService.AddEmployee(employeeModel);
    }

    @GetMapping("all/employees")
    public List<EmployeeModel> GetAllEmployees()
    {
        return employeeService.GetAllEmployees();
    }

    @GetMapping("employee/by/{Id}")
    public EmployeeModel GetEmployeeById(@PathVariable long Id)
    {
        return employeeService.GetEmployeeById(Id);
    }

    @PutMapping("employee/by/id")
    public String UpdateEmployeeById(@RequestBody EmployeeModel employeeModel)
    {
        return employeeService.UpdateEmployeeById(employeeModel);
    }

    @DeleteMapping("employee/by/{Id}")
    public String DeleteEmployeeById(@PathVariable long Id)
    {
        return employeeService.DeleteEmployeeById(Id);
    }
}
