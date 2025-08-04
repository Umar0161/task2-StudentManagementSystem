import java.io.*;
class FileH1 {
   public static void main(String[] args)
   throws IOException {
  
 String s1="umar khalid Moshahid Hashmi";
 FileOutputStream h1=new FileOutputStream("a.txt");
 char c1[]=s1.toCharArray();
 for(int i=0;i<c1.length;i++)
 h1.write(c1[i]);
 h1.close();

    
   } 
}
