
package com.example.employee.service;

import com.example.employee.model.Employee;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class EmployeeService {

    @Async
    public CompletableFuture<Employee> processEmployee(Employee employee) {

        System.out.println("Employee processing started...");
        System.out.println("Thread Name: "
                + Thread.currentThread().getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return CompletableFuture.failedFuture(e);
        }

        System.out.println("Employee processing completed!");

        return CompletableFuture.completedFuture(employee);
    }
}
