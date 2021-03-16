package com.capgemini.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity // @Service,@Component
@Table(name = "capemptable")
public class Employee implements Serializable {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Integer salary;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public Employee(Integer id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}
