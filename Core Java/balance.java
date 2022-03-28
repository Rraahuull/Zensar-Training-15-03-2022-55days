import java.util.InputMismatchException;
import java.util.Scanner;

public class balance {
    public static void main(String[] args) {
         try(Scanner sc = new Scanner(System.in)){
            int num= sc.nextInt(); 
            num=num/0;
            System.out.println(num);
            try{
                String str = null;
                System.out.println(str.charAt(0));
            }catch(NullPointerException ne){
                System.out.println("No data");
            }catch(InputMismatchException ie){
                System.out.println("wrong input");
            }catch(ArithmeticException ae){
                System.out.println("Arithmetic exception occured");
            }catch(Exception e){
                System.out.println("Other exception occured");
            }finally{
                System.out.println("Executed successfully");
            }
    }
    
}
}

