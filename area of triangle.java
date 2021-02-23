import java.util.*;
public class Main{
    static double area(double b,double h){
        double a=(b*h)/2;
        return a;
    }
    public static void main(String[]args){
        double base,height;
        Scanner sc=new Scanner(System.in);
        base=sc.nextDouble();
        height=sc.nextDouble();
        double ar=area(base,height);
        System.out.printf("%.3f",ar);
    }
}
