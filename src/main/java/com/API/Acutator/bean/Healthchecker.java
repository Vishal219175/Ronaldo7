package com.API.Acutator.bean;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Controller;

@Controller
public class Healthchecker implements HealthIndicator {

	public static final String YOYO_POINTS=">150 yoyo points";
	
	public static final String YOYO_POINTS1="<150 yoyo points";

	
	public boolean playerfit()
	{
		return true;
	}
	
	
	
	@Override
	public Health health() {
		
		if(playerfit())
		{
			return Health.up().withDetail(YOYO_POINTS,"the player health is great").build();
		}

		return Health.down().withDetail(YOYO_POINTS1,"the player health is not great").build();
	}

	
	
	
	
	
	
	
}
