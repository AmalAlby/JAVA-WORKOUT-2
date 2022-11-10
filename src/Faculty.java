import java.util.Scanner;

public class Faculty {
    private  int Faculty_id;
    private float salary;

}
class FullTimeFaculty extends Faculty{
    float basic;
    float allowance;
    FullTimeFaculty(float basic,float allowance){
        this.basic=basic;
        this.allowance=allowance;

    }
    float salaryFull(){
        float salary1;
        salary1=(basic+allowance);
        return salary1;
    }
    void display1(){

        System.out.println("SALARY OF THE FULL TIME FACULTY : "+salaryFull());
    }
}
class PartTimeFaculty extends Faculty{
    int hour;
    float rate;
    PartTimeFaculty(int hour,float rate){
        this.hour=hour;
        this.rate=rate;
    }
    float salaryPart(){
        float salary2;
        salary2=(hour*rate);
        return salary2;
    }
    void display2(){
        System.out.println("SALARY OF THE PART TIME FACULTY : "+salaryPart());
    }
}
class Driverclass{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);

        System.out.println("PLEASE ENTER THE BASIC AND ALLOWANCE OF THE FIRST FULL-TIME FACULTY :");
        FullTimeFaculty full1=new FullTimeFaculty(s1.nextFloat(),s1.nextFloat());
        full1.display1();


        System.out.println("PLEASE ENTER RATE AND WORKING HOUR OF FIRST PART-TIME FACULTY :");
        PartTimeFaculty Part1=new PartTimeFaculty(s1.nextInt(),s1.nextFloat());
        Part1.display2();


        System.out.println("PLEASE ENTER THE BASIC AND ALLOWANCE OF THE SECOND FULL-TIME FACULTY : ");
        FullTimeFaculty full2=new FullTimeFaculty(s1.nextFloat(),s1.nextFloat());
        full2.display1();



        System.out.println("PLEASE ENTER THE RATE AND WORKING HOUR OF SECOND PART-TIME FACULTY : ");
        PartTimeFaculty Part2=new PartTimeFaculty(s1.nextInt(),s1.nextFloat());
        Part2.display2();



    }
}