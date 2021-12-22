package com.marcossoft.vaccinationcontrol.client;

import com.marcossoft.vaccinationcontrol.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "customer", url = "${customer-service.url}")
public interface CustomerClient {
    @GetMapping("/customer/{customerId}")
    public Optional<Customer> findById(@PathVariable Integer customerId);
}
