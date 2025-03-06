package com.sanjay.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CareActivityResponse {
//	@Id
	private String careActivityId;

	private String title;

	@ManyToOne
	@JoinColumn(name = "care_session_id")
	private CareSessionResponse careSession;

}
