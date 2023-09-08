package info.salma.service;

import info.salma.entity.Department;

import java.util.List;

public interface DepartmentService {
    //save operation
    Department saveDepartment(Department department);

    //read operation
    List<Department> fetchDepartmentList();

    //Update operation
    Department updateDepartment(Department department, Long departmentId);

    // Delete Operation
    void deleteDepartmentById(Long departmentId);


}
