package bank;

import java.util.Scanner;

public class Check extends Login{
	 Login a=new Login();
	Check(String id,double money){
		a.setId(id);
		a.setMoney(money);
	}
	public void Check(){
		
		Scanner input=new Scanner(System.in);
		System.out.println("��ǰ���Ϊ��\n"+a.getMoney());
		System.out.println("..............��ѡ��................");
		System.out.println("1.����");
		System.out.println("2.�˳�");
		String k=input.next();
		int d2;
		d2=Integer.parseUnsignedInt(k);
		if(d2==1){
			
			a.Choose();
			
		}
		if(d2==2){
			System.out.println("....................�ټ�.....................");
			System.exit(0);
		}
		
		
	}

}
