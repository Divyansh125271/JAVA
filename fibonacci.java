public class Fibonacci{
public static void main(String args[]){
int n = 10,t1 = 0,t2 = 1 ;
System.out.println("Fibonacci Series till " + n + " terms:");

for(int i =1 ; i<=n ; ++i ){
  System.out.println(t1 + " , ");
   int t3 = t1+t2;
   t1 = t2 ;
   t2 = t3;
  }

}

}