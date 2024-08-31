//approach 1
public class Main
{
	public static void main(String[] args) {
	int n=8;
	int b_num=0;
	int rem;
	int cnt=0;
	while(n!=0){
	    rem=n%2;
	    double c=Math.pow(10,cnt);
	    b_num+=rem*c;
	    cnt++;
	    n=n/2;
	   // System.out.println(rem + " "+c+" "+ b_num+" "+cnt+" "+n);
	}
	System.out.println("b_num "+b_num);
	}
}
// approach 2
public class Main{
    public static void main(String[] args){
        int n=1001;
        int cnt=0;
        int decimal=0;
        int rem;
        while(n!=0){
            rem=n%10;
            decimal+=rem*Math.pow(2,cnt);
            n=n/10;
            cnt++;
        }
        System.out.println(decimal);
    }
}
