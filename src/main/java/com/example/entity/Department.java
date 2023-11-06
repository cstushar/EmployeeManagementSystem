package com.example.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document(collection = "departments")
public class Department {
    @Id
    private String departmentId;
    private String departmentName;
    private Instant createdAt;
    private Instant updatedAt;

    // Constructors, getters, and setters

    public Department() {
        this.createdAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.createdAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    // Getters and setters

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }
}
