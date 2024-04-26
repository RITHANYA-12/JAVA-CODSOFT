import java.util.Scanner;

class grade{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int numSubject = scanner.nextInt();
        int sum=0;
        
        int[]  marks = new int[numSubject];
        for(int i=0;i<numSubject;i++){
            System.out.println("Enter the marks for subject:" + (i+1));
            marks[i] = scanner.nextInt();
            sum += marks[i];
        }
        System.out.println("Total Marks:" + sum);
        double average = (double)sum/numSubject;
        System.out.println("Average:" + average);
        if(average > 90.0){
            System.out.println("GRADE A");
        }else if(average < 90.0 & average >=70.0){
            System.out.println("GRADE B");
        }else if(average < 70.0 & average >=50.0){
            System.out.println("GRADE C");
        }else{
            System.out.println("GRADE D");
        }
        scanner.close();
        
    }
}