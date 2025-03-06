package com.sanjay.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="care_plan", schema="public")
@AllArgsConstructor
@NoArgsConstructor
public class CarePlan {
	@Column(name = "care_plan_id")
	private String carePlanId;
	
	@Column(name = "parent_care_plan_id")
	private String parentCarePlanId;
	
	@Column(name = "tittle")
	private String tittle;

}
