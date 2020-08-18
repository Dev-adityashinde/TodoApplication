package nit.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import nit.spring.model.Employee;
import nit.spring.service.IService;

@Controller
@RequestMapping("/emp")
public class TodoController {

	@Autowired
	private IService service;
	
	@PostMapping("/save")
	public String Insert(@ModelAttribute Employee employee,Model model)
	{
		Integer id=service.Save(employee);
		model.addAttribute("id",id);
		List<Employee> emp=service.GetAll();
		model.addAttribute("emp",emp);
		return "Data";
	}
	
	@GetMapping("/show")
	public String show()
	{
		return "Data";
	}
	
	@GetMapping("/Auth")
	public String Auth()
	{
		return"Auth";
	}
	
	@PostMapping("/Verify")
	public String Verifying(@ModelAttribute Employee emp)
	{
		boolean result=service.Exist(emp.getEmpId());
		System.out.println(result);
		boolean employee=service.OneRecord(emp.getEmpId());
		
		if(result==true&&employee==true)
		{
			return "Data";
		}
		else
		{
			return"Auth";
		}
	}
}
