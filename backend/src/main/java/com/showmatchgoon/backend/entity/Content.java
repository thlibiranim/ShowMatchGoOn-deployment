package com.showmatchgoon.backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String type; // MOVIE, SERIES
    private String genre;
    private String description;
    private LocalDate releaseDate;
    private Double rating;
    private String duration;
    private String imageUrl;
}
