class Opeartor{

public static void main(String args[]){

int a;

int b;

String op ;

Scanner scanner = new scanner(System.in);

System.out.println("Enter the value of a");


a = scanner.nextInt();

System.out.println("Enter the value of b");

b = scanner.nextInt();

System.out.println("Enter the operator +,-,*,/");

op = scanner.next();


switch(op){

case "+": System.out.println(a+b); 
break;

case "-": System.out.println(a-b);
 break;

case "*": System.out.println(a*b);
 break;

case "/": System.out.println(a/b); 
break;

default: System.out.println("Invalid input");
}

}

}