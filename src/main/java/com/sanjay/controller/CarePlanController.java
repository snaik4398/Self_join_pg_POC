package com.sanjay.controller;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanjay.service.CarePlanService;

@RestController
@RequestMapping("/api/carePlan")
public class CarePlanController {

	@Autowired
	private CarePlanService carePlanService;

	public CarePlanController(CarePlanService carePlanService) {
		super();
		this.carePlanService = carePlanService;
	}

	// to add single patients
	@GetMapping("/data")
	public ResponseEntity<String> getPlan(@RequestParam String carePlanId) {

		System.out.println(carePlanId);
//		String createdPatientDto = this.patientService.getPlan(carePlanId);
		return new ResponseEntity<>("working", HttpStatus.CREATED);
	}

	@GetMapping("/searchbyId/{Id}")
	public ResponseEntity<String> searchById(@PathVariable String carePlanId) {
		Object obj = carePlanService.getPlan(carePlanId);
		if (!ObjectUtils.isEmpty(obj)) {
			System.out.println(obj.toString());
		} else {
			System.out.println("Object is null");
		}
		return new ResponseEntity<>("called", HttpStatus.CREATED);
	}
}
