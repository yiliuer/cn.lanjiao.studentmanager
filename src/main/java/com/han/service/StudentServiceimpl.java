package com.han.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.han.bean.Student;
import com.han.mapper.StudentMapper;

@Service
public class StudentServiceimpl implements StudentService {
	
	@Autowired
    private StudentMapper studentMapper;
	
	@Override
	public List<Student> selectAllStudent(Student student) {

		return studentMapper.selectAllStudent(student);
	}

	@Override
	public int addStudent(Student student) {
		
		return studentMapper.addStudent(student);
	}


	@Override
	public int updateStudent(Student student) {
		return studentMapper.updateStudent(student);
	}

	@Override
	public int delectStudent(Integer id) {
		
		return studentMapper.delectStudent(id);
	}

	@Override
	public Student selectStudentById(Integer id) {
		return studentMapper.selectStudentById(id);
	}

}
