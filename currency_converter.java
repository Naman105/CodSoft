import java.util.Scanner;

public class currency_converter{

    public static void main(String[] args){

        java.util.Scanner scanner= new Scanner(System.in);

        System.out.println("Welcome to currency converter");
        System.out.println("1. USD to Rupee");
        System.out.println("2. Rupee to USD");
        System.out.println("3. EURO to Rupee");
        System.out.println("4. Rupee to EURO");
        System.out.print("Enter your preference (1 or 2 or 3 or 4):");
        int choice=scanner.nextInt();

        if(choice==1){
            System.out.print("Enter the amount in USD:");
            double USD=scanner.nextDouble();
            double Rupee=usdToRupee(USD);
            System.out.println("Amount converted in Rupee:" +Rupee);
        }
        else if(choice==2){
            System.out.print("Enter the amount in Rupee:");
            double Rupee=scanner.nextDouble();
            double USD=RupeeToUsd(Rupee);
            System.out.println("Amount converted in USD:" +USD);


        }
        else if(choice==3){
            System.out.print("Enter the amount in EURO:");
            double EURO=scanner.nextDouble();
            double Rupee=euroToRupee(EURO);
            System.out.println("Amount converted in Rupee:" +Rupee);



        }
        else if(choice==4){
            System.out.print("Enter the amount in Rupee:");
            double Rupee=scanner.nextDouble();
            double EURO=RupeeToEuro(Rupee);
             System.out.println("Amount converted in EURO:" +EURO);



        }
        else{
            System.out.println("Invalid choice. Please select 1 or 2 or 3 or 4.");
        }
        scanner.close();
    }

    public static double usdToRupee(double USD) {
        return USD * 83.54;  // Date: 23/09/24
    }
    public static double RupeeToUsd(double Rupee) {
        return Rupee * 0.012;   // Date 23/09/2024
    }
    public static double euroToRupee(double EURO) {
        return EURO *92.86;   //Date: 23/09/24
    }
    public static double RupeeToEuro(double Rupee) {
        return Rupee *0.011;   //Date: 23/09/24
    }

} 