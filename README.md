# Project Name
Employee Address

# Frameworks and Language Used
**Spring Boot** 3.1.4
**Java** 17
**Maven** 3.8.1

# Data Flow


_**Controller:**_ The controller has endpoints for adding, updating, deleting a Employee, get all Employee, get Employee by id and adding, updating, deleting a Address, get all Address, get Address by id. 

The @PostMapping annotation is used for the add/Employee or add/Address endpoint to handle HTTP POST requests with a JSON request body containing a Employee or Address object.

```
 @PostMapping("Employee")
    public String AddEmployee(@RequestBody EmployeeModel employeeModel)
    {
        return employeeService.AddEmployee(employeeModel);
    }
```
```
 @PostMapping("address")
    public String AddAddress(@RequestBody AddressModel addressModel)
    {
        return addressService.AddAddress(addressModel);
    }
```

The @GetMapping annotation is used for the get/all/Employee, get/employee/by/{id} and get/all/address, get/address/by/{id} endpoints to handle HTTP GET requests with and without a path variable for the employee ID and address ID, respectively. The @PathVariable annotation is used to extract the Employee ID or Address ID from the request URL and pass it to the GetEmplyeeById or GetAddressById method.
```
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
```
```
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
```

The @PutMapping annotation is used for the update/employee and update/address endpoint to handle HTTP UPDATE requests with a requestbody as employee object or address object.
```
@PutMapping("employee")
    public String UpdateEmployeeById(@RequestBody EmployeeModel employeeModel)
    {
        return employeeService.UpdateEmployeeById(employeeModel);
    }
```
```
@PutMapping("address")
    public String UpdateAddressById(@RequestBody AddressModel addressModel)
    {
        return addressService.UpdateAddressById(addressModel);
    }
```

The @DeleteMapping annotation is used for the delete/employee/by/{Id} and delete/address/by/{Id} endpoint to handle HTTP DELETE requests with a path variable for the employee ID and address ID.
```
@DeleteMapping("employee/by/{Id}")
    public String DeleteEmployeeById(@PathVariable long Id)
    {
        return employeeService.DeleteEmployeeById(Id);
    }
```
```
@DeleteMapping("address/by/{Id}")
    public String DeleteAddressById(@PathVariable long Id)
    {
        return addressService.DeleteAddressById(Id);
    }
```

The controller class also has an autowired instance of the EmployeeService and AddressService interface to handle business logic for the Employee Address.

This implementation demonstrates a basic setup for a REST API controller in Spring Boot, but it can be expanded upon and customized based on specific requirements for the Employee Address.


_**Services**:_ The services layer contains the business logic of the application. It receives requests from the controller, performs necessary computations or data manipulations, and interacts with the repository layer to access data.

_**Repository:**_ The repository layer is responsible for interacting with the database. It uses Spring Data JPA to perform CRUD (create, read, update, delete) operations on entities.

In the application.properties all the text required for connection with MySQL database are written.
```
spring.datasource.url=jdbc:mysql://localhost:3306/Emp_DB
spring.datasource.username=root
spring.datasource.password=Ravi.067456
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true
```

# Database Structure Used
I have used MySQL as DataBase

# Project Summary
In this project i have created different endpoints, custom finders and @OneToOne mapping between employee and address model.
