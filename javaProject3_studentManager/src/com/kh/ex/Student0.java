package com.kh.ex;

//vo 클래스
public class Student0 {
	
	private String name; //이름
	private String id; //학생 학번
	private int age; //학생 나이
	private String phone; //학생 번호
	private String gender; //성별
	//_매개변수(넘어오는 값저장) 와 멤버변수 구분 .뒤에 나오는 추천 메소드
	
	public Student0(String name) {
		this.name=name;
		
	}
	
	
	
	
	public void setName(String name)
	{this.name=name;
	//this. 내자신 멤버변수 접근 그냥 name 매개변수
	}
	public void setId(String id){this.id=id;}
	public void setAge(int age){this.age=age;}
	public void setPhone(String phone){this.phone=phone;}
	public void setGender(String gender){this.gender=gender;}
	
	public String getName() {return this.name;} //name 변수가 멤버인 건 알지만 좀 더 정확하게
	public String getId() {return this.id;}
	public int getAge() {return this.age;}
	public String getPhone() {return this.phone;}	
	public String getGender() {return this.gender;}

	
}
