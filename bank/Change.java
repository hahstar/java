package bank;

import java.util.Scanner;

public  class Change {
	
	
	
	Change(){
		
	}
    public void Change(){
		
    Scanner input=new Scanner(System.in);
	System.out.println("..............�޸���Ϣ................\n");
	System.out.println("���޸�������");
	
	String e=input.next();
	System.out.println("���޸ĵ绰��");
	
	String f=input.next();
	System.out.println("���޸����룺");
	
	String g=input.next();
	System.out.println("��ǰ��Ϣ��");
	System.out.println("������"+e+"\n�绰��"+f+"\n���룺"+g);
	System.out.println("..............�޸���Ϣ�ɹ�................\n");
	System.out.println("�����룺");
	System.out.println("1.�����޸�");
	System.out.println("2.����");
	String k=input.next();
	int d3;
	d3=Integer.parseUnsignedInt(k);
	if(d3==1){
		Change l=new Change();
		l.Change();
	}
	if(d3==2){
		
	
	System.out.println("..............��ѡ��................\n");
	System.out.println("1.����");
	System.out.println("2.�˳�");
	String j=input.next();
	int d2;
	d2=Integer.parseUnsignedInt(j);
	if(d2==1){
		Login l=new Login();
		l.Choose();
		
	}
	if(d2==2){
		System.out.println("....................�ټ�.....................");
		System.exit(0);
	}

}
}
}
