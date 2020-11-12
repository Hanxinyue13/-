package jkcx;

public class Xs implements Student{
	 String name; //姓名
	 String sex;//性别
	 int age;//年龄
	 int id;//学号
	 String xw;//学位
	 String sf;//身份
	 double pay;//每学期学费
	 
	public void setPay(double pay) {                      //学费（定义）
			this.pay = pay;
	}
	public double getPay() {
		return pay;
	}

	public void setName(String name) {                    //姓名（定义）                     从此开始到学位复制到xs和ls里
		this.name = name;
	}
	public String getName() {                          
		return name;
	}
	public void setSex(String sex) {                      //性别（定义）
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	public void setAge(int age) {                         //年龄（定义）
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setId(int id) {                         //ID（定义）
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setXw(String xw) {                         //学位（定义）
		this.xw = xw;
	}
	public String getXw() {
		return xw;
	}
	public void setSf(String sf) {                         //身份（定义）
		this.sf = sf;
	}
	public String getSf() {
		return sf;
	}

}
