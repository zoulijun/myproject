package com.mycode.zpc;
/**
学生类，用来创建学生对象的模板
学生对象是用来存储学生的信息的
*/
public class Student {
	//1.私有属性
	private long id;
	private String name;
	private int age;
	//2.公共的setter,getter方法


	//2.公共的setter,getter方法
	public Student(long id,String name,int age){
	
	this.id = id;
	this.name = name;
	this.age = age;

	}
	public Student(){
	}

	public void setId(long id){
		//将实参id赋给本对象中的id属性
		this.id = id;
	}
	public long getId(){
		return this.id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
		}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}

public String toString(){

	return "Student[ id:"+this.id+",name:"+this.name+",age:"+this.age+"]";
}
}