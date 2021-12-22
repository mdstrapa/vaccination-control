package com.marcossoft.vaccinationcontrol.controller;

import com.marcossoft.vaccinationcontrol.client.CustomerClient;
import com.marcossoft.vaccinationcontrol.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("vaccination-passport")
@Slf4j
public class VaccinationPassport {


    @Autowired
    CustomerClient customerClient;

    @GetMapping
    public ResponseEntity getVaccinationPassport(@RequestParam String customerEmail){

        return customerClient.findById(1)
                .map(customer -> customer.getName())
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NO_CONTENT).build());

    }
}
