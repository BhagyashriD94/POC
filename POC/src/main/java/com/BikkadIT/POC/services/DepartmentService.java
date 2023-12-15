package com.BikkadIT.POC.services;

import com.BikkadIT.POC.dtos.DepartmentDto;
import com.BikkadIT.POC.enitites.Department;


public interface DepartmentService {
    DepartmentDto createDepartment(DepartmentDto departmentDto);

    Department updateDepartment(DepartmentDto departmentDto,Long deptId);
    // other methods
}
