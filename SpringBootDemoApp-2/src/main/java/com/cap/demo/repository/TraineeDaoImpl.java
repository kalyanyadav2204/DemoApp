package com.cap.demo.repository;


	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.PersistenceContext;
	import javax.persistence.Query;

	import org.springframework.stereotype.Repository;

	import com.cap.demo.entity.Trainee;

	/**
	 * @author KALYAN
	 *
	 */
	@Repository
	public class TraineeDaoImpl implements TraineeDao {

		@PersistenceContext
		EntityManager entityManager;

		public int addTrainee(Trainee trainee) {
			entityManager.persist(trainee);
			return trainee.getTraineeId();
		}
		public Trainee updateTrainee(Trainee trainee) {
			return entityManager.merge(trainee);
		}

		public void removeTrainee(int traineeId) {
			Trainee trainee = entityManager.find(Trainee.class, traineeId);
			entityManager.remove(entityManager.merge(trainee));

		}

		public Trainee getTraineeById(int traineeId) {
			Trainee trainee = entityManager.find(Trainee.class, traineeId);
			return trainee;
		}

		public List<Trainee> getAllTrainees() {
			Query q = entityManager.createQuery("select e from Trainee e");
			List<Trainee> l = q.getResultList();
			return l;
		}

	}
		