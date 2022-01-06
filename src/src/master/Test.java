package master;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Amir");
        students.put(2, "Boss");
        FileWriter myFile = null;
//        try{
//            myFile = new FileWriter("students.txt");
//            for (String student: students.values()) {
//                myFile.write(student + "\n");
//            }
//            myFile.close();
//        }catch(IOException e){
//            e.printStackTrace();
//        }
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader("students.txt"));
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()){
                int loc = scanner.nextInt();
                String description = scanner.nextLine();
                System.out.println(loc);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (scanner != null){
                scanner.close();
            }
        }
    }
}
