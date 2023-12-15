package com.BikkadIT.POC.repositories;

import com.BikkadIT.POC.enitites.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByDepartment_DeptId(Long deptId);
    List<Employee> findByMgrId(Long mgrId);
    List<Employee> findTopByDepartmentOrderBySalaryDesc(Long deptId);
}
