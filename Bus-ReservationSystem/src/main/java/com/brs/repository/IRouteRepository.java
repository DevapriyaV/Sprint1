package com.brs.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.brs.entity.Route;
import com.brs.entity.User;

@Repository

public interface IRouteRepository extends JpaRepository<Route, Long> {


public List<Route> findByUser(User user);


//@Query(value="from TripBooking where customer in (from Customer where id=:customerId)")
//public List<TripBooking> getTripsByCustomerId(@Param("customerId") Long customerId);

@Query(value="from Route where routeDate:date")
public List<Route> getRouteDateWise(@Param("date") LocalDate date);

}