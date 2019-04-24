package com.adaming.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.adaming.model.ReservationNavette;


@Repository
public interface IReservationNavetteDao extends JpaRepository<ReservationNavette, Integer> {
	
public ReservationNavette findByIdTransport(int id);
	

}
