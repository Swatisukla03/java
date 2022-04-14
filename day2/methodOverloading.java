package day2;

public class methodOverloading {
    static int plusMethodInt(int x,int y){
        return x+y;
    }
    static double plusMethodDouble(double x,double y){
        return x+y;
    }
    public static void main(String[] args){
        int num1=plusMethodInt(8, 9);
        double num2=plusMethodDouble(4.5, 9.67);
        System.out.println("Int :"+num1);
        System.out.println("Double :"+num2);
    }
}
