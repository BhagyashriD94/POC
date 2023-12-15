package com.BikkadIT.POC.services.impl;

import com.BikkadIT.POC.enitites.Branch;
import com.BikkadIT.POC.enitites.Department;
import com.BikkadIT.POC.services.BranchService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BranchServiceImpl implements BranchService {
    @Override
    public Branch createBranch(Branch branch) {
        return null;
    }

    @Override
    public List<Department> createBranchWithDepartments(Branch branch, List<Department> departments) {
        return null;
    }
}
