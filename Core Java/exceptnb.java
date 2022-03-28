public class exceptnb{
    public static void main(String[] args) {
        try{
            System.out.println(45/0);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("finally executed");
        }
    }
}