package com.marcossoft.vaccinationcontrol.repository;

import com.marcossoft.vaccinationcontrol.model.ApiCall;
import org.springframework.data.repository.CrudRepository;

public interface ApiCallRepository extends CrudRepository<ApiCall,Integer> {
}
