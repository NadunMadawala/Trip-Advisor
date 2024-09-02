package com.tripadviser.fullstackbackend.repository;

import com.tripadviser.fullstackbackend.model.Destination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationRepository extends JpaRepository<Destination,Long> {
}
