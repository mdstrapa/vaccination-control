package com.marcossoft.vaccinationcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class VaccinationControlApplication {

    public static void main(String[] args) {
        SpringApplication.run(VaccinationControlApplication.class, args);
    }

}
