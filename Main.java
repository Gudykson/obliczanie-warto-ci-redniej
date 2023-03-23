import java.util.Random;
import java.util.*;
class UserInputDemo
  {
class Main {
  public static void main(String[] args) {
    //double suma = 0;
    double srednia = 0;
    double max = 0;
    Scanner sc= new Scanner(System.in);   
    System.out.print("Wpisz n");  

    int n =sc.nextInt();
    for(int i=0;i<n;i++){
      Random rand = new Random();
        int upperbound = 100;
      double a = rand.nextDouble(upperbound);
     
      //System.out.println("Wygenerowana liczba nr." + (i + 1) +  ": " + a);
      srednia = srednia + a/n;
      if (a>max) 
      {
        max=a;
      }
      
    }
    System.out.println("średnia wynosi " + srednia);
    //System.out.println("max wynosi " + max);
   
  }
}
  }