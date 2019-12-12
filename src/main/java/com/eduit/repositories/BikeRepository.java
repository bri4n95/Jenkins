package com.eduit.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.eduit.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
