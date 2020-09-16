// 실습1) 슈퍼클래스(상위 클래스)
public class Employee {
	String name;
	int salary;
	
	public Employee(String n, int s){ // 생성자가 이름과 월급을 인수로 받음
		name = n; // 이름과 월급을 멤버변수에 저장
		salary = s; 
	}
	
	public void getInformation(){
		System.out.println("이름: "+name+", 연봉: "+salary);
	}
}
