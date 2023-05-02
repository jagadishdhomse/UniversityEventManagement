package com.university.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.dto.StudentModel;

public interface StudentModelRepository extends JpaRepository<StudentModel, Integer>  {
	public List<StudentModel> findByFirstname(String firstname);
 
}
