package com.tripadviser.fullstackbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Destination {
    @Id
    @GeneratedValue

    private Long id;
    private String name;
    private String description;
    private String image;
}
