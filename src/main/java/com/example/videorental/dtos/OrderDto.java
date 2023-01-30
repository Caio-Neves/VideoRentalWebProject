package com.example.videorental.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import java.util.Date;

@Data
public class OrderDto {

    @NotBlank
    private String customerName;

    @CPF
    private String customerCpf;

    @Email
    private String customerMail;

    @NotBlank
    private String customerPhone;

    @NotBlank
    private String customerAdress;

    @NotNull
    @Future
    private Date returnDate;
}
