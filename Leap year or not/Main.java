import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		// Type your code here
      int yr=in.nextInt();
       if((yr%4 == 0) && (yr%100!=0))
       {
           System.out.print("Leap year");
       }
       else if((yr%100 == 0) && (yr%400 == 0))
       {
           System.out.print("Leap year");
       }
       else if(yr%400 == 0)
       {
           System.out.print("Non Leap year");
       }
       else
       {
           System.out.print("Non Leap year");
       }

    }
}