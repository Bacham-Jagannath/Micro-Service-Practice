package com.cg.department.controller;

import com.cg.department.entity.Department;
import com.cg.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{deptId}")
    public Department findDepartmentById(@PathVariable("deptId") Long deptId){
        log.info("Inside findDepartmentById method of DepartmentController");
        return departmentService.findDepartmentById(deptId);
    }
}
