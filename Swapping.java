import java.util.Scanner;
public class Swapping {
    public static void main(String []arg){
        int a,b;
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the a value=");
        a=sc.nextInt();
        System.out.print("Enter the a value=");
        b=sc.nextInt();
        System.out.println("Before the swapping are \na="+a+"\nb="+b);
    
    /*a=a+b;
	b=a-b;
	a=a-b;*/
	
	/*int tem=a;
	a=b;
	b=tem;*/
	
	/*b=a+b-(a=b);*/
 
	/*a=a*b;
	b=a/b;
	a=a/b;*/
	
	/*a=a^b;
	b=a^b;
	a=a^b;*/
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After the swapping are \na="+a+"\nb="+b); 

    }
    
}
