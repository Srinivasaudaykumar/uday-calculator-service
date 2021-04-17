package com.hid.calculator;

import java.io.Serializable;
public class Result implements Serializable {
	
	private Long value;

	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}

	public Result(Long value) {
		super();
		this.value = value;
	}
	
	
	
}
