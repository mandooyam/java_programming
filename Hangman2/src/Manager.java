// 실습1) 파생클래스(자식 클래스)
public class Manager extends Employee {
	String department;
	
	public Manager(String n, int s, String d){ // 생성자
		super(n,s); // Employee 클래스의 생성자에게 이름과 월급 전달
		department = d; // 부서저장
	}
	
	public void getInformation(){
		System.out.println("이름: "+name+", 부서: "+department+", 연봉: "+salary);
	}
	
	/*
	public static void main(String[] args) {
		Manager mng = new Manager("홍길동", 10000000, "영업부");
		
		mng.getInformation();
		
	}
	*/
}
