public class exceptna {
    public static void main(String[] args) {
        try{
            System.out.println("Rahul");
            try{
                System.out.println(45/0);}
            catch(ArithmeticException e){
                e.printStackTrace();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    
}
