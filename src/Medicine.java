public class Medicine {
    public void displayLabel(){
        System.out.println("Name:ASTER PHARMACY");
        System.out.println("Address: ANGAMALY,KERALA");

    }
}
class Tablet extends Medicine{
    public void displayLabel(){

        System.out.println("INFO: Store in a cool dry place");
    }

}
class Syrup extends Medicine{
    @Override
    public void displayLabel() {
        System.out.println("INFO: Consumption as directed by the physician");
    }
}
class ointment extends Medicine{

    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("INFO: For external use only");
    }
}
class TestMedicine{
    public static void main(String[] args) {
        double i = Math.random() * 4;
        System.out.println("1. TABLET\n2. SYRUP\n3. OINTMENT");
        int a = (int) i;
        System.out.println("THE RANDOMLY SELECTED OPTION IS :"+a);
        switch (a) {
            case 1:
                Medicine c = new Medicine();
                Tablet t = new Tablet();
                c.displayLabel();
                t.displayLabel();
                break;
            case 2:
                Medicine e = new Medicine();
                Syrup S = new Syrup();
                e.displayLabel();
                S.displayLabel();
                break;
            case 3:
                Medicine d = new Medicine();
                ointment o = new ointment();
                o.displayLabel();
                break;
        }
    }
}
