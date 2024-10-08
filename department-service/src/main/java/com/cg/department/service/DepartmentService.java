package com.cg.department.service;

import com.cg.department.entity.Department;
import com.cg.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of DepartmentService ");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long deptId) {
        log.info("Inside findDepartmentById method of DepartmentService ");
        return departmentRepository.findByDeptId(deptId);
    }
}
