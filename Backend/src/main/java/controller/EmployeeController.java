package controller;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.EmployeeRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @PostMapping("/pemployees")
    public ResponseEntity addExpense(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }
}


