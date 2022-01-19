package com.marcossoft.vaccinationcontrol.controller;
import com.marcossoft.vaccinationcontrol.service.VaccinationPassportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vaccination-passport")
@Slf4j
public class VaccinationPassport {

    @Autowired
    VaccinationPassportService vaccinationPassportService;

    @GetMapping
    public ResponseEntity getVaccinationPassport(@RequestParam String customerEmail){

        return vaccinationPassportService.getCustomer(customerEmail)
                .map(customer -> customer.getName())
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NO_CONTENT).build());

    }
}
