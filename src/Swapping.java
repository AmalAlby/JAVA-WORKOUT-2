import java.util.Scanner;
public class Swapping {
    static int num1,num2,temp;
    Swapping(int num_1,int num_2){
        num1=num_1;
        num2=num_2;
    }
    public void swap(Swapping s){
        temp=s.num1;
        s.num1=s.num2;
        s.num2=temp;
        System.out.println("After swapping the numbers using call by reference method:"+"\n"+"FIRST NUMBER : "+s.num1+"\n"+"SECOND NUMBER : " +s.num2+"\n");
    }
    public void swap(int num1,int num2){
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swapping the numbers using call by value method:"+"\n"+"FIRST NUMBER : "+num1+"\n"+"SECOND NUMBER : " +num2+"\n");
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER : ");
        int n1 = s.nextInt();
        System.out.println("ENTER THE SECOND NUMBER : ");
        int n2 = s.nextInt();
        Swapping S = new Swapping(n1, n2);
        S.swap(n1,n2);
        S.swap(S);
    }
}