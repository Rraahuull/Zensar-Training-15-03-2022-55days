public class commandline {
    public static void main(String[] args) {
        int n;
        n= args.length;
        for(int i=0;i<args.length;i++){
                for(int j=0;j<args.length;j++){
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
