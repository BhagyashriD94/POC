package com.BikkadIT.POC.enitites;


import lombok.*;

import javax.persistence.*;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deptId;
    @Column(name="dept_name")
    private String deptName;
    @ManyToOne
    @JoinColumn(name = "branchId")
    private Branch branch;


}
