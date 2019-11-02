package com.han.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.han.bean.Student;
import com.han.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	//查询全部学生信息
	@RequestMapping("/index")
	public String  select(Student student,Model model){
		List<Student> list=studentService.selectAllStudent(student);
		model.addAttribute("list", list);
		
		return "success";		
	}
	
	//跳转到添加页面
	@RequestMapping("/index/toAdd")
	public String toadd(Student student){
		return "test";
		
	}
	
	//添加学生信息
	@RequestMapping("/index/addOrupdate")
	public  String addOrupdate(Student student){
		if(student.getId()==null){
			studentService.addStudent(student);
		}else{
			
			studentService.updateStudent(student);
		}
		
		return "redirect:/index";//重定向
	}
	
	//删除学生信息
	
	@RequestMapping("/index/delete")
	public String delect(@RequestParam("id")Integer id){
		
		studentService.delectStudent(id);
		
		return "redirect:/index";
		
		
	}
	//修改学生信息
	@RequestMapping("index/update")
	public String update(@RequestParam("id")Integer id,Model model ){
		Student student=studentService.selectStudentById(id);
		model.addAttribute("student", student);
		return "test";
		
		
		
	}
	

}
