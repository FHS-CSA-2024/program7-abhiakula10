import java.util.Scanner;

public class Program7 {
  
public static void main(String[] args){
    double sbuck;
    double klevins;
    double snickels;
    double newSbuck

    Scanner newNum = new Scanner(System.in);
    
  System.out.print("Enter the Schrute-Bucks: ");
    sbuck = newNum.nextDouble();
    
  System.out.print("Enter thr Klevins: ");
    klevins = newNum.nextDouble();
    
  System.out.print("Enter the STanley-Nickels");
    snickels = newNum.nextDouble();
    newSbuck = sbuck + klevins*( 1.0 / 20 ) + snickels*( 1.0 / 240 );
   
  System.out.println(newSbuck);
}



}

//Paste console output below:
/*
Enter schrute-bucks: 7
Enter klevins: 17
Enter stanley-nickels: 9
7.887

*/
