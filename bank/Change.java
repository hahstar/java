package bank;

import java.util.Scanner;

public  class Change {
	
	
	
	Change(){
		
	}
    public void Change(){
		
    Scanner input=new Scanner(System.in);
	System.out.println("..............修改信息................\n");
	System.out.println("请修改姓名：");
	
	String e=input.next();
	System.out.println("请修改电话：");
	
	String f=input.next();
	System.out.println("请修改密码：");
	
	String g=input.next();
	System.out.println("当前信息：");
	System.out.println("姓名："+e+"\n电话："+f+"\n密码："+g);
	System.out.println("..............修改信息成功................\n");
	System.out.println("请输入：");
	System.out.println("1.重新修改");
	System.out.println("2.继续");
	String k=input.next();
	int d3;
	d3=Integer.parseUnsignedInt(k);
	if(d3==1){
		Change l=new Change();
		l.Change();
	}
	if(d3==2){
		
	
	System.out.println("..............请选择................\n");
	System.out.println("1.返回");
	System.out.println("2.退出");
	String j=input.next();
	int d2;
	d2=Integer.parseUnsignedInt(j);
	if(d2==1){
		Login l=new Login();
		l.Choose();
		
	}
	if(d2==2){
		System.out.println("....................再见.....................");
		System.exit(0);
	}

}
}
}
