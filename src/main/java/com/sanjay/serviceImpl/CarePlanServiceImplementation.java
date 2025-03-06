package com.sanjay.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import com.sanjay.model.CarePlanResponse;
import com.sanjay.repository.CarePlanRepository;
import com.sanjay.service.CarePlanService;

@Service
//@Transactional
public class CarePlanServiceImplementation implements CarePlanService {

//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//
//	@Autowired
//	private NamedParameterJdbcTemplate namedParameterjdbcTemplate;

	@Autowired
	private CarePlanRepository repository;

//	@Autowired
//    public CarePlanService(CarePlanDescendantsViewRepository repository) {
//        this.repository = repository;
//    }
	@Override
	public List<CarePlanResponse> getPlan(String carePlanId) {
		List<CarePlanResponse> Obj = new ArrayList<>();
		try {
			Obj = repository.findByCarePlanId(carePlanId);

		} catch (Exception e) {
			System.out.println("===============================================");
			System.out.println(e);
		}
		return Obj;
	}

}
