package com.example.videorental.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_ORDERS")
public class OrderModel implements Serializable {

    private static final Long serialVersionUID= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true)
    private String customerName;

    @Column(nullable = false, unique = true, length = 11)
    private String customerCpf;

    @Column(nullable = false, unique = false)
    private String customerMail;

    @Column(nullable = false, unique = true)
    private String customerPhone;

    @Column(nullable = false, unique = false)
    private String customerAdress;

    @Column(nullable = false, unique = false)
    private LocalDateTime orderDate;

    @Column(nullable = false, unique = false)
    private Date returnDate;

    @Column(nullable = false, unique = false)
    @OneToMany(mappedBy = "orderModel")
    private List<MoviesStockModel> moviesList;



}
