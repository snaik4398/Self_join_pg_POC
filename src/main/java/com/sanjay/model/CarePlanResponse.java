package com.sanjay.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CarePlanResponse {
//	@Id
	private String carePlanId;

	private String title;

	@OneToMany(mappedBy = "carePlan")
	private List<CareSessionResponse> careSessions;

}
