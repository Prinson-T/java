public class PaldromeMethod {
    public void pald(int a,int sum){
        int b,z=a;
        while (a > 0){
            b = a % 10;
            sum = sum * 10 + b;
            a/= 10;
        }
        System.out.println(sum);
        if (z==sum){
            System.out.println("number is palndrome");
        }else {
            System.out.println("not palndrome");
        }
    }
    public static void main(String[] args) {
        PaldromeMethod p=new PaldromeMethod();
        p.pald(151,0);
    }
}
