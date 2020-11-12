# -# JAVA
研究生兼职工资
## 阅读程序
```
```  
## 实验目的  
1、初步使用JAVA编写简单的语句程序同时加深对软件的使用。  
2、在实验中对抽象类、接口设置、输入语句、异常等进行理解。  
3、实际操作感受抽象类与接口的运用，加深对输入与异常等语句的运用。  
## 实验过程  
第一步-创建新的JAVA项目  
第二步-创建Student、Teacher两个接口  
第三步-创建Yjs、Ls、Stutent、text三个类  
第四步-编写Student、Teacher两个接口  
```
package jkcx;
public interface Teacher {
	public void setFee(double f);//设置教师月工资
	public double getFee();	 //获取教师月工资
	public void setName(String name);
	public String getName();	 
}
```
```
package jkcx;
public interface Student {
	public void setPay(double p); //设置学生每学期的学费
	public double getPay(); //获取学生每学期的学费
	public void setName(String name);
	public String getName();	
}
```  

第五步-编写Yjs、Ls、Stutent类中语句，如：对老师、学生、研究生中各个函数进行赋值操作、主要输入各函数信息（）。  
第六步-输入text页面输入三类人的信息，做输入和异常语句。  
第七步-运行程序。  
## 核心方法  
例：
```
 public void search(String n) {
			 if(n.equals(name)) {
				 System.out.println("本月工资："+fee);
			 }else {
				 System.out.println("查无此人！");
			 }
		 }
```  
```  
package jkcx;

public interface Student {
	public void setPay(double p); //设置学生每学期的学费
	public double getPay(); //获取学生每学期的学费
	public void setName(String name);
	public String getName();	
}

```  
```  
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
```  
## 实验结果  
![](https://github.com/Hanxinyue13/-/blob/main/%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C1.PNG)
![](https://github.com/Hanxinyue13/-/blob/main/%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C2.PNG)
## 实验感想  
本次实验的实验点很多，覆盖了很多的知识点并且对之前的内容也做了复习。  
