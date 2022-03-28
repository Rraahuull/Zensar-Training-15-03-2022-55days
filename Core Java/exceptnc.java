public class exceptnc {
    public static void main(String[] args) {
        try{
            System.out.println(45/0);
        }finally{
            System.out.println("finally executed");
        }
    }
    
}
