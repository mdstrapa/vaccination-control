package com.marcossoft.vaccinationcontrol.service;

import com.marcossoft.vaccinationcontrol.client.CustomerClient;
import com.marcossoft.vaccinationcontrol.model.ApiCall;
import com.marcossoft.vaccinationcontrol.model.Customer;
import com.marcossoft.vaccinationcontrol.repository.ApiCallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class VaccinationPassportService {

    @Autowired
    CustomerClient customerClient;

    @Autowired
    ApiCallRepository apiCallRepository;

    public Optional<Customer> getCustomer(String customerEmail){

        ApiCall newApiCall = ApiCall.builder()
                .endPoint("http://someserver:8080/customer")
                .date(LocalDate.now())
                .build();

        apiCallRepository.save(newApiCall);

        return customerClient.findById(1);
    }

}
