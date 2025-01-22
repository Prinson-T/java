public class FihonMethod {
    public void fihon(int num1,int num2){
        int sum;
        for (int i=0;i<10;i++){
            sum=num1+num2;
            num1=num2;
            num2=sum;
            System.out.println(sum);
        }

    }
    public static void main(String[] args) {
        FihonMethod g=new FihonMethod();
        g.fihon(0,1);

    }
}
