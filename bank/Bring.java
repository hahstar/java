package bank;

import java.util.Scanner;

public class Bring  extends Login{
	
	 Login a=new Login();
	Bring(String id,double money){
		a.setId(id);
		a.setMoney(money);
	}
	
	public void Bring(){
		
	System.out.println("..............ȡ��................\n");
	System.out.println("��ǰ���Ϊ��\n"+a.getMoney());
	System.out.println("������Ҫȡ����Ŀ��");
		Scanner input=new Scanner(System.in);
	String h=input.next();
	int h1;
	h1=Integer.parseUnsignedInt(h);
	System.out.println("������������Ǯ��.......");
	System.out.println("��ǰ��"+(a.getMoney()-h1));
	System.out.println("..............��ѡ��................\n");
	System.out.println("1.����");
	System.out.println("2.�˳�");
	String i=input.next();
	
	int d2;
	d2=Integer.parseUnsignedInt(i);
	if(d2==1){
		
		a.Choose();
			
	}
	if(d2==2){
		System.out.println("....................�ټ�.....................");
		System.exit(0);
	}
	
	
}
	
}
