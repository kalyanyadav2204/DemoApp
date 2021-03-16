package com.capgemini.demo.service;

import java.util.List;
import java.util.Optional;

public interface EmployeeService<Employee> {

	List<Employee> getEmployees();

	Optional<Employee> getEmployeeById(Integer id);

	Employee addNewEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	void deleteEmployeeById(Integer id);

	List<Employee> getLowestSalary();

	 List<Employee> getSalaryBetween(Integer sal1, Integer sal2);


}
