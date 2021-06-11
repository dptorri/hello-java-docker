import java.io.*;
import java.util.*;

public class Hello {
   public static void main(String args[]) throws IOException {
      String pathString = System.getProperty("java.io.tmpdir");
      String [] fileNames = new File(pathString).list();
      System.out.println("HELLO");
      System.out.println("==============================");
      System.out.println("Your 5 first files on tmp folder");
      for (int i = 0; i < 5; i++) {
         System.out.println(fileNames[i]);
      }
   }
}
