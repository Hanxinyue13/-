package jkcx;

import java.util.Scanner;
public class text {
	 public static void main(String[] args)   {   
		 Scanner reader =new Scanner(System.in);
		 try {
		 System.out.println("------------------------研究生--------------------------------------");
		 Yjs yjs1=new Yjs();
		 yjs1.setName("韩欣玥");
		 yjs1.setSex("女");
		 yjs1.setAge(21);
		 yjs1.setXw("研究生");
		 yjs1.setId(2020322113);
		 yjs1.setSf("学生+助教老师");
		 yjs1.setPay(2000.5);
		 yjs1.setFee(5500);
		 System.out.println("姓名："+yjs1.getName()+"      性别："+yjs1.getSex()+"      年龄："+yjs1.getAge()+"      学位："+yjs1.getXw()+"      学号："+yjs1.getId());
		 System.out.println("身份："+yjs1.getSf()+"      学费："+yjs1.getPay()+"      月薪："+yjs1.getFee());
		 if(yjs1.getFee()>5000 && yjs1.getFee()<20000) {
		 double sk =yjs1.getFee()*0.20;
		 double ns =yjs1.getFee()*12*0.20;
		 System.out.println("每月需缴纳税款："+sk+"      每年需缴纳税款："+ns);
		 double ysd = yjs1.getFee()-sk-yjs1.getPay();
		 double nsd = 12*(yjs1.getFee()-sk-yjs1.getPay());
		 System.out.println("每月所得实际薪酬："+ysd+"      每年所得实际薪酬："+nsd);
		 }
		 else {
		 double sk=0;
	     System.out.println("无需缴纳税款");
		 double ysd = yjs1.getFee()-sk-yjs1.getPay();
		 double nsd = 12*(yjs1.getFee()-sk-yjs1.getPay());
		 System.out.println("每月所得实际薪酬："+ysd+"      每年所得实际薪酬："+nsd);
		 }
		 
		 
		 System.out.println("\n");
		 Yjs yjs2=new Yjs();
		 yjs2.setName("刘冬蕊");
		 yjs2.setSex("女");
		 yjs2.setAge(22);
		 yjs2.setXw("博士");
		 yjs2.setId(2020322114);
		 yjs2.setSf("学生+助教老师");
		 yjs2.setPay(2000.5);
		 yjs2.setFee(7000);
		 System.out.println("姓名："+yjs2.getName()+"      性别："+yjs1.getSex()+"      年龄："+yjs2.getAge()+"      学位："+yjs2.getXw()+"      学号："+yjs2.getId());
		 System.out.println("身份："+yjs2.getSf()+"      学费："+yjs2.getPay()+"      月薪："+yjs2.getFee());
		 if(yjs2.getFee()>5000 && yjs2.getFee()<20000) {
		 double sk =yjs2.getFee()*0.20;
		 double ns =yjs2.getFee()*12*0.20;
		 System.out.println("每月需缴纳税款："+sk+"      每年需缴纳税款："+ns);
		 double ysd = yjs2.getFee()-sk-yjs2.getPay();
		 double nsd = 12*(yjs2.getFee()-sk-yjs2.getPay());
		 System.out.println("每月所得实际薪酬："+ysd+"       每年所得实际薪酬："+nsd);
		 }
		 else {
		 double sk=0;
	     System.out.println("无需缴纳税款");
		 double ysd = yjs2.getFee()-sk-yjs2.getPay();
		 double nsd = 12*(yjs2.getFee()-sk-yjs2.getPay());
		 System.out.println("每月所得实际薪酬："+ysd+"      每年所得实际薪酬："+nsd);
		 }
		 
		 System.out.println("\n");
		 System.out.println("------------------------  教师  --------------------------------------");
		 Ls tea1=new Ls();
		 tea1.setName("魏薇");
		 tea1.setSex("女");
		 tea1.setAge(33);
		 tea1.setXw("博士后");
		 tea1.setSf("老师");
		 tea1.setFee(20000);

		 System.out.println("姓名："+tea1.getName()+"      性别："+tea1.getSex()+"      年龄："+tea1.getAge()+"      学位："+tea1.getXw());
		 System.out.println("身份："+tea1.getSf()+"      月薪："+tea1.getFee());
		 if(tea1.getFee()>5000 && tea1.getFee()<=20000) {
		 double sk =tea1.getFee()*0.20;
		 double ns =tea1.getFee()*12*0.20;
		 System.out.println("每月需缴纳税款："+sk+"      每年需缴纳税款："+ns);
		 double ysd = tea1.getFee()-sk;
		 double nsd = 12*(tea1.getFee()-sk);
		 System.out.println("每月所得实际薪酬："+ysd+"      每年所得实际薪酬："+nsd);
		 }
		 else {
		 double sk=0;
	     System.out.println("无需缴纳税款");
		 double ysd = tea1.getFee()-sk;
		 double nsd = 12*(tea1.getFee()-sk);
		 System.out.println("每月所得实际薪酬："+ysd+"      每年所得实际薪酬："+nsd);
		 }
		 
		 System.out.println("\n");
		 System.out.println("------------------------  学生  --------------------------------------");
		 Xs stu1=new Xs();
		 stu1.setName("张三");
		 stu1.setSex("男");
		 stu1.setAge(21);
		 stu1.setXw("本科生");
		 stu1.setSf("学生");

		 System.out.println("姓名："+stu1.getName()+"      性别："+stu1.getSex()+"      年龄："+stu1.getAge()+"      学位："+stu1.getXw());
		 System.out.println("身份："+stu1.getSf()+"      学费："+yjs1.getPay());
	     System.out.println("无需缴纳税款");
	     
		 System.out.println("\n");
		 System.out.println("------------------------  查询  --------------------------------------");
		 System.out.println("请输入查询姓名：");
		 String name=reader.nextLine();
	
		 yjs1.search(name);
	//	 Yjs.setName(yjs1.name);
		// Student.se(yjs1.getPay());
		 }
		catch(Exception e) {
			System.out.println("您输入的信息有误，请重新查询！");
			reader.close();
		}
		 
		 }
	 }


