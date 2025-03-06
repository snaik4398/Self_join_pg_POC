package com.sanjay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sanjay.model.CarePlanResponse;

@Repository
public interface CarePlanRepository extends JpaRepository<CarePlanResponse, String> {

	@Query("SELECT cd FROM CarePlanDescendantsView cd WHERE cd.carePlanId = :carePlanId")
	List<CarePlanResponse> findByCarePlanId(@Param("carePlanId") String carePlanId);

}
