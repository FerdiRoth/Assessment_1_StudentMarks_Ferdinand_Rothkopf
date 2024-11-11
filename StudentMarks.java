
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
      
      // Input student grades
      System.out.println("Enter marks for " + StudentCount + " students (0-30):");
      
      for (int i = 0; i < StudentCount; i++){
          // While loop to leave if input is correct
          while (true){
              
          System.out.printf("Student %d Mark: ", i+1);
          
          float temp = scan.nextFloat();
          
          if (temp < 0 || temp > 30){
              System.out.println("Invalid mark, please reenter");
              continue;
          } else {
              marks[i] = temp;
              break;
          }
        }
      }
      // Stored marks array output
      System.out.println("\nStudent Marks put in:");
      for (int i = 0; i < StudentCount; i++){
          System.out.printf("Student %d: ", i+1, marks[i]);
          System.out.println(marks[i]);
      }
      
      //Compute highest and lowest, mean and standard deviation
      //Initialising highest and lowest marks with first mark
      float highestMark = marks[0];
      float lowestMark = marks[0];
      //loop through marks to find highest and lowest
      for (int i = 1; i < StudentCount; i++){
          if(marks[i] > highestMark){
              highestMark = marks[i];
          }
          if(marks[i] < lowestMark){
              lowestMark = marks[i];
          }
      }
      //Output highest and lowest Mark
      System.out.printf("\nHighest mark: %.1f\n", highestMark);
      System.out.printf("Lowest mark: %.1f\n\n", lowestMark);
      
      //Compute mean and standard deviation
      //Compute mean
      float total = 0;
      float mean = 0;
      for (int i = 0; i < StudentCount; i++){
          total += marks[i];
      }
      
      mean = total / StudentCount;
      System.out.printf("Mean value %.1f\n", mean);
 
      //Compute standard deviation
      float sumdiff = 0;
      
      for (int i = 0; i < StudentCount; i++){
          sumdiff += (marks[i] - mean) * (marks[i] - mean);
      }
      
      sumdiff = (float) Math.sqrt(sumdiff / StudentCount);
      System.out.printf("Standard deviation value %.1f\n", sumdiff);
    }
}