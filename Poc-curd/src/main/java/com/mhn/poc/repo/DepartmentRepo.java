package com.mhn.poc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mhn.poc.entity.Department;
@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
