import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriterProgram {
    
   public static void main(String[] args){

    File textFile = new File("main.txt");

    try {
        FileWriter writer = new FileWriter(textFile);
        writer.write("Jayquio Pinaka Pogi sa Balat ng Lupaaa!!!!!!!!");
        writer.close();
        System.out.println("Printed Successfully!");


    } catch (Exception e) {

        System.out.println("Nag error sya");
        e.printStackTrace();

        
      }
    
    }

   }


