package com.example.videorental.repositories;

import com.example.videorental.models.MoviesStockModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MoviesStockRepository extends JpaRepository<MoviesStockModel, UUID> {
}
