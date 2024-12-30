package com.group6.webbportal.dao;

import com.group6.webbportal.entities.Customer;
import com.group6.webbportal.entities.PadelBooking;
import com.group6.webbportal.entities.PadelTimeSlot;
import com.group6.webbportal.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PadelBookingRepository extends JpaRepository<PadelBooking, Integer> {
       List<PadelBooking> findByCustomer(Customer customer);
}



