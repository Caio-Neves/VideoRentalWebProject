package com.example.videorental.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class MoviesStockDto {

    @NotBlank
    private String movieName;

    @NotBlank
    private String movieGenre;

    @NotBlank
    private double moviePrice;

    @NotNull
    private boolean isRented;

}
