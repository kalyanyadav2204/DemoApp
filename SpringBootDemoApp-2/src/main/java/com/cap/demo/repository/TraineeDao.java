package com.cap.demo.repository;

import java.util.List;

import com.cap.demo.entity.Trainee;

public interface TraineeDao {
	int addTrainee(Trainee trainee);

	Trainee updateTrainee(Trainee trainee);

	void removeTrainee(int traineeId);

	Trainee getTraineeById(int traineeId);

	List<Trainee> getAllTrainees();
}
