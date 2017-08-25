package bank;

import java.util.Scanner;

public class Transfer extends Login{
	
	private Login a=new Login();
	Transfer(String id,double money){
		a.setId(id);
		a.setMoney(money);
	}
	public void Transfer(){
	System.out.println("..............转账................");
	System.out.println("当前余额为：\n"+a.getMoney());
	System.out.println("请输入要转入的账户：");
	Scanner input=new Scanner(System.in);
	String g=input.next();
	System.out.println("请输入要转入的数目：");
	String h=input.next();
	int h1;
	h1=Integer.parseUnsignedInt(h);
	System.out.println("当前余额："+(getMoney()-h1));
	System.out.println("..............请选择................");
	System.out.println("1.返回");
	System.out.println("2.退出");
	String l=input.next();
	int d2;
	d2=Integer.parseUnsignedInt(l);
	if(d2==1){
		Login q=new Login();
		q.Choose();
		q.setMoney(getMoney()-h1);
	}
	if(d2==2){
		System.out.println("....................再见.....................");
		System.exit(0);
	}


}
}
