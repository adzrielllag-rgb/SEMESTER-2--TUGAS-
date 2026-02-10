import java.util.Scanner;

public class prakperulangan {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Masukan NIM : ");
    long nim = sc.nextLong();
    
    long  n = nim % 100;
    
    if (n<10) {
      n = n + 10;
    }
    
    System.out.println("n = " + n);
    
    for (int i = 1; i <= n; i++) {
      
      if (i == 10 || i == 15){
        continue;
      }
      
      if (i % 3 == 0){
          System.out.print(" # ");
      } else if (i % 2 == 0){
          System.out.print(i + "");
      } else {
          System.out.print(" * ");
      }
    }

  }
  
}
