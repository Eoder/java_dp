package A1_6;
public class Main {
    public static void main(String[] args) {
        System.out.println("Testing EaterThread, hit CTRL+C to exit.");
        Tool spoon = new Tool("Spoon");
        Tool fork = new Tool("Fork");
        new EaterThread("Alice",  fork,spoon).start();
        new EaterThread("Bobby", fork,spoon).start();
    }
}
