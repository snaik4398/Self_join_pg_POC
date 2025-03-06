package com.sanjay.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sanjay.model.CarePlanResponse;

public interface CarePlanService {

	List<CarePlanResponse> getPlan(String carePlanId);
}
