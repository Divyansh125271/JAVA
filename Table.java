import java.util.Scanner;
  public class Table{
  public static void main(String args[]){
  int n ,i,product;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the value of n:");
  n = sc.nextInt();
  for(i=1 ; i<=10 ; i++){
     product= (n*i) ;

     System.out.println( n + "*"+ i + "="+ product);
      }

   }

}