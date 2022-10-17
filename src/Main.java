public class Main {
    public static void main(String[] args) {
        Vector v=new Vector(10);
        v.push_back(10);
        v.push_back(5);
        v.push_back(7);
        System.out.println(v.getAt(1));
    }
}