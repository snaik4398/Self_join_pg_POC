package com.sanjay.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CareSessionResponse {
//	@Id
	private String careSessionId;

	private String title;

	@ManyToOne
	@JoinColumn(name = "care_plan_id")
	private CarePlanResponse carePlan;

	@OneToMany(mappedBy = "careSession")
	private List<CareActivityResponse> careActivities;
}
