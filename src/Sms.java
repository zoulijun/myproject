package com.mycode.zpc;
import java.util.Scanner;
public class Sms
{	private Student[] stus = new Student[3];			//���ڱ���ѧ������
	private int index = 0;//��¼������ʵ��ѧ���ĸ���
	/**
	*���ѧ����Ϣ
	*/
	public void save(Student student){
		if(index>=stus.length){
			 Student[] demo = new Student[stus.length+3];
			System.arraycopy(stus,0,demo,0,index);
			stus = demo;
		
		
		
		}
		stus[index++] = student;

	
	
	
	}
	/**
	*�޸�ѧ����Ϣ
	*/
	public void update(Student student){
		for(int i=0;i<index;i++){
			 if(stus[i].getId()==student.getId())
			{
				//stus[i].setName(student.getName());
				stus[i].setAge(student.getAge());
				stus[i].setName(student.getName());
			 
			 
			 
			 }
		
		
		}
	
	
	
	}
	/**
	*ɾ��ѧ����Ϣ
	*/
	public void deleteById(long id){
		int i;
		i = getIndexById(id);
		for(int j=i;j<index-1;j++){
			stus[j]=stus[j+1];
		
		
		}
		stus[--index]=null;

	
	
	}
	/**
	*��ѯ����ѧ����Ϣ
	*/
	public Student[] queryAll(){
		Student[] demo = new Student[index];
		System.arraycopy(stus,0,demo,0,index);
		return demo;
	
	
	}
	/**
	*ͨ��id����ѧ����Ϣ
	*/
	public Student queryById(long id){
		 int num;
		 num = getIndexById(id);
		 return num==-1?null:stus[num];
	
	
	}
	private int getIndexById(long id){
		int num = -1;
		for(int j=0;j<index;j++){
			if(stus[j].getId()==id){
				num = j;
				break;}
	}
	
	return num;
}





	public void meau(){
		System.out.println("********ѧ����Ϣ����ϵͳ********");
		System.out.println("*1 ��������ѧ����Ϣ");
		System.out.println("*2 ¼��ѧ����Ϣ");
		System.out.println("*3 ɾ��ѧ����Ϣ");
		System.out.println("*4 ͨ��ѧ��id����");
		System.out.println("*5 �޸�ѧ����Ϣ");
		System.out.println("*exit �˳�ϵͳ��");
		System.out.println("*help ��ȡ������");
		System.out.println("********************************");
	
	
	
	
	}
	public static void main(String[] args){
		Sms sms = new Sms();
		sms.meau();
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("�������Ӧָ��:");
			String option = sc.nextLine();
			switch(option){
				case "1":			//��ѯ����
				System.out.println("������ѧ����Ϣ");
				Student[] stus = sms.queryAll();
				for(Student stus1 :stus)
				{	System.out.println(stus1);
				}
				System.out.println("��ѯ��"+sms.index+"��ѧ��");

				



				break;
				case "2":			//¼��
				while(true){
				System.out.println("������ѧ����Ϣ��id#name#age�������롾break��������һ��Ŀ¼");
				String stuStr = sc.nextLine();
				String biaodashi ="\\w+";
				if(stuStr.matches(biaodashi)){
					break;
				
				
				}
				if(stuStr.equals("break")){
					break;
				}
				
				String stuArr[] = stuStr.split("#");
				long id = Long.parseLong(stuArr[0]);
				String name = stuArr[1];
				int age = Integer.parseInt(stuArr[2]);
				Student stu = new Student(id,name,age);
				sms.save(stu);



				System.out.println("������Ϣ�ɹ�!");




				}
				break;
				case "3":			//ɾ��
				System.out.println("������Ҫɾ����ѧ��id:�����롾break���˳�");
				String stuId = sc.nextLine();
				if(stuId.equals("break")){
					break;
				}
				long id2 = Long.parseLong(stuId);
				Student stu2 = sms.queryById(id2);
				System.out.println("�㽫Ҫɾ����ѧ��Ϊ��");
				System.out.println(stu2);
				System.out.println("�Ƿ����ɾ����������yes������no�˳�,");
				String choice =sc.nextLine();
				if(choice.equals("yes")){
					
					sms.deleteById(id2);
					System.out.println("ɾ���ɹ���");
				
				
				
				}
				if(choice.equals("no")){
				break;
				
				
				}




				break;				
				case "4":			//ͨ��id��ȡ
				System.out.println("������Ҫ���ҵ�ѧ����id,��������break������һ��Ŀ¼");
				String idStr = sc.nextLine();
				if(idStr.equals("break")){
					break;
				}
				long id = Long.parseLong(idStr);
				Student stuid = sms.queryById(id);
				System.out.println(stuid==null?"sorry ,not found!":stuid);

				break;
				case "5":			//�޸�
				System.out.println("������Ҫ�޸�ѧ����id,��������break������һ��");
				String idStr1 = sc.nextLine();
				if(idStr1.equals("break")){
					break;
				
				}
				long id1 = Long.parseLong(idStr1);
				Student stu = sms.queryById(id1);
				if(stu==null){
					System.out.println("��Ҫ�޸ĵ���Ϣ������");

				
				
				
				}
				System.out.println("ԭ��ϢΪ��"+stu);
				System.out.println("����������Ϣ��name#age��:");
				String str = sc.nextLine();
				String[] stuArr = str.split("#");			
				String name = stuArr[0];
				int age = Integer.parseInt(stuArr[1]);
				Student newStu = new Student(id1,name,age);
				sms.update(newStu);
				System.out.println("�޸ĳɹ�!");





				break;
				case "exit":
					System.out.println("�Ѿ��˳�ѧ������ϵͳ");
				System.exit(0);
				break;
				case "help":
				sms.meau();
				break;
				default:
					System.out.println("sorry ��������");
				}
		
		}

	
	
	
	
	}




}