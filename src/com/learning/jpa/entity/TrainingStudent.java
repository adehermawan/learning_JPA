package com.learning.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="sid")

public class TrainingStudent extends Student{
	private String Subject;
	private String location;
	public TrainingStudent(int sid, String sname,String subject, String location) {
		super(sid,sname);
		this.Subject = subject;
		this.location = location;
	}
	
	public TrainingStudent() {
		super();
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
