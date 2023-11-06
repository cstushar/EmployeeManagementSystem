package com.example.service;

import com.example.entity.Department;
import com.example.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

	@Autowired
    private final DepartmentRepository departmentRepository;

   // @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(String departmentId) {
        Optional<Department> departmentOptional = departmentRepository.findById(departmentId);
        return departmentOptional.orElse(null);
    }

    public Department updateDepartment(String departmentId, Department updatedDepartment) {
        Optional<Department> existingDepartmentOptional = departmentRepository.findById(departmentId);
        if (existingDepartmentOptional.isPresent()) {
            Department existingDepartment = existingDepartmentOptional.get();
            existingDepartment.setDepartmentName(updatedDepartment.getDepartmentName());
            return departmentRepository.save(existingDepartment);
        }
        return null; // Department with the given ID not found
    }

    public void deleteDepartment(String departmentId) {
        departmentRepository.deleteById(departmentId);
    }
}
