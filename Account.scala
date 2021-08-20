
object Account{
  
  def main(args:Array[String])
  {
        class Account(id:String,n:Int,b:Double)
        {
            val nic:String=id 
            val acnumber: Int = n 
            var  balance: Double = b

            def transfer(a:Account,b:Double)=
            {
                this.balance=this.balance-b
                a.balance=a.balance+b
            }        
        
            override def toString =   "["+nic+":"+acnumber +":"+ balance+"]"
        }

    val i=new Account("992150688v",201031,30000)
    val j=new Account("992230032v",201732,50000)
    
    val m=4000

    println("\nAccount 01 [NIC: Account No: Balance] : "+i);
    println("Account 02 [NIC: Account No: Balance] : "+j);
    
    println("\n\nBefore transfering balance of Account 01 account : "+i.balance+" $");
    println("Before transfering balance of Account 02 account : "+j.balance+" $");
    
    val k=i.transfer(j,m)
    
    println("\n\nTransfering "+m+" $ from Account 01 to Account 02");
    
    println("\n\nNew balance of Account 02 account:"+j.balance+" $");
    println("New balance of Account 01 account:"+i.balance+" $");
    println("\n");
  }
}