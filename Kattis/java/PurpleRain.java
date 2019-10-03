
import java.util.Scanner;

//BBRRBRRBRB

public class PurpleRain {

  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String s = in.next();
      int[] arr = new int[s.length()];
      for(int i = 0; i < s.length(); i++){
          if(s.charAt(i) == 'B'){
              arr[i] = -1;
          } else {
              arr[i] = 1;
          }
      }
      
      int globalMax, currMax; 
      globalMax = currMax = arr[0];
      int globalStart, globalEnd, currStart;
      globalStart = globalEnd = currStart = 0;
      
      for(int i = 1; i < arr.length; i++){
          if(currMax + arr[i] >= arr[i]){
              currMax = currMax + arr[i];
          } else {
              currMax = arr[i];
              currStart = i;
          }
          
          if(currMax > globalMax){
              globalMax = currMax; 
              globalStart = currStart;
              globalEnd = i;
          }
      }
      
      
      int globalMin, currMin; 
      globalMin = currMin = arr[0];
      int globalStart2, globalEnd2, currStart2;
      globalStart2 = globalEnd2 = currStart2 = 0;
      
      for(int i = 1; i < arr.length; i++){
          if(currMin + arr[i] <= arr[i]){
              currMin = currMin + arr[i];
          } else {
              currMin = arr[i];
              currStart2 = i;
          }
          
          if(currMin < globalMin){
              globalMin = currMin; 
              globalStart2 = currStart2;
              globalEnd2 = i;
          }
      }
      
      globalStart += 1;
      globalEnd += 1;
      globalStart2 += 1;
      globalEnd2 += 1;
      
      if(globalMax > Math.abs(globalMin)){
          System.out.println(globalStart + " " + globalEnd);
      } else if(globalMax < Math.abs(globalMin)){
          System.out.println(globalStart2 + " " + globalEnd2);
      } else {
          if(globalStart < globalStart2){
              System.out.println(globalStart + " " + globalEnd);
          } else if(globalStart2 < globalStart){
              System.out.println(globalStart2 + " " + globalEnd2);
          } else {
              if(globalEnd < globalEnd2){
                  System.out.println(globalStart + " " + globalEnd);
              } else if(globalEnd2 < globalEnd){
                  System.out.println(globalStart2 + " " + globalEnd2);
              } else {
                  System.out.println(globalStart + " " + globalEnd);
              }
          }
      }
  }
}