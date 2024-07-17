package com.mavenJPAHibernate.HibernateDemoJPA.JPAHibernateDeemo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="jpa")
public class JPAEntity {
	@Id
	private int rollno;

	private String name;
	private String learning;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLearning() {
		return learning;
	}
	public void setLearning(String learning) {
		this.learning = learning;
	}
	@Override
	public String toString() {
		return "JPAEntity [rollno=" + rollno + ", name=" + name + ", learning=" + learning + "]";
	}
	
	
}
