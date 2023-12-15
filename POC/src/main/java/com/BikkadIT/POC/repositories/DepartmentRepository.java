package com.BikkadIT.POC.repositories;

import com.BikkadIT.POC.enitites.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    List<Department> findByBranch_BranchId(Long branchId);
}
