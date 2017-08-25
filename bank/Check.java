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
		System.out.println("当前余额为：\n"+a.getMoney());
		System.out.println("..............请选择................");
		System.out.println("1.返回");
		System.out.println("2.退出");
		String k=input.next();
		int d2;
		d2=Integer.parseUnsignedInt(k);
		if(d2==1){
			
			a.Choose();
			
		}
		if(d2==2){
			System.out.println("....................再见.....................");
			System.exit(0);
		}
		
		
	}

}
