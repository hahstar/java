package bank;

import java.util.Scanner;

public class Transfer extends Login{
	
	private Login a=new Login();
	Transfer(String id,double money){
		a.setId(id);
		a.setMoney(money);
	}
	public void Transfer(){
	System.out.println("..............ת��................");
	System.out.println("��ǰ���Ϊ��\n"+a.getMoney());
	System.out.println("������Ҫת����˻���");
	Scanner input=new Scanner(System.in);
	String g=input.next();
	System.out.println("������Ҫת�����Ŀ��");
	String h=input.next();
	int h1;
	h1=Integer.parseUnsignedInt(h);
	System.out.println("��ǰ��"+(getMoney()-h1));
	System.out.println("..............��ѡ��................");
	System.out.println("1.����");
	System.out.println("2.�˳�");
	String l=input.next();
	int d2;
	d2=Integer.parseUnsignedInt(l);
	if(d2==1){
		Login q=new Login();
		q.Choose();
		q.setMoney(getMoney()-h1);
	}
	if(d2==2){
		System.out.println("....................�ټ�.....................");
		System.exit(0);
	}


}
}
