package com.brs.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.brs.entity.Reservation;
import com.brs.entity.User;

@Repository

public interface IReservationRepository extends JpaRepository<Reservation, Integer> {
	

	public List<Reservation> findByUser(User user);
	
	
	//@Query(value="from TripBooking where customer in (from Customer where id=:customerId)")
	//public List<TripBooking> getTripsByCustomerId(@Param("customerId") Long customerId);
	
	@Query(value="from Reservation where reservationDate:date")
	public List<Reservation> getReservationDateWise(@Param("date") LocalDate date);

}