package com.kabul.demo;

import com.kabul.demo.Model.Employee;
import com.kabul.demo.Model.Employer;
import com.kabul.demo.Model.Skill;
import com.kabul.demo.Repository.EmployeeRepository;
import com.kabul.demo.Repository.EmployerRepository;
import com.kabul.demo.Repository.SkillRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	SkillRepository skillRepository;

	@Autowired
	EmployerRepository employerRepository;

	@PostConstruct
	private void loadData() {
		List<Skill> skills = new ArrayList<>();
		List<Employee> employees = new ArrayList<>();

		// Create 100 skills
		for (int i = 1; i <= 100; i++) {
			Skill skill = new Skill("Skill " + i, new HashSet<>(), new HashSet<>());
			skillRepository.save(skill);
			skills.add(skill);
		}

		// Create 500 employees with 5 random skills each
		for (int i = 1; i <= 500; i++) {
			Set<Skill> employeeSkills = new HashSet<>();
			Collections.shuffle(skills);
			for (int j = 0; j < 5; j++) {
				employeeSkills.add(skills.get(j));
			}
			Employee employee = new Employee("Employee " + i, "Lastname " + i, employeeSkills);
			employeeRepository.save(employee);
			employees.add(employee);
		}

		Employer employer1 = new Employer("Acme Inc.", new HashSet<>());
		Employer employer2 = new Employer("Globex Corporation", new HashSet<>());
		Employer employer3 = new Employer("Wayne Enterprises", new HashSet<>());

		employerRepository.save(employer1);
		employerRepository.save(employer2);
		employerRepository.save(employer3);
	}
	@Configuration
	public class MvcConfig implements WebMvcConfigurer {
		@Override
		public void addResourceHandlers(ResourceHandlerRegistry registry) {
			registry.addResourceHandler("/**")
					.addResourceLocations("classpath:/static/");
		}
	}
}
