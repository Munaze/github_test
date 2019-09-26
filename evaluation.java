import java.util.*;


public class evaluation{ 

public int add(int num1,int num2){
int res = num1 + num2;
return res;
}

public int subtract(int num1,int num2){

int res = num1 - num2;
return res;
}
public int multiply(int num1,int num2){

int res = num1 *num2;
return res;
}
public static void main(String[] args){
System.out.println("Menu");
System.out.println("enter your choice(1 for addition, 2 for subtraction, 3 for multplication");
Scanner sc= new Scanner(System.in);
int choice=1;
int num1=5;
int num2=4;
int res=0;
evaluation eval=new evaluation();
switch(choice){
	
	case 1: 
		System.out.println(eval.add(num1,num2));
		break;
	case 2:
		System.out.println(eval.subtract(num1,num2));
		break;
	case 3:
		System.out.println(eval.multiply(num1,num2));
		break;
	default:
		System.out.println("invalid input");



}

}
}
