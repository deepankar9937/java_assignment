package com.te.student.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.student.bean.StudentDetails;
import com.te.student.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/login")
	public String login() {
		return "login";

	}

	@PostMapping("/login")
	public String login(int id, String password, ModelMap map, HttpServletRequest request) {
		StudentDetails details = service.login(id, password);
		HttpSession session = request.getSession();
		session.setAttribute("loggedIn", details);
		if (details != null) {
			map.addAttribute("name", details.getName());
			return "welcome";
		} else {
			map.addAttribute("errMessage", "Invalid Credencial");
			return "login";
		}
	}

	@GetMapping("/home")
	public String homePage(@SessionAttribute(name = "loggedIn", required = false) StudentDetails details,
			ModelMap map) {
		if (details != null) {
			map.addAttribute("name", details.getName());
			return "welcome";
		} else {
			map.addAttribute("errMessage", "Please login Again");
			return "login";
		}

	}

	@GetMapping("/add")
	public String addStudent(ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) StudentDetails details) {
		if (details != null) {
			return "addstudent";
		} else {
			map.addAttribute("errMessage", "Please login Again");
			return "login";
		}

	}

	@PostMapping("/add")
	public String addStudent(StudentDetails details, ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) StudentDetails sessiondetails) {
		if (sessiondetails != null) {
			if (service.addStudent(details)) {
				map.addAttribute("msg", "Data Inserted Successfully");
			} else {
				map.addAttribute("msg", "Something Went Worg");
			}
			return "addstudent";
		} else {
			map.addAttribute("errMessage", "Please login Again");
			return "login";
		}
	}

	@GetMapping("/delete")
	public String deleteStudent(ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) StudentDetails details) {
		if (details != null) {
			return "deletestudent";
		} else {
			map.addAttribute("errMessage", "Please login Again");
			return "login";
		}

	}

	@PostMapping("/delete")
	public String addStudent(int id, ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) StudentDetails sessiondetails) {
		if (sessiondetails != null) {
			if (service.deleteStudent(id)) {
				map.addAttribute("msg", "Student Deleted Successfully");
			} else {
				map.addAttribute("msg", "Student Id is not Present for "+id);
			}
			return "deletestudent";
		} else {
			map.addAttribute("errMessage", "Please login Again");
			return "login";
		}
	}
	
	@GetMapping("/getstudent")
	public String getDetail(ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) StudentDetails details) {
		if (details != null) {
			return "showdetails";
		} else {
			map.addAttribute("errMessage", "Please login Again");
			return "login";
		}

	}
	
	@PostMapping("/getstudent")
	public String getDetails(int id, ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) StudentDetails sessiondetails) {
		if (sessiondetails != null) {
			StudentDetails details = service.getData(id);
			if (details != null) {
				map.addAttribute("data", details);
			} else {
				map.addAttribute("errmsg", "Id is not Present");
			}
			return "showdetails";
		} else {
			map.addAttribute("errMessage", "Please LogIn First");
			return "login";
		}

	}
	
	@GetMapping("/allstudent")
	public String allEmployee(ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) StudentDetails sessiondetails) {
		if (sessiondetails != null) {
			List<StudentDetails> details = service.allEmpData();
			if (details != null) {
				map.addAttribute("alldata", details);
			} else {
				map.addAttribute("err", "No Data is Present");
			}
			return "allstudent";
		} else {
			map.addAttribute("errMessage", "Please LogIn First");
			return "login";
		}
	}
	
	
	@GetMapping("/update")
	public String update(ModelMap map, @SessionAttribute(name = "loggedIn", required = false) StudentDetails details) {
		if (details != null) {
			map.addAttribute("data", details);
			return "update";
		} else {
			map.addAttribute("errMessage", "Please LogIn First");
			return "login";
		}
	}

	@PostMapping("/update")
	public String updateData(ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) StudentDetails sessionDetails,
			StudentDetails details,HttpSession session) {
		if (sessionDetails != null) {
			if (service.updateData(details, sessionDetails.getId())) {
//				map.addAttribute("name", sessionDetails.getName());
				map.addAttribute("errMessage", "Data updated Successfully Please Login Again");
				session.invalidate();
				return "login";
			} else {
				map.addAttribute("msg", "Something Went Worng");
				return "welcome";
			}
			
		} else {
			map.addAttribute("errMessage", "Please LogIn First");
			return "login";
		}
	}
	
	
	@GetMapping("/logout")
	public String logout(ModelMap map, HttpSession session) {
		map.addAttribute("errMessage", "Logout Successfully");
		session.invalidate();
		return "login";
	}
}
