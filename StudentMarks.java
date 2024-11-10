
/**
 * Write a description of class StudentMarks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class StudentMarks
{
  public static void main(String[] args){
      
      int StudentCount = 5;
      float[] marks = new float[StudentCount];
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Give 30 Student Marks");
      
      for (int i = 0; i < StudentCount; i++){
          
          float temp = scan.nextFloat();
          
          if (temp < 0 || temp > 30){
              
              System.out.println("Invalid marks, please reenter");
              continue;
          }
          
          marks[i] = temp;
          
      }
      
      System.out.println("Student Marks put in:");
      for (int i = 0; i < StudentCount; i++){
          
          System.out.println(marks[i]);
          
      }
  }
}
