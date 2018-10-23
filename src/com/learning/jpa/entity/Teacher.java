package com.learning.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

public class Teacher {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	
	private int tid;
	private String tname;
	public Teacher(int tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
	
	public Teacher() {
		super();
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}
	
	
}
