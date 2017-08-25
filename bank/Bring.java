package bank;

import java.util.Scanner;

public class Bring  extends Login{
	
	 Login a=new Login();
	Bring(String id,double money){
		a.setId(id);
		a.setMoney(money);
	}
	
	public void Bring(){
		
	System.out.println("..............取款................\n");
	System.out.println("当前余额为：\n"+a.getMoney());
	System.out.println("请输入要取出数目：");
		Scanner input=new Scanner(System.in);
	String h=input.next();
	int h1;
	h1=Integer.parseUnsignedInt(h);
	System.out.println("（哗哗哗）数钱声.......");
	System.out.println("当前余额："+(a.getMoney()-h1));
	System.out.println("..............请选择................\n");
	System.out.println("1.返回");
	System.out.println("2.退出");
	String i=input.next();
	
	int d2;
	d2=Integer.parseUnsignedInt(i);
	if(d2==1){
		
		a.Choose();
			
	}
	if(d2==2){
		System.out.println("....................再见.....................");
		System.exit(0);
	}
	
	
}
	
}
