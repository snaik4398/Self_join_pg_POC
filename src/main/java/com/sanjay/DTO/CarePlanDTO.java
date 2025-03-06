package com.sanjay.DTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CarePlanDTO {
	private String carePlanId;
	private String title;
	private List<CareSessionDTO> careSessions;
}
