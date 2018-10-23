package com.learning.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="sid")


public class NonTrainingStudent extends Student{
	private String task;

	public NonTrainingStudent(int sid, String sname, String task) {
		super(sid, sname);
		this.task = task;
	}
	
	public NonTrainingStudent() {
		super();
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}
	
	
}
