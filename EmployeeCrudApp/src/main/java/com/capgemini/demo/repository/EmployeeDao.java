package com.capgemini.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao<Employee> extends JpaRepository<Employee, Integer> {
@Query("select min(salary) from Employee")
	List<Employee> getLowestSalary();
List<Employee> findBySalaryGreaterThan(int salary);
List<Employee> findBySalaryBetween(Integer intialSalary,Integer lastSalary);
}
//  CrudRepository->crud,
//	   |
//	PagingAndSortingRepository
//		|
//	JpaRepository



//persist,merge,find,remove,createQuery


//