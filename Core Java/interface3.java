class interface3 implements Cloneable {
    String date_of_birth =null;
    public interface3 (String args){
        this.date_of_birth =args;
    }
    public static void main(String[] args) {
        try{
            interface3 e = new interface3("10-12-2001");
            System.out.println(e.clone().toString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public String toString(){
        return "interface3 [date_of_birth"  + date_of_birth  + "]";
        
    }
    
}
