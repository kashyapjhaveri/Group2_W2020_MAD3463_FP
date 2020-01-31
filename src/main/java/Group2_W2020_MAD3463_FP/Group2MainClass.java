package Group2_W2020_MAD3463_FP;

import Group2_W2020_MAD3463_FP.PersonPack.Customer;

import java.time.LocalDate;
import java.util.Scanner;

public class Group2MainClass {

    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            int choice=0;

            do {
                System.out.println("=============================");
                System.out.println("+++++++++++CREATE++++++++");
                System.out.println("1.Person");
                System.out.println("2.Vehical");
                System.out.println("+++++++++++++++++++++++++");
                System.out.println("0.Exit");
                System.out.println("=============================");
                System.out.println(" ");
                System.out.print("Enter your choice: -");
                choice=input.nextInt();

                switch (choice)
                {
                    case 1:
                    {
                        /*int nextChoice=0;

                        do {
                            System.out.println("+++++++++++++++++++");
                            System.out.println("1.Customer");
                            System.out.println("2.Owner");
                            System.out.println("3.Driver");
                            System.out.println("0.Previous menu");
                            System.out.println("+++++++++++++++++++");
                            System.out.println(" ");
                            System.out.print("Enter your choice: -");
                            nextChoice=input.nextInt();

                            switch (choice)
                            {
                                case 1:
                                {

                                }
                                case 2:
                                {

                                }
                                case 3:
                                {

                                }
                                case 0:
                                {
                                    break;
                                }
                            }
                        }
                        while (nextChoice!=0);*/
                        /*Customer kashyap = new Customer(1,"Kashyap","Jhaveri",Gender.male, LocalDate.of(1998,05,29),"7567549732","jhaverikashyap1998@gmail.com","kashyapjhaveri","kashyap123","4414","Lawrence Ave E","Scarborough","Ontario");
                        kashyap.print();*/
                    }

                    case 0:
                    {
                        input.close();
                        break;
                    }
                }
            }
            while (choice!=0);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }

}
