package com.javaex.ex01;

public class Member {

	private String name;
	private int point;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public void showInfo() {
		System.out.printf("회원정보: %s,%d점%n", name, point);
	}
}
