package bank;

public class Repayment extends Login {
	private Login a=new Login();
	Repayment(String id,double money){
		a.setId(id);
		a.setMoney(money);
	}
	public void Repayment(){
		System.out.println("..............还款................\n");
		System.out.println("当前余额为：\n"+a.getMoney());
    	System.out.println("您所需还款：");
	}

}
