package bank;

import java.util.Scanner;

public  class Login {
	private String id;
	private String pwd;
	private double money;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	Login(){
		
	}
	Login(String id,String pwd,double money){
		 this.id = id;
		 this.pwd = pwd;
		 this.money = money;
	}	 
	public void Login(){	 
	Scanner input=new Scanner(System.in);
	int q=2;
	for(int i=1;i<=3;i++){
		System.out.println("�������˺ţ�");
		String id1=input.next();
	System.out.println("���������룺");
	
	String pwd1=input.next();
	if(pwd.equals(pwd1)&&id.equals(id1)){
		System.out.println("..............��½�ɹ���ѡ����................\n");
		System.out.println("������ѡ��");
		System.out.println("1.�޸���Ϣ\n"+"2.���\n"+"3.ȡ��\n"+"4.ת��\n"+"5.����\n"+"6.����\n"+"9.�˳�\n"+"0.��ѯ���");
		String choice=input.next();
		int d1;       
		d1=Integer.parseUnsignedInt(choice);
		if(d1==1){
			Change c=new Change();	
			c.Change();
			}
		if(d1==2){
			Save d=new Save(id,money);
			d.Save();
			}
		if(d1==3){
			Bring e=new Bring(id,money);
			e.Bring();
			}
		if(d1==4){
			Transfer f=new Transfer(id,money);
			f.Transfer();
			}
		if(d1==5){
			Moean m=new Moean(id,money);
			m.Moean();
			}
		if(d1==6){
			Repayment r= new Repayment(id,money);
			r.Repayment();
			}
		if(d1==0){
			Check c=new Check(id,money);
			c.Check();
			}
		if(d1==9){
			System.err.println(".............�ټ�.....................");
			System.exit(0);
		}
		
		break;
		}
	else if(q!=0){
		System.err.println("..............������󣬻���"+q+"�λ���................\n");
		q--;
		continue;
	  }
	else  {
		System.err.println("..............�����3�Σ�ϵͳ�˳�................");
		System.err.println(".............�ټ�.....................");
		System.exit(0);
		break;
	  }
	}
	 Choose();{
		}
	}

	public void Choose() {
		 Scanner input=new Scanner(System.in);
		System.out.println("������ѡ��");
		System.out.println("1.�޸���Ϣ\n"+"2.���\n"+"3.ȡ��\n"+"4.ת��\n"+"5.����\n"+"6.����\n"+"9.�˳�\n"+"0.��ѯ���\n");
		String choice=input.next();
		int d1;
		d1=Integer.parseUnsignedInt(choice);
		if(d1==1){
			Change c=new Change();	
			c.Change();
			}
		if(d1==2){
			Save d=new Save(id,money);
			d.Save();
			}
		if(d1==3){
			Bring e=new Bring(id,money);
			e.Bring();
			}
		if(d1==4){
			Transfer f=new Transfer(id,money);
			f.Transfer();
			}
		if(d1==5){
			Moean m=new Moean(id,money);
			m.Moean();
			}
		if(d1==6){
			Repayment r= new Repayment(id,money);
			r.Repayment();
			}
	
	     if(d1==0){
		Check c=new Check(id,money);
		c.Check();
		}
		if(d1==9){
			System.err.println(".............�ټ�.....................");
			System.exit(0);
			
}
}
}
