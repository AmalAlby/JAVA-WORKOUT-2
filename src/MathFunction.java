import java.util.*;
public class MathFunction {
    void multiply(int x,int y){
        System.out.println("THE PRODUCT IS : "+x*y);
    }
    void multiply(float x,float y){
        System.out.println("THE PRODUCT IS : "+x*y);
    }
    void multiply(float x,int y){
        System.out.println("THE PRODUCT IS : "+x*y);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("1. MULTIPLICATION OF TWO INTEGERS"+"\n"+"2. MULTIPLICATION OF TWO FLOATS"+"\n"+"3. MULTIPLICATION OF A FLOAT AND AN INTEGER");
        System.out.print("PLEASE ENTER YOUR CHOICE(1 / 2 / 3) : ");
        int choice=sc.nextInt();
        int x,y;
        float a,b;
        MathFunction m1=new MathFunction();
        switch(choice){
            case 1:
                System.out.println("PLEASE ENTER THE NUMBERS: ");
                x=sc.nextInt();
                y=sc.nextInt();
                m1.multiply(x,y);
                break;
            case 2:
                System.out.println("PLEASE ENTER THE NUMBERS: ");
                x=sc.nextInt();
                y=sc.nextInt();
                a=x;
                b=y;
                m1.multiply(a,b);
                break;
            case 3:
                System.out.println("PLEASE ENTER THE NUMBERS: ");
                x=sc.nextInt();
                y=sc.nextInt();
                a=x;
                m1.multiply(a,y);
                break;
            default:
                System.out.println("INVALID NUMBER...PLEASE ENTER A NUMBER AS PER THE STIPULATIONS....");
                break;
        }
    }
}



