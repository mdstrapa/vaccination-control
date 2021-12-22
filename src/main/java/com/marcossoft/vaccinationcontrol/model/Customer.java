package com.marcossoft.vaccinationcontrol.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
public class Customer {

    private Integer id;
    private String name;
    private LocalDate birthDate;
    private String email;
}
