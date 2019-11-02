package com.han.service;  

import java.util.List;

import com.han.bean.Student;

public interface StudentService {
	List<Student> selectAllStudent(Student student);

	Student selectStudentById(Integer id);

	int addStudent(Student student);

	int delectStudent(Integer id);

	int updateStudent(Student student);

}
