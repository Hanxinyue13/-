package jkcx;

import java.util.Scanner;
public class text {
	 public static void main(String[] args)   {   
		 Scanner reader =new Scanner(System.in);
		 try {
		 System.out.println("------------------------�о���--------------------------------------");
		 Yjs yjs1=new Yjs();
		 yjs1.setName("�����h");
		 yjs1.setSex("Ů");
		 yjs1.setAge(21);
		 yjs1.setXw("�о���");
		 yjs1.setId(2020322113);
		 yjs1.setSf("ѧ��+������ʦ");
		 yjs1.setPay(2000.5);
		 yjs1.setFee(5500);
		 System.out.println("������"+yjs1.getName()+"      �Ա�"+yjs1.getSex()+"      ���䣺"+yjs1.getAge()+"      ѧλ��"+yjs1.getXw()+"      ѧ�ţ�"+yjs1.getId());
		 System.out.println("��ݣ�"+yjs1.getSf()+"      ѧ�ѣ�"+yjs1.getPay()+"      ��н��"+yjs1.getFee());
		 if(yjs1.getFee()>5000 && yjs1.getFee()<20000) {
		 double sk =yjs1.getFee()*0.20;
		 double ns =yjs1.getFee()*12*0.20;
		 System.out.println("ÿ�������˰�"+sk+"      ÿ�������˰�"+ns);
		 double ysd = yjs1.getFee()-sk-yjs1.getPay();
		 double nsd = 12*(yjs1.getFee()-sk-yjs1.getPay());
		 System.out.println("ÿ������ʵ��н�꣺"+ysd+"      ÿ������ʵ��н�꣺"+nsd);
		 }
		 else {
		 double sk=0;
	     System.out.println("�������˰��");
		 double ysd = yjs1.getFee()-sk-yjs1.getPay();
		 double nsd = 12*(yjs1.getFee()-sk-yjs1.getPay());
		 System.out.println("ÿ������ʵ��н�꣺"+ysd+"      ÿ������ʵ��н�꣺"+nsd);
		 }
		 
		 
		 System.out.println("\n");
		 Yjs yjs2=new Yjs();
		 yjs2.setName("������");
		 yjs2.setSex("Ů");
		 yjs2.setAge(22);
		 yjs2.setXw("��ʿ");
		 yjs2.setId(2020322114);
		 yjs2.setSf("ѧ��+������ʦ");
		 yjs2.setPay(2000.5);
		 yjs2.setFee(7000);
		 System.out.println("������"+yjs2.getName()+"      �Ա�"+yjs1.getSex()+"      ���䣺"+yjs2.getAge()+"      ѧλ��"+yjs2.getXw()+"      ѧ�ţ�"+yjs2.getId());
		 System.out.println("��ݣ�"+yjs2.getSf()+"      ѧ�ѣ�"+yjs2.getPay()+"      ��н��"+yjs2.getFee());
		 if(yjs2.getFee()>5000 && yjs2.getFee()<20000) {
		 double sk =yjs2.getFee()*0.20;
		 double ns =yjs2.getFee()*12*0.20;
		 System.out.println("ÿ�������˰�"+sk+"      ÿ�������˰�"+ns);
		 double ysd = yjs2.getFee()-sk-yjs2.getPay();
		 double nsd = 12*(yjs2.getFee()-sk-yjs2.getPay());
		 System.out.println("ÿ������ʵ��н�꣺"+ysd+"       ÿ������ʵ��н�꣺"+nsd);
		 }
		 else {
		 double sk=0;
	     System.out.println("�������˰��");
		 double ysd = yjs2.getFee()-sk-yjs2.getPay();
		 double nsd = 12*(yjs2.getFee()-sk-yjs2.getPay());
		 System.out.println("ÿ������ʵ��н�꣺"+ysd+"      ÿ������ʵ��н�꣺"+nsd);
		 }
		 
		 System.out.println("\n");
		 System.out.println("------------------------  ��ʦ  --------------------------------------");
		 Ls tea1=new Ls();
		 tea1.setName("κޱ");
		 tea1.setSex("Ů");
		 tea1.setAge(33);
		 tea1.setXw("��ʿ��");
		 tea1.setSf("��ʦ");
		 tea1.setFee(20000);

		 System.out.println("������"+tea1.getName()+"      �Ա�"+tea1.getSex()+"      ���䣺"+tea1.getAge()+"      ѧλ��"+tea1.getXw());
		 System.out.println("��ݣ�"+tea1.getSf()+"      ��н��"+tea1.getFee());
		 if(tea1.getFee()>5000 && tea1.getFee()<=20000) {
		 double sk =tea1.getFee()*0.20;
		 double ns =tea1.getFee()*12*0.20;
		 System.out.println("ÿ�������˰�"+sk+"      ÿ�������˰�"+ns);
		 double ysd = tea1.getFee()-sk;
		 double nsd = 12*(tea1.getFee()-sk);
		 System.out.println("ÿ������ʵ��н�꣺"+ysd+"      ÿ������ʵ��н�꣺"+nsd);
		 }
		 else {
		 double sk=0;
	     System.out.println("�������˰��");
		 double ysd = tea1.getFee()-sk;
		 double nsd = 12*(tea1.getFee()-sk);
		 System.out.println("ÿ������ʵ��н�꣺"+ysd+"      ÿ������ʵ��н�꣺"+nsd);
		 }
		 
		 System.out.println("\n");
		 System.out.println("------------------------  ѧ��  --------------------------------------");
		 Xs stu1=new Xs();
		 stu1.setName("����");
		 stu1.setSex("��");
		 stu1.setAge(21);
		 stu1.setXw("������");
		 stu1.setSf("ѧ��");

		 System.out.println("������"+stu1.getName()+"      �Ա�"+stu1.getSex()+"      ���䣺"+stu1.getAge()+"      ѧλ��"+stu1.getXw());
		 System.out.println("��ݣ�"+stu1.getSf()+"      ѧ�ѣ�"+yjs1.getPay());
	     System.out.println("�������˰��");
	     
		 System.out.println("\n");
		 System.out.println("------------------------  ��ѯ  --------------------------------------");
		 System.out.println("�������ѯ������");
		 String name=reader.nextLine();
	
		 yjs1.search(name);
	//	 Yjs.setName(yjs1.name);
		// Student.se(yjs1.getPay());
		 }
		catch(Exception e) {
			System.out.println("���������Ϣ���������²�ѯ��");
			reader.close();
		}
		 
		 }
	 }


