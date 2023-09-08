package info.salma.controller;

import info.salma.entity.Department;
import info.salma.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    //save operation
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody @Valid Department department) {
        return departmentService.saveDepartment(department);
    }
    //Read operation
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        return departmentService.fetchDepartmentList();
    }
    // Update operation
    @PutMapping("/departments/{id}")
    public Department updateDepartment(@RequestBody Department department, @PathVariable("id") Long departmentId) {
        return departmentService.updateDepartment(department,departmentId);
    }
    // Delete operation
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentID) {
        departmentService.deleteDepartmentById(departmentID);
        return "Deleted Successfully";
    }
}
