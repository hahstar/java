package bank;

public class Repayment extends Login {
	private Login a=new Login();
	Repayment(String id,double money){
		a.setId(id);
		a.setMoney(money);
	}
	public void Repayment(){
		System.out.println("..............����................\n");
		System.out.println("��ǰ���Ϊ��\n"+a.getMoney());
    	System.out.println("�����軹�");
	}

}
