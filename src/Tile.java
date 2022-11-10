import java.util.Scanner;

public class Tile {
    private int edge;
    private int area;
    Tile(int edge){
        this.edge=edge;
        this.area=edge*edge;
    }
    int getArea(){
        return area;
    }

}
class Floor{
    private int length;
    private int width;
    Floor(int length,int width){
        this.length=length;
        this.width=width;
    }
    void totalTiles(Tile t){
        double tileArea=t.getArea();
        double floorArea=length*width;
        double  NoofTiles=floorArea/tileArea;
        System.out.println("NUMBER OF TILES :"+NoofTiles);
    }
}
class Home{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF THE TILE : ");
        int tileLength=sc.nextInt();
        Tile t=new Tile(tileLength);
        System.out.println("ENTER THE LENGTH AND WIDTH OF THE FLOOR :");
        int fLength=sc.nextInt();
        int fWidth=sc.nextInt();
        Floor f=new Floor(fLength,fWidth);
        f.totalTiles(t);
    }
}