package com.example.videorental.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_MOVIESSTOCK")
public class MoviesStockModel implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = false)
    private String movieName;

    @Column(nullable = false, unique = false)
    private String movieGenre;

    @Column(nullable = false, unique = false)
    private double moviePrice;

    @Column(nullable = false, unique = false)
    private boolean isRented;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private OrderModel orderModel;
}
