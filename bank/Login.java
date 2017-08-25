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
		System.out.println("请输入账号：");
		String id1=input.next();
	System.out.println("请输入密码：");
	
	String pwd1=input.next();
	if(pwd.equals(pwd1)&&id.equals(id1)){
		System.out.println("..............登陆成功，选择功能................\n");
		System.out.println("请输入选择：");
		System.out.println("1.修改信息\n"+"2.存款\n"+"3.取款\n"+"4.转账\n"+"5.贷款\n"+"6.还款\n"+"9.退出\n"+"0.查询余额");
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
			System.err.println(".............再见.....................");
			System.exit(0);
		}
		
		break;
		}
	else if(q!=0){
		System.err.println("..............输入错误，还有"+q+"次机会................\n");
		q--;
		continue;
	  }
	else  {
		System.err.println("..............已输错3次，系统退出................");
		System.err.println(".............再见.....................");
		System.exit(0);
		break;
	  }
	}
	 Choose();{
		}
	}

	public void Choose() {
		 Scanner input=new Scanner(System.in);
		System.out.println("请输入选择：");
		System.out.println("1.修改信息\n"+"2.存款\n"+"3.取款\n"+"4.转账\n"+"5.贷款\n"+"6.还款\n"+"9.退出\n"+"0.查询余额\n");
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
			System.err.println(".............再见.....................");
			System.exit(0);
			
}
}
}
