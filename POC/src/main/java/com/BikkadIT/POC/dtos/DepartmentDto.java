package com.BikkadIT.POC.dtos;

import com.BikkadIT.POC.enitites.Branch;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepartmentDto {
    private Long deptId;
    private String deptName;
    private Branch branch;

}
