package bank;

import java.util.Scanner;

public  class Save  extends Login  {
	
	private Login a=new Login();
	Save(String id,double money){
		a.setId(id);
		a.setMoney(money);
	}
	public void Save(){
	
	System.out.println("..............存款................\n");
	System.out.println("当前余额为：\n"+a.getMoney());
	System.out.println("请输入要存入数目：");
	Scanner input=new Scanner(System.in);
	String h=input.next();
	int h2;
	h2=Integer.parseUnsignedInt(h);
	System.out.println("（哗哗哗）数钱声.......");
	System.out.println("当前余额："+(a.getMoney()+h2));
	System.out.println("..............请选择................\n");
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
