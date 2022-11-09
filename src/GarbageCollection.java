public class GarbageCollection {
    static int counter=0;
    static int counter2=0;
    GarbageCollection(){
        this.counter++;
    }

    public static void main(String[] args) {
        GarbageCollection t1=new GarbageCollection();
        GarbageCollection t2=new GarbageCollection();
        GarbageCollection t3=new GarbageCollection();
        t1=null;
        System.gc();
        Runtime.getRuntime().gc();
        System.out.println("No of instances created:"+counter);
        System.out.println("No of instances Destroyed:"+counter2);
        System.out.println("No of instances Alive:"+(counter-counter2));
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector called");
        System.out.println("Object Garbage Collected");
        this.counter2++;
    }
}
