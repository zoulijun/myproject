package com.mycode.zpc;
import java.util.Scanner;
import java.util.Arrays;
public class Computersms
{	Computer arr[] = new Computer[6];
	private int index=0;
	public void Sava(Computer computer){
	//储存电脑信息
		if(index>=arr.length)
			{	Computer[] arr1 = new Computer[arr.length+6];
				arr1 = Arrays.copyOfRange(arr,0,index);
				arr = arr1;
			}
		arr[index++]=computer;
	
	}

	public int QueryPrice(String name){
		return 0;
	//查询每种电脑的价格
	}
	public String QueryModel(String name){
		return null;
	//查询每种电脑的型号
	
	}
	public String QueryColour(String name){
		return null;
	//查询每种电脑的颜色
	}
	public Computer[] QueryAllComputer(){
		return arr;
	//查询录入所有储存的电脑
	}
	public void DeleteComputer(String name){
	
	//删除电脑信息
	
	}
	public void AlterComputer(String name){
	
	//修改电脑信息
	
	}
	public void Meau(){
	
	System.out.println("***************电脑管理系统******************");
	System.out.println("1*录入电脑信息");
	System.out.println("2*查询电脑价格");
	System.out.println("3*查询电脑型号");
	System.out.println("4*查询电脑颜色");
	System.out.println("5*查询所有录入的电脑信息");
	System.out.println("6*删除电脑信息");
	System.out.println("7*修改电脑信息");
	System.out.println("8*按help提示菜单信息");
	System.out.println("9*按exit退出程序");
	System.out.println("***************电脑管理系统******************");
	
	}
public static void main(String[] args)
	{	
	Computersms comp =new Computersms();
	comp.Meau();
	Scanner sc = new Scanner(System.in);
	while(true)
		{	
			System.out.println("请输入对应指令的数字");
	        String option = sc.nextLine();

		    switch(option)
			{	case "1":			//存储电脑信息
					while(true)
						{
							System.out.println("请输入您要录入的电脑信息【name,price,coluor,cpu,model】或者输入break返回上一级目录");
							String option1 = sc.nextLine();
							if(option1.equals("break"))
								{
									break;
								}
								String stu[] = option1.split(",");
								String name = stu[0];
								int price = Integer.parseInt(stu[1]);
								String colour = stu[2];
								String cpu = stu[3];
								String model = stu[4];
								Computer computer1 = new Computer(name,price,colour,cpu,model);
								comp.Sava(computer1);
								System.out.println("电脑信息存储成功！");

						}
					
					break;
				case "2":
					break;
				case "3":
					break;
				case "4":
					break;			
		        case "5":       //查询所有电脑的信息
					System.out.println("您要查询的所有电脑信息为:");
					Computer[] stu1 = comp.QueryAllComputer();
					for(Computer e : stu1)
						{
							System.out.println(e);
						}
					break;
				case "6":
					break;
				case "7":
					break;
				case "8":
					break;
				case "9":
					break;
				default:
				System.out.println("您的输入有误!");

			}
	
	
		}
	



   }

}