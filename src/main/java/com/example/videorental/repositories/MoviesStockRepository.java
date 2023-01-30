package com.example.videorental.repositories;

import com.example.videorental.models.MoviesStockModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MoviesStockRepository extends JpaRepository<MoviesStockModel, UUID> {
}
