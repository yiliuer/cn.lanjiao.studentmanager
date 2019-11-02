package com.han.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.han.bean.Student;

@Mapper
public interface StudentMapper {
	List<Student> selectAllStudent(Student student);
	
	int addStudent(Student student);
	
	int updateStudent(Student student);
	
	int delectStudent(Integer id);
	Student selectStudentById(Integer id);
	
	

}
