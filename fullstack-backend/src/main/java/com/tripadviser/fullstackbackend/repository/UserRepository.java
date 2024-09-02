package com.tripadviser.fullstackbackend.repository;

import com.tripadviser.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
