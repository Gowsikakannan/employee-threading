
package com.example.employee.controller;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/process")
    public CompletableFuture<Employee> processEmployee(
            @RequestBody Employee employee) {

        System.out.println("Controller Thread: "
                + Thread.currentThread().getName());

        return employeeService.processEmployee(employee);
    }
}
