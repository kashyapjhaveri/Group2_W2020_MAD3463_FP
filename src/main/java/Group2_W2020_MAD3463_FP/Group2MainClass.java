package Group2_W2020_MAD3463_FP;

import Group2_W2020_MAD3463_FP.Enums.Fuel;
import Group2_W2020_MAD3463_FP.Enums.Gender;
import Group2_W2020_MAD3463_FP.PersonPack.Customer;
import Group2_W2020_MAD3463_FP.PersonPack.Driver;
import Group2_W2020_MAD3463_FP.PersonPack.Owner;
import Group2_W2020_MAD3463_FP.VehicalPack.Bus;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Collection;
import java.util.HashMap;


public class Group2MainClass {
    public static HashMap <String,Customer> customers = new HashMap<>();
    public static HashMap<String, Owner> owners = new HashMap<>();
    public static HashMap<String, Driver> drivers = new HashMap<>();
    public static HashMap<String, Bus> buses = new HashMap<>();

    public static DateTimeFormatter dateFormate= DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void readCustomersToHashMap()   //https://mkyong.com/java/how-to-read-and-parse-csv-file-in-java/
    {
        String line="";
        try{
            File file = new File("C:\\Class Pratice\\java\\JavaProject\\src\\main\\java\\Group2_W2020_MAD3463_FP\\InputFiles\\customers.csv");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(reader);
            while ((line=bufferedReader.readLine())!=null)
            {
                String content[]=line.split(",");
                LocalDate tempDate = LocalDate.parse(content[4],dateFormate);

                for (int j=0;j<content.length;j++)
                {
                    /*System.out.println(content[j]);*/
                    Gender tempFuel;
                    if (content[3]=="Male")
                         tempFuel=Gender.male;
                    else if (content[3]=="Female")
                        tempFuel=Gender.female;
                    else
                        tempFuel=Gender.other;
                    Customer temp= new Customer(content[0],content[1],content[2],tempFuel,tempDate,content[5],content[6],content[7],content[8],content[9],content[10]);

                    customers.put(content[0],temp);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void readOwnersToHashMap()   //https://mkyong.com/java/how-to-read-and-parse-csv-file-in-java/
    {
        String line="";
        try{
            File file = new File("C:\\Class Pratice\\java\\JavaProject\\src\\main\\java\\Group2_W2020_MAD3463_FP\\InputFiles\\Owners.csv");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(reader);
            while ((line=bufferedReader.readLine())!=null)
            {
                String content[]=line.split(",");
                LocalDate tempDate = LocalDate.parse(content[4],dateFormate);

                for (int j=0;j<content.length;j++)
                {
                    /*System.out.println(content[j]);*/
                    Gender tempFuel;
                    if (content[3]=="Male")
                        tempFuel=Gender.male;
                    else if (content[3]=="Female")
                        tempFuel=Gender.female;
                    else
                        tempFuel=Gender.other;
                    Owner temp= new Owner(content[0],content[1],content[2],tempFuel,tempDate,content[5],content[6],content[7],content[8],content[9],content[10],content[11]);

                    owners.put(content[0],temp);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void readDriversToHashMap()    //https://mkyong.com/java/how-to-read-and-parse-csv-file-in-java/
    {
        String line="";
        try{
            File file = new File("C:\\Class Pratice\\java\\JavaProject\\src\\main\\java\\Group2_W2020_MAD3463_FP\\InputFiles\\Drivers.csv");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(reader);
            while ((line=bufferedReader.readLine())!=null)
            {
                String content[]=line.split(",");
                LocalDate tempDate = LocalDate.parse(content[4],dateFormate);

                for (int j=0;j<content.length;j++)
                {
                    /*System.out.println(content[j]);*/
                    Gender tempFuel;
                    if (content[3]=="Male")
                        tempFuel=Gender.male;
                    else if (content[3]=="Female")
                        tempFuel=Gender.female;
                    else
                        tempFuel=Gender.other;
                    Driver temp= new Driver(content[0],content[1],content[2],tempFuel,tempDate,content[5],content[6],content[7],content[8],content[9],Boolean.parseBoolean(content[10]),Double.parseDouble(content[11]));

                    drivers.put(content[0],temp);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }


    public static void readBusesToHashMap()   //https://mkyong.com/java/how-to-read-and-parse-csv-file-in-java/
    {
        String line="";
        try{
            File file = new File("C:\\Class Pratice\\java\\JavaProject\\src\\main\\java\\Group2_W2020_MAD3463_FP\\InputFiles\\Buses.csv");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(reader);
            while ((line=bufferedReader.readLine())!=null)
            {
                String content[]=line.split(",");
                LocalDate tempDate = LocalDate.parse(content[4],dateFormate);
                Driver tempDriver = null;

                for (int j=0;j<content.length;j++)
                {
                    Fuel tempFuel = null;

                    if (content[8]=="Petrol")
                         tempFuel=Fuel.petrol;
                    else if (content[8]=="Diesel")
                        tempFuel=Fuel.diesel;

                    if (content[3].equalsIgnoreCase("false"))
                    {
                        for (Driver driver:drivers.values())
                        {

                            if (content[4].compareToIgnoreCase())
                            {

                            }
                        }
                    }



                    Bus temp = new Bus(content[0],content[1],content[2],Boolean.parseBoolean(content[3]),tempDriver,Boolean.parseBoolean(content[5]),content[6],Byte.parseByte(content[7]),tempFuel,Integer.parseInt(content[8]),Integer.parseInt(content[9]),content[10],Boolean.parseBoolean(content[11]),Boolean.parseBoolean(content[12]));

                    buses.put(content[0],temp);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        try {

            DataInputStream input = new DataInputStream(System.in);  //https://stackoverflow.com/questions/5287538/how-to-get-the-user-input-in-java
            int choice=0;


            /*System.out.println("+++++++++List+++++++++++");
            System.out.println("1.Customer");
            System.out.println("2.Owner");
            System.out.println("3.Driver");
            System.out.println("++++++++++++++++++++++++");
            System.out.println("Enter your choice: - ");
            choice=input.readInt();

            switch (choice)
            {
                case 1:
                {

                    break;
                }
            }*/

            readCustomersToHashMap();
            readOwnersToHashMap();
            readDriversToHashMap();

            /*for (Customer cust:customers.values())
            {
                cust.print();
            }*/

            /*for (Owner owner:owners.values())
            {
                owner.print();
            }*/

            /*for (Driver driver:drivers.values())
            {
                driver.print();
            }*/


        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
