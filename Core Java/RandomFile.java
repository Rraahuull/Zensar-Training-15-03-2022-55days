import java .io.IOException;
import java .io.RandomAccessFile;

   class RandomFile{
     public static void main(String[] args) {
   try{
       RandomAccessFile ra= new RandomAccessFile("myFile.txt","rw");
       ra.seek(12);
       ra.writeBytes("Rahul");
      /* ra.writeDouble(23.45);
       ra.writeFloat(9.78f);*/
       System.out.println(ra.readLine());
          ra.close();
 }catch(IOException e){
        e.printStackTrace();
 }
 }
}