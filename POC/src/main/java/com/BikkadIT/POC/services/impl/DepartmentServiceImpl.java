package com.BikkadIT.POC.services.impl;

import com.BikkadIT.POC.dtos.DepartmentDto;
import com.BikkadIT.POC.enitites.Department;
import com.BikkadIT.POC.repositories.DepartmentRepository;
import com.BikkadIT.POC.services.DepartmentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public DepartmentDto createDepartment(DepartmentDto departmentDto) {
        Department department = this.modelMapper.map(departmentDto, Department.class);
        Department saveddeprt = this.departmentRepository.save(department);
        return  this.modelMapper.map(saveddeprt,DepartmentDto.class);
    }

    @Override
    public Department updateDepartment(DepartmentDto departmentDto, Long deptId) {
        return null;
    }
}
