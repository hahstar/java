package bank;

import java.util.Scanner;

public  class Save  extends Login  {
	
	private Login a=new Login();
	Save(String id,double money){
		a.setId(id);
		a.setMoney(money);
	}
	public void Save(){
	
	System.out.println("..............���................\n");
	System.out.println("��ǰ���Ϊ��\n"+a.getMoney());
	System.out.println("������Ҫ������Ŀ��");
	Scanner input=new Scanner(System.in);
	String h=input.next();
	int h2;
	h2=Integer.parseUnsignedInt(h);
	System.out.println("������������Ǯ��.......");
	System.out.println("��ǰ��"+(a.getMoney()+h2));
	System.out.println("..............��ѡ��................\n");
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
