package com.learning.jpa.entity;

import javax.persistence.Entity;

@Entity
public class HonorerTeacher extends Teacher{
	private int teachDayCount;

	public HonorerTeacher(int tid, String tname, int teachDayCount) {
		super(tid, tname);
		this.teachDayCount = teachDayCount;
	}
	
	public HonorerTeacher() {
		super();
	}

	public int getTeachDayCount() {
		return teachDayCount;
	}

	public void setTeachDayCount(int teachDayCount) {
		this.teachDayCount = teachDayCount;
	}
	
	
}
