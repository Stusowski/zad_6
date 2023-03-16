import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] liczby = new int[5];
    int w=0;
    System.out.println("Podaj pięć liczb: ");
    for(int i=0;i<5;i++){
      liczby[i] = in.nextInt();
    }
    for(int i=0;i<5;i++){
      if(liczby[i]%3==0){
        w = w + liczby[i];
      }
    }
     System.out.println("Suma liczb podzielnych przez 3 to: " +w);
  }
}