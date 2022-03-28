interface Printable {
    void printall();
}
class Employee implements Printable{
   public void printall(){
        System.out.println("employee details");
    }
}
class Circle implements Printable{
   public void printall(){
        System.out.println("circle");
    }
}
class print{
    public static void main(String [] args){
        Employee emp = new Employee();
 emp.printall();
 Circle cir= new Circle();
 cir.printall();
    }

}