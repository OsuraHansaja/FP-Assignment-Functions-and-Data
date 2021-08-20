
object Bank{

    class Account(id:String,n:Int,b:Double)
        {
            val nic:String=id 
            val acnumber: Int = n 
            var  balance: Double = b      
        
            override def toString =  "["+nic+":"+acnumber +":"+ balance+"]"
        }

    def main(args:Array[String])
    {
      var Acc1=new Account("992150688v",201031,30000);
      var Acc2=new Account("982143732v",201043,40000);
      var Acc3=new Account("973765823v",202031,50000);
      var Acc4=new Account("998797268v",202056,0);
      var Acc5=new Account("954318798v",203043,-1000);
      var Acc6=new Account("993128687v",203067,-5000);
      var Acc7=new Account("993276821v",204058,-10000);
      

      val accounts:List[Account]=List(Acc1,Acc2,Acc3,Acc4,Acc5,Acc6,Acc7);

      val overdraft = (b: List[Account]) => b.filter(x=>x.balance.<(0))
      //Finding accounts with negative balance
      println("\nList of accounts with negative balances : " + overdraft(accounts));


      val totalBal= (b: List[Account]) => b.reduce((x, y)=>new Account(x.nic,x.acnumber,x.balance+ y.balance))
      //Getting the total balance of all accounts

      println("\nTotal balance of all accounts : " + totalBal(accounts).balance);
      println("\n");
        
      //Getting the balances of accounts with positive and negative balances after the applying interests.
      val DepositInterest=(b: List[Account]) => b.filter(x=>x.balance.>(0)).map(x=>x.balance*105/100)
      val OverdraftInterest=(b: List[Account]) => b.filter(x=>x.balance.<(0)).map(x=>x.balance*11/10)

      println("\n\nBalances of accounts,");
      println("\nAfter applying deposit interests   : " + DepositInterest(accounts));
      println("\nAfter applying overdraft interests : " + OverdraftInterest(accounts));   
    }
}