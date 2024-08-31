// displays its smaller divisor

public class Main{
    public static void main(String[] args){
        int n=65;
        int i=2;
        while(true){
            if(n%i==0){
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}
