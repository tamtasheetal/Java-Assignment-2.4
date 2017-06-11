import java.util.Scanner;
class Grade {
 public static void main(String[] args) 
 {
	        int mark[] = new int[3];
	        int i;
	        float sum=0;
	        float avg, perc;
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("Enter marks Obtained in 3 Subjects : Physics, Chemistry, Math ");
	        for(i=0; i<3; i++)
	        {
	            mark[i] = scan.nextInt();
	            sum = sum + mark[i];
	        }
			
	        avg = sum/3;
	        perc = (sum/300) * 100;
			
	        System.out.print("Average Marks = " +avg);
			
	        System.out.print("\nPercentage = " +perc+ "%");
 {
	 int x = 71;
  int y = 61;
  int z = 55;
  int average=0;
 if (x > 100 | y > 100 | z > 100 | x < 0 | y < 0 | z <0 ) {
  System.out.println("The entered number is not with in the range from 0 to 100. Please enter a valid number.");
 } else {
  average = (x + y + z) / 3;
  System.out.println("Average : " + average);
 } 
 if (average>71){
  System.out.println("Grade : A");
}else if(average>61){
  System.out.println("Grade : B");
}else if(average>50){
  System.out.println("Grade : c");
}else if(average>0){
  System.out.println("Grade : D");
}
}
}
}

