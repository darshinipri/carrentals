package com.slk.carrentals.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import com.slk.carrentals.entities.BookingDetails;
import com.slk.carrentals.entities.Car;


@Repository
public class CustomerDetailsDaoImpl implements CustomerDetailsDao {
	@PersistenceContext
	private EntityManager manager;


	@SuppressWarnings("unchecked")
	@Override
	public List<Car> rateDetails(int id) {
		Query query = manager.createQuery("select c.dailyCost from Car c where c.carId=:id");
		query.setParameter("id",id);
		return (List<Car>) query.getSingleResult();
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<BookingDetails> bookingDetails(int id) {
		Query query = manager.createQuery("select b from BookingDetails where b.customerId=:id");
		query.setParameter("id",id);
		return query.getResultList();
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Car> ratesBasedOnCategory() {
		Query query = manager.createQuery("select c.dailyCost,c.carCategoryName from Car c ");
		return query.getResultList();
	}

}
