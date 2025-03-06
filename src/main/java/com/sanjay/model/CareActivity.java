 package com.sanjay.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="care_activity", schema="public")
@AllArgsConstructor
@NoArgsConstructor
public class CareActivity {
	@Column(name = "case_id", nullable = true)
	private String caseId;
	
	@Column(name = "case_type", nullable = true)
	private String caseType;
	
	@Column(name = "case_data", nullable = true)
	private String caseData;
}
