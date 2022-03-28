interface Sortable {
    void sortall();
}
class employee implements Sortable{
    
    public static void main(String[] args) {    
        employee e= new employee();
        e.sortall();
        circle c= new circle();
        c.sortall();
    }

   public void sortall(){
       int [] a={2,5,1,8,3};
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a.length;j++){
               if(a[i]<a[j]){
              int  temp=a[i];
               a[i]=a[j];
               a[j]=temp;
           }
           }
       }
       for(int i: a)
       System.out.print(i+" ");

   }
}
   class circle implements Sortable{
       public void sortall(){
           int [] a={2,5,1,8,3};
         for(int i=0;i<a.length;i++){
                 for(int j=0;j<a.length;j++){
                   if(a[i]<a[j]){
                  int temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
               }
           }
           for(int i: a)
           System.out.print(i+" ");
       }
       }
       
