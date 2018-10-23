package com.learning.jpa.entity;

import javax.persistence.Entity;

@Entity
public class FixedTeacher extends Teacher{
	private String training;
	private String insurance;
	public FixedTeacher(int tid, String tname, String training, String insurance) {
		super(tid, tname);
		this.training = training;
		this.insurance = insurance;
	}
	
	public FixedTeacher() {
		super();
	}

	public String getTraining() {
		return training;
	}

	public void setTraining(String training) {
		this.training = training;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	
	
}
