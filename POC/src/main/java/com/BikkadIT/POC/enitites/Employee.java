package com.BikkadIT.POC.enitites;

import lombok.*;

import javax.persistence.*;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;

    private String empName;
    private Long mgrId;
    private Double salary;

    @ManyToOne
    @JoinColumn(name = "deptId")
    private Department department;

}
