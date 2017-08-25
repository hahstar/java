package bank;

import java.util.Scanner;

public class Moean extends Login{
	 Login a=new Login();
	Moean(String id,double money){
		a.setId(id);
		a.setMoney(money);
	}
    public void Moean(){
    	System.out.println("..............贷款................\n");
    	System.out.println("贷款利率如下：");
    	System.out.println("一年以内（含一年） 4.35%\n 一年至五年（含五年） 4.75%\n 五年以上 4.90%\n ");
    	System.out.println("当前余额为：\n"+a.getMoney());
    	if(getMoney()<=10000){
    		System.out.println("可贷款额度："+"100000");
    	}
    	else if(getMoney()<=100000){
    		System.out.println("可贷款额度："+"500000");
    	}
    	else if(getMoney()<=500000){
    		System.out.println("可贷款额度："+"1000000");
    	}
    	else if(getMoney()>500000){
    		System.out.println("可贷款额度："+"2000000");
    	}
    	System.out.println("请输入要贷款金额：");
    	Scanner input=new Scanner(System.in);
    	String m=input.next();
    	int d1;
		d1=Integer.parseUnsignedInt(m);
		System.out.println("请输入要贷款时间：");
		String n=input.next();
		int d2;
		d2=Integer.parseUnsignedInt(n);
		if(d2<1){
			System.out.println("您贷款所需归还利息为："+d1*0.0435);
		}
		else if(d2<5){
			System.out.println("您贷款所需归还利息为："+d1*0.0475);
		}
		if(d2>5){
			System.out.println("您贷款所需归还利息为："+d1*0.0490);
		}
    	System.out.println("..............贷款成功..............\n");
    	System.out.println("当前余额："+(a.getMoney()+d1));
    	
    	System.out.println("输入1继续打印细则：");
    	String l=input.next();
    	System.out.println("..............贷款细则..............\n");
    	System.out.println("第一条\t为规范***银行（以下简称本行）个人贷款业务操作行为，防范个人贷款业务操作风险，根据国家相关法律法规、银监会《个人贷款管理暂行办法》以及本行《信贷管理基本制度》、《贷款操作规程》和《个人贷款管理办法》等内部规章制度，制定本细则。\n"
+"第二条\t本细则是本行各分支机构经营个人贷款业务必须遵循的操作准则，是考核个人信贷业务工作依法、合规情况的基本依据。\n"+"第三条\t本细则是本行个人贷款业务操作流程的细化，是对个人贷款业务的借款受理、尽职调查、风险评价、贷款审批、贷款签约、贷款发放、支付管理、贷后管理、逾期贷款管理等工作环节和全流程管理的具体要求。\n"+
 "第四条\t本行的个人贷款业务实行分级审批、审贷分离的管理制度。\n"+"第五条\t本细则所指有权审批人是指董事长授权的总行行长,总行行长在授权范围内转授权的总行副行长及其他审批人员。\n"+"第六条\t办理个人贷款业务应遵循依法合规、审慎经营、平等自愿、公平诚信的原则。");
    	System.out.println("..............请选择................\n");
    	System.out.println("1.返回");
    	System.out.println("2.退出");
    	String k=input.next();
    	int d3;
    	d3=Integer.parseUnsignedInt(k);
    	if(d3==1){
    		
    		a.Choose();
    		a.setMoney(a.getMoney()+d1);
    	}
    	if(d3==2){
    		System.out.println("....................再见.....................");
    		System.exit(0);
    	}
	}
}
