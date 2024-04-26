import java.util.Scanner;

class ATM{
    private static double balance;
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter initial balance:");
        balance = scanner.nextDouble();
        
        while(true){
            System.out.println("1.Withdraw\n2.Deposit\n3.Check Balance\n4.Exit\nEnter your choice: ");
            int choice = scanner.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawamount = scanner.nextDouble();
                    if(withdrawamount <= balance){
                        balance -= withdrawamount;
                        System.out.println("Withdrawn : Rs." + withdrawamount);
                        System.out.println("Current Balance: Rs." + balance);
                    }else{
                        System.out.println("Insufficient funds..Cannot withdraw Rs." + withdrawamount);
                    }
                    break;
                    
                case 2:
                    System.out.println("Enter amount to deposit :");
                    double depositamount = scanner.nextDouble();
                    balance += depositamount;
                    System.out.println("Deposited : Rs." + depositamount);
                    System.out.println("Current Balance : Rs." + balance);
                    break;
                    
                case 3:
                    System.out.println("Current Balance : Rs." + balance);
                    break;
                    
                case 4:
                    System.out.println("Thankyou for using ATM.Goodbye!");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid choice.Please enter valid choice.");
            }
        }
    }
}