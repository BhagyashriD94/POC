package com.BikkadIT.POC.controller;

import com.BikkadIT.POC.dtos.DepartmentDto;
import com.BikkadIT.POC.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/department")
    public ResponseEntity<DepartmentDto> createDepartment(@RequestBody DepartmentDto departmentDto){
        DepartmentDto department = this.departmentService.createDepartment(departmentDto);
    return new ResponseEntity<>(department, HttpStatus.CREATED);
    }

}
