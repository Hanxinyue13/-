package jkcx;

public class Xs implements Student{
	 String name; //����
	 String sex;//�Ա�
	 int age;//����
	 int id;//ѧ��
	 String xw;//ѧλ
	 String sf;//���
	 double pay;//ÿѧ��ѧ��
	 
	public void setPay(double pay) {                      //ѧ�ѣ����壩
			this.pay = pay;
	}
	public double getPay() {
		return pay;
	}

	public void setName(String name) {                    //���������壩                     �Ӵ˿�ʼ��ѧλ���Ƶ�xs��ls��
		this.name = name;
	}
	public String getName() {                          
		return name;
	}
	public void setSex(String sex) {                      //�Ա𣨶��壩
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	public void setAge(int age) {                         //���䣨���壩
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setId(int id) {                         //ID�����壩
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setXw(String xw) {                         //ѧλ�����壩
		this.xw = xw;
	}
	public String getXw() {
		return xw;
	}
	public void setSf(String sf) {                         //��ݣ����壩
		this.sf = sf;
	}
	public String getSf() {
		return sf;
	}

}
