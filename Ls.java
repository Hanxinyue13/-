package jkcx;

public class Ls implements Teacher{
	 String name; //����
	 String sex;//�Ա�
	 int age;//����
	 String xw;//ѧλ
	 String sf;//���
	 double fee;//�¹���
		public void setFee(double fee) {                      //���ʣ����壩
			this.fee = fee;
		}
		public double getFee() {
				return fee;
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
