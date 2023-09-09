package info.salma.service;

import info.salma.entity.Department;
import info.salma.repository.DepartmentRepository;
import info.salma.request.DepartmentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;

    // Save operation
    @Override
    public Department saveDepartment(DepartmentRequest departmentRequest) {
        Department department = new Department();
        department.setDepartmentName(departmentRequest.getDepartmentName());
        department.setDepartmentAddress(departmentRequest.getDepartmentAddress());
        department.setDepartmentCode(departmentRequest.getDepartmentCode());
        return departmentRepository.save(department);
    }
    // read operation
    @Override
    public List<Department> fetchDepartmentList() {
        return (List<Department>)
                departmentRepository.findAll();
    }
    @Override
    public Department updateDepartment(Department department, Long departmentId) {

        Department depDB = departmentRepository.findById(departmentId).get();

        if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
            depDB.setDepartmentName(department.getDepartmentName());
        }

        if (Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
            depDB.setDepartmentAddress(department.getDepartmentAddress());
        }

        if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
            depDB.setDepartmentCode(department.getDepartmentCode());
        }
        return departmentRepository.save(depDB);
    }
    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }
}
