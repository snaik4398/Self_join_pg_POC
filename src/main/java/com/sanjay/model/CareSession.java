package com.sanjay.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="care_session", schema="public")
@AllArgsConstructor
@NoArgsConstructor
public class CareSession {
	@Column(name = "care_session_id", nullable = true)
	private String careSessionId;
	
	@Column(name = "care_plan_id", nullable = true)
	private String carePlanId;
	
	@Column(name = "tittle", nullable = true)
	private String tittle;

}
