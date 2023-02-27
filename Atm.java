import java.util.Scanner;
class Atm
{Account a;
static Scanner sc=new Scanner(System.in);






public void createAccount()                       //1
  {
if (a==null)
{
System.err.println("enter a name ");
String name=sc.next();

System.err.println("enter pswd");
int pswd =sc.nextInt();

System.err.println("enter bal");
double bal=sc.nextDouble();

System.err.println("enter account number");
long Acctno=sc.nextLong();

a=new Account(name,pswd,bal,Acctno);

System.err.println("Account  is created ");}
else 
{System.out.println("account is already logged");}

}






public void withdraw()                       //2

{ 
  if(a!=null)
{ System.out.println("enter account number");
  long Acctno1=sc.nextLong();
    if(Acctno1==a.getAcctno())
{
System.out.println("enter pswd");
int pswd=sc.nextInt();                            //l 25
if(pswd==a.getPswd())
{ System.out.println("enter amount");
double money=sc.nextDouble();      //10000
if(a.getBal()>=money)
{ double newMoney=a.getBal()-money;
a.setBal(newMoney);
System.out.println("transaction successful.  collect your money");}
else
{
System.out.println("insufficient funds");
}                                                    
}
 else
{
System.out.println("enter correct pswd");
}
}
else 
{System.out.println("enter correct Account  number");}
}
else 
{System.out.println("account not found , create your account first");}


}




public void deposit()                                      //3                   
{
if (a!=null)
{System.out.println("enter account number");

if(a.getAcctno()==sc.nextLong())

{System.out.println("enter passward");

if(a.getPswd()==sc.nextInt())

{System.out.println("enyter money");

double newMoney=a.getBal()+sc.nextInt();
a.setBal(newMoney);
System.out.println("money credited in your Account");

}
else 
{System.out.println("enter correct passward");}

}
else 
{System.out.println("enter correct account number");}
}
else 
{
System.out.println("first create account");
}

}







public void checkBalance()                                     //4
{
if (a!=null)
{
System.out.println("enter account number");
  long Acctno=sc.nextLong();
    if(Acctno==a.getAcctno())
{
  System.out.println("enter pswd");
int pswd=sc.nextInt();

if(pswd==a.getPswd())
{System.out.println(a.getBal());}
else 
{System.out.println("incorrect pin");}
}
else 
{System.out.println("enter correct Account number");}
}
else 
{System.out.println("account not fount ,first create account");}
}



public void removeAccount()                                     //5
{ if(a!=null)
{ System.out.println("enter previous username");
String name=sc.next();
System.out.println("enter previous password");
 int pswd=sc.nextInt();

if(name==a.getName() && pswd==a.getPswd())
{System.out.println("account removed");}
else 
{System.out.println("wrong informatoin ,enter correct information");}}
else 
{System.out.println("first Add account");}
}


}






































