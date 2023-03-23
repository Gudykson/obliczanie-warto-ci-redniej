import java.util.Random;
class Main {
  public static void main(String[] args) {
    //double suma = 0;
    double srednia = 0;
    double max = 0;
    int n =1000;
    for(int i=0;i<n;i++){
      Random rand = new Random();
        int upperbound = 100;
      double a = rand.nextDouble(upperbound);
      //suma = suma + Math.pow(a,2);
      //System.out.println("Wygenerowana liczba nr." + (i + 1) +  ": " + a);
      srednia = srednia + a/n;
      if (a>max) 
      {
        max=a;
      }
      
    }
    System.out.println("średnia wynosi " + srednia);
    System.out.println("max wynosi " + max);
    //System.out.println("Suma kwadratow tych " + n + " liczb losowych wynosi " + suma);
  }
}