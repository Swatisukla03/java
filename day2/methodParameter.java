package day2;

public class methodParameter {
    static void checkAge(int age){
        if(age<18){
            System.out.println("Access denied- You are not old enough !");
        }else if(age<30){
            System.out.println("Access granted -You  perfectly Eligible !");
        }
        else{
            System.out.println("Access granted- You are old ennough");
        }
    }
    public static void main(String[] args){
        checkAge(20);
    }
    
}
