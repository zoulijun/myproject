package com.mycode.zpc;
public class Computer
{	private String name;
	private int price;
	private String colour;
	private String cpu;
	private String model;
	public Computer(){
	
	
	}
	public Computer(String name,int price,String colour,String cpu,String model){
		this.name = name;
		this.price = price;
		this.colour = colour;
		this.cpu = cpu;
		this.system =system;
	
	
	
	
	}
	public void setName(String name){
		this.name = name;
	} 
	public String getName(String name){
		return this.name;
	
	
	}
	public void setPrice(int price){
		this.price = price;

	}
	public int getPrice(int price){
		return this.price;
	
	}
		public void setColour(String colour){
		this.colour = colour;

	}
	public String getColour(String colour){
		return this.colour;
	
	}
		public void setCpu(String cpu){
		this.cpu = cpu;

	}
	public String getPrice(String cpu){
		return this.cpu;
	
	}
		public void setSystem(String model){
		this.system = system;

	}
	public String getsystem(String model){
		return this.system;
	
	}
	public String toString(){
		System.out.println("电脑名:"+this.name+"价格为:"+this.price+"颜色为:"+this.colour+"cpu为"+this.cpu+"型号为:"+this.model);
	
	
	}


}