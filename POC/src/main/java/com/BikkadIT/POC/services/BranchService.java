package com.BikkadIT.POC.services;

import com.BikkadIT.POC.enitites.Branch;
import com.BikkadIT.POC.enitites.Department;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BranchService {
    Branch createBranch(Branch branch);
    List<Department> createBranchWithDepartments(Branch branch, List<Department> departments);

}
