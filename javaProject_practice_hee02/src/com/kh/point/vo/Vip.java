package com.kh.point.vo;
public class Vip extends Grade{	
	public Vip(){}
	public Vip(String name, String grade, int point){
		super(name,grade,point,point*0.05);
	}
}