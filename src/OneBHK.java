public class OneBHK {
    private double roomArea;
    private double hallArea;
    private double price;

    OneBHK(){
        roomArea=0;
        hallArea=0;
        price=0;
    }

    OneBHK(double r_area,double h_area,double r_price){
        this.roomArea=r_area;
        this.hallArea=h_area;
        this.price=r_price;
    }

    void show(){
        double temp;
        System.out.println("\nRoom Area : "+roomArea+"\nHall Area : "+hallArea+"\nPrice : "+price);
    }
}

class TwoBHK extends OneBHK{
    private double room2Area;
    TwoBHK(double r_area, double h_area, double r_price,double r2_area) {
        super(r_area, h_area, r_price);
        this.room2Area=r2_area;
    }

    void show(){
        super.show();
        System.out.println("Room 2 Area : "+room2Area);
    }
}

class DriverClass {
    public static void main(String[] args){
        double total_price=0;
        TwoBHK t1=new TwoBHK(10,15,1000000,20);
        TwoBHK t2=new TwoBHK(15,20,1200000,25);
        TwoBHK t3=new TwoBHK(20,25,1400000,30);
        System.out.println("\nTHE DETAILS OF THE FLATS ARE: ");
        t1.show();
        t2.show();
        t3.show();
        int total=1000000+1200000+1400000;
        System.out.println("THE TOTAL AMOUNT OF ALL THE FLATS IS : "+ total);
    }
}
