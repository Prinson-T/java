public class FactMethod {
    public void fact(int a){
        for (int i=1;i<=4;i++) {
            a = a * i;

        }
        System.out.println(a);
    }
    public static void main(String[] args) {
        FactMethod f=new FactMethod();
        f.fact(5);

    }
}
