import java.util.*;
public class Employee {

    public float total_calculation(int as1,int as2,int as3){
        float total_Marks=as1+as2+as3;
        return total_Marks;
    }

    public float percentage_calculation(float total){
        float percentage1=(total/300)*100;
        return percentage1;
    }

    public void display(String name,int empid,float total,float perc,String result){
        System.out.println("BELOW ARE THE RESULTS OF THE GIVEN EMPLOYEE........");
        System.out.println("EMPLOYEE NAME: "+name+"\n"+"EMPLOYEE ID : "+empid+"\n"+"TOTAL MARKS : "+total+"\n"+"PERCENTAGE : "+perc+"\n"+"RESULT : "+result);
    }

    public static void main(String[] args){
        String Name;
        int emp_id,asm_1,asm_2,asm_3;
        float total,percentage;
        String result;
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter Your Name: ");
        Name=sc.next();
        System.out.print("Please Enter Employee ID : ");
        emp_id=sc.nextInt();
        System.out.print("Please Enter The Assessment marks : ");
        asm_1=sc.nextInt();
        asm_2=sc.nextInt();
        asm_3=sc.nextInt();
        if(asm_1>75&&asm_2>75&&asm_3>75){
            result="Promoted";
        }
        else{
            result="Demoted";
        }
        Employee e1=new Employee();
        total=e1.total_calculation(asm_1,asm_2,asm_3);
        percentage= e1.percentage_calculation(total);
        e1.display(Name,emp_id,total,percentage,result);
    }
}
