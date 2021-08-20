
object Rational{

    class Rational(i:Int, j:Int)
    {

        require(j>0)

        def gcd(x:Int, y:Int):Int = if(y==0) x else gcd(y,x%y)
        
        val numerator = i/gcd(Math.abs(i),j)
        val denominator = j/gcd(Math.abs(i),j)
        def this(i:Int)=this(i,1)


        def +(r:Rational) = new Rational(this.numerator*r.denominator+this.denominator*r.numerator,
        this.denominator*r.denominator)

        def neg=new Rational(-this.numerator,this.denominator)

        def -(r:Rational)=this + r.neg      

        override def toString = numerator+"/"+denominator
    }

    def main(args:Array[String])
    {
        val r1 = new Rational(3,4)
        val r2 = new Rational(5,8)
        val r3 = new Rational(2,7)
        val sub = (r1-r2)-r3;

        println("\n\n x = "+r1+"   y = "+r2+"   z = "+r3);
        println("\n\n Negative of "+r2+" : "+r2.neg);
        println("\n Subtraction of "+r1+" , "+r2+ " and "+r3+" : "+sub);
        
        print("\n")
    }

}