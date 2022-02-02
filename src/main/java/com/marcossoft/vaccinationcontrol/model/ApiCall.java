package com.marcossoft.vaccinationcontrol.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiCall {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;
    @Column(nullable = false, updatable = false)
    private String endPoint;
    @Column(nullable = false, updatable = false)
    private LocalDate date;
}
