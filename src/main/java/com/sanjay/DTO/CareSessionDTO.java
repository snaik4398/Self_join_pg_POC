package com.sanjay.DTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CareSessionDTO {
	private String careSessionId;
	private String title;
	private List<CareActivityDTO> careActivities;

}
