package com.test.demo;

public class Person {
	
	private String personName;
	private int personAge;
	private double personScore;
	
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public double getPersonScore() {
		return personScore;
	}
	public void setPersonScore(double personScore) {
		this.personScore = personScore;
	}
	public Person(String personName, int personAge, double personScore) {
		super();
		this.personName = personName;
		this.personAge = personAge;
		this.personScore = personScore;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personAge=" + personAge + ", personScore=" + personScore + "]";
	}
	
	
	

}
