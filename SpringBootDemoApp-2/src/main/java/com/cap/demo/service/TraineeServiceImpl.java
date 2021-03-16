package com.cap.demo.service;
/**
 * 
 */


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.demo.entity.Trainee;
import com.cap.demo.repository.TraineeDao;

/**
 * @author KALYAN
 *
 */
@Service("service")//TraineeServiceImpl service=new TraineeServiceImpl()
@Transactional
public class TraineeServiceImpl implements TraineeService {

	@Autowired
	TraineeDao dao;

	public int addTrainee(Trainee trainee) {
		return dao.addTrainee(trainee);
	}

	public   Trainee updateTrainee(Trainee trainee) {
		 return dao.updateTrainee(trainee);
	}

	public void removeTrainee(int traineeId) {
		dao.removeTrainee(traineeId);
	}

	public Trainee getTraineeById(int traineeId) {
		return dao.getTraineeById(traineeId);
	}

	public List<Trainee> getAllTrainees() {

		return dao.getAllTrainees();
	}

	
}


	