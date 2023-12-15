package com.BikkadIT.POC.controller;

import com.BikkadIT.POC.dtos.DepartmentDto;
import com.BikkadIT.POC.enitites.Branch;
import com.BikkadIT.POC.enitites.Department;
import com.BikkadIT.POC.enitites.Employee;
import com.BikkadIT.POC.services.BranchService;
import com.BikkadIT.POC.services.DepartmentService;
import com.BikkadIT.POC.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// ApiController.java
@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private BranchService branchService;

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/branch")
    public Branch createBranch(@RequestBody Branch branch) {
        return branchService.createBranch(branch);
    }

//    @PostMapping("/department")
//    public Department createDepartment(@RequestBody DepartmentDto departmentDto) {
//        return departmentService.createDepartment(DepartmentDto);
//    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

//    @PostMapping("/branchanddepartments")
//    public List<Department> createBranchWithDepartments(@RequestBody BranchWithDepartmentsRequest request) {
//        Branch branch = branchService.createBranch(request.getBranch());
//        return branchService.createBranchWithDepartments(branch, request.getDepartments());
//    }
//    @GetMapping("/employeesbydept/{branchId}")
//    public List<Employee> getEmployeesByDeptIdForBranch(@PathVariable Long branchId) {
//        return employeeService.getEmployeesByDeptIdForBranch(branchId);
//    }
//
//    @GetMapping("/employeesbymgr/{mgrId}")
//    public List<Employee> getEmployeesByMgrId(@PathVariable Long mgrId) {
//        return employeeService.getEmployeesByMgrId(mgrId);
//    }
//
//    @GetMapping("/employeeshighestsalary")
//    public List<Employee> getEmployeesWithHighestSalaryInEachDepartment() {
//        return employeeService.getEmployeesWithHighestSalaryInEachDepartment();
//    }
}


