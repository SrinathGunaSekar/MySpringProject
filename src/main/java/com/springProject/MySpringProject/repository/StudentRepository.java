package com.springProject.MySpringProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springProject.MySpringProject.entity.Student;

public interface StudentRepository extends JpaRepository<Student , Integer> {

	
}
