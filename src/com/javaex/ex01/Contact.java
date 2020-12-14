package com.javaex.ex01;

public class Contact {

	// 필드
	private String name;
	private String hp;
	private String company;


	// 생성자
	public Contact(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	}

	// 메소드 g/s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}



	// 메소드 일반

	public void showInfo() {
		System.out.println(".\t" + name + "\t" + hp + "\t" + company);
	}
}
