package com.brs.service;

import java.time.LocalDate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brs.entity.Reservation;
import com.brs.exceptions.ReservationNotFoundException;
import com.brs.repository.IReservationRepository;




@Service
@Transactional
public class ReservationService implements IReservationService{
	
	@Autowired
	private IReservationRepository reservationRepo;
	
    @Override
	public Reservation addReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		Reservation newReservation = reservationRepo.save(reservation);
		System.out.println(newReservation+"******");
		return newReservation;
		
	}


	@Override
	public Reservation updateReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		Reservation retrievedReservation = null;
		try {
		retrievedReservation = reservationRepo.findById(reservation.getReservationId()).orElseThrow(ReservationNotFoundException::new);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		retrievedReservation.setReservationId(reservation.getReservationId());
		retrievedReservation.setReservationStatus(reservation.getReservationStatus());
		retrievedReservation.setReservationDate(reservation.getReservationDate());
		retrievedReservation.setReservationTime(reservation.getReservationTime());
		retrievedReservation.setSource(reservation.getSource());
		retrievedReservation.setDestination(reservation.getDestination());
		retrievedReservation.setReservationType(reservation.getReservationType());
		
		Reservation updatedBooking = reservationRepo.save(retrievedReservation);
		return updatedBooking;		
	}


	@Override
	public Reservation viewReservation(int id) {
		// TODO Auto-generated method stub
		Reservation retVal=null;
		try {
			retVal = reservationRepo.findById(id).orElseThrow(ReservationNotFoundException::new);
		} catch (ReservationNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retVal;
		
	}


	@Override
	public Reservation deleteReservation(int reservationId) {
		// TODO Auto-generated method stub
		Reservation retrVal = null;
		try {
			retrVal=reservationRepo.findById(reservationId).orElseThrow(ReservationNotFoundException::new);
				reservationRepo.delete(retrVal);
			
		} catch (ReservationNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retrVal;
		
	}


	@Override
	public List<Reservation> viewAllReservation() {
		// TODO Auto-generated method stub
		List<Reservation> retVal = null;
		retVal = reservationRepo.findAll();
		return retVal;
	}


	@Override
	public List<Reservation> getAllReservation(LocalDate date) {
		// TODO Auto-generated method stub
		List<Reservation> retVal = reservationRepo.getReservationDateWise(date);
		return retVal;
	}
}