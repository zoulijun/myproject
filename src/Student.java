package com.mycode.zpc;
/**
ѧ���࣬��������ѧ�������ģ��
ѧ�������������洢ѧ������Ϣ��
*/
public class Student {
	//1.˽������
	private long id;
	private String name;
	private int age;
	//2.������setter,getter����


	//2.������setter,getter����
	public Student(long id,String name,int age){
	
	this.id = id;
	this.name = name;
	this.age = age;

	}
	public Student(){
	}

	public void setId(long id){
		//��ʵ��id�����������е�id����
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