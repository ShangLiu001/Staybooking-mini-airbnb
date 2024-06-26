package com.laioffer.staybooking.repository;


import java.time.LocalDate;
import com.laioffer.staybooking.model.Reservation;
import com.laioffer.staybooking.model.Stay;
import com.laioffer.staybooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findByStayAndCheckoutDateAfter(Stay stay, LocalDate date);


    List<Reservation> findByGuest(User guest);


    List<Reservation> findByStay(Stay stay);


    Reservation findByIdAndGuest(Long id, User guest);
}
