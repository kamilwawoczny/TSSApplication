package com.WebApplication3KW.controller;

import com.WebApplication3KW.dto.EmployeeDTO;
import com.WebApplication3KW.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor
public class RestController {
    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public List<EmployeeDTO> getEmployees() {
        return employeeService.getEmployeeList();
    }

    @GetMapping("/employee/{id}")
    public EmployeeDTO getEmployee(@PathVariable Integer id) {
        return employeeService.getParticularEmployee(id);
    }
}
