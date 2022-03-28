public class string_strbuf {
    public static void main(String[] args) {
        String s1="string";
        s1= s1 +"is added";
        StringBuffer stbuf= new StringBuffer("string");
        stbuf.append("is added");
        System.out.println(s1);
        System.out.println(stbuf);
    }
    
}
