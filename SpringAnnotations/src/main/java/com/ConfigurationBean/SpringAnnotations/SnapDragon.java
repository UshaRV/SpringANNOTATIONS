package com.ConfigurationBean.SpringAnnotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
 
public class SnapDragon implements MobileProcessor {

	public void process() {
		// TODO Auto-generated method stub
            System.out.println("World Best CPU");
	}

}
