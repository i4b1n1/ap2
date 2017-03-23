package com.watkings.utils;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Component;

@Component
public class ProjectDateFormat {

	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-dd-MM HH-mm");

	public SimpleDateFormat getSimpleDateFormat() {
		return simpleDateFormat;
	}

	public void setSimpleDateFormat(SimpleDateFormat simpleDateFormat) {
		this.simpleDateFormat = simpleDateFormat;
	}
	
	
}
