package com.showmatchgoon.backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;
    private Double distance;

    @OneToMany(mappedBy = "cinema")
    private List<Showtime> showtimes;
}
