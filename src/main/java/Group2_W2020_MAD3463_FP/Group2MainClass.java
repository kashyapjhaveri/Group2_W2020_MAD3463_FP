package Group2_W2020_MAD3463_FP;

import Group2_W2020_MAD3463_FP.Enums.Fuel;
import Group2_W2020_MAD3463_FP.Enums.Gender;
import Group2_W2020_MAD3463_FP.PersonPack.Customer;
import Group2_W2020_MAD3463_FP.PersonPack.Driver;
import Group2_W2020_MAD3463_FP.PersonPack.Owner;
import Group2_W2020_MAD3463_FP.VehicalPack.Bus;
import Group2_W2020_MAD3463_FP.VehicalPack.Car;
import Group2_W2020_MAD3463_FP.VehicalPack.MotorCycle;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;



public class Group2MainClass {
    public static HashMap <String,Customer> customers = new HashMap<>();
    public static HashMap<String, Owner> owners = new HashMap<>();
    public static HashMap<String, Driver> drivers = new HashMap<>();
    public static HashMap<String, Bus> buses = new HashMap<>();
    public static HashMap<String, Car> motorCycles = new HashMap<>();
    public static HashMap<String, MotorCycle> motorcycles = new HashMap<>();

    public static DateTimeFormatter dateFormate= DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void readCustomersToHashMap()   //https://mkyong.com/java/how-to-read-and-parse-csv-file-in-java/
    {
        String line="";
        try{
            File file = new File(".\\InputFiles\\customers.csv");
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
            File file = new File(".\\InputFiles\\Owners.csv");
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
            File file = new File(".\\InputFiles\\Drivers.csv");
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
            File file = new File(".\\InputFiles\\Buses.csv");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(reader);
            while ((line=bufferedReader.readLine())!=null)
            {
                String content[]=line.split(",");
                Driver tempDriver = null;

                for (int j=0;j<content.length;j++)
                {
                    Fuel tempFuel = null;

                    if (content[8].equalsIgnoreCase("Petrol"))
                         tempFuel=Fuel.petrol;
                    else if (content[8].equalsIgnoreCase("Diesel"))
                        tempFuel=Fuel.diesel;

                    if (content[3].equalsIgnoreCase("false"))
                    {
                        tempDriver=drivers.get(content[4]);
                    }

                    Bus tempObj = new Bus(content[0],content[1],content[2],Boolean.parseBoolean(content[3]),tempDriver,Boolean.parseBoolean(content[5]),content[6],Byte.parseByte(content[7]),tempFuel,Integer.parseInt(content[9]),Integer.parseInt(content[10]),content[11],Boolean.parseBoolean(content[12]),Boolean.parseBoolean(content[13]));
                    buses.put(content[0],tempObj);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void readCarsToHashMap()   //https://mkyong.com/java/how-to-read-and-parse-csv-file-in-java/
    {
        String line="";
        try{
            File file = new File(".\\InputFiles\\Cars.csv");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(reader);
            while ((line=bufferedReader.readLine())!=null)
            {
                String content[]=line.split(",");
                Driver tempDriver = null;

                for (int j=0;j<content.length;j++)
                {
                    Fuel tempFuel = null;

                    if (content[8].equalsIgnoreCase("Petrol"))
                        tempFuel=Fuel.petrol;
                    else if (content[8].equalsIgnoreCase("Diesel"))
                        tempFuel=Fuel.diesel;

                    if (content[3].equalsIgnoreCase("false"))
                    {
                        tempDriver=drivers.get(content[4]);
                    }

                    Car tempObj = new Car(content[0],content[1],content[2],Boolean.parseBoolean(content[3]),tempDriver,Boolean.parseBoolean(content[5]),content[6],Byte.parseByte(content[7]),tempFuel,Integer.parseInt(content[9]),Integer.parseInt(content[10]),content[11],content[12]);
                    motorCycles.put(content[0],tempObj);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void readMotorCyclesToHashMap()   //https://mkyong.com/java/how-to-read-and-parse-csv-file-in-java/
    {
        String line="";
        try{
            File file = new File(".\\InputFiles\\MotorCycles.csv");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(reader);
            while ((line=bufferedReader.readLine())!=null)
            {
                String content[]=line.split(",");
                Driver tempDriver = null;

                for (int j=0;j<content.length;j++)
                {
                    Fuel tempFuel = null;

                    if (content[8].equalsIgnoreCase("Petrol"))
                        tempFuel=Fuel.petrol;
                    else if (content[8].equalsIgnoreCase("Diesel"))
                        tempFuel=Fuel.diesel;

                    if (content[3].equalsIgnoreCase("false"))
                    {
                        tempDriver=drivers.get(content[4]);
                    }

                    MotorCycle tempObj = new MotorCycle(content[0],content[1],content[2],Boolean.parseBoolean(content[3]),tempDriver,Boolean.parseBoolean(content[5]),content[6],Byte.parseByte(content[7]),tempFuel,Integer.parseInt(content[9]),Integer.parseInt(content[10]),Integer.parseInt(content[11]),Float.parseFloat(content[12]));
                    motorcycles.put(content[0],tempObj);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        /*readCustomersToHashMap();
        readOwnersToHashMap();*/
        readDriversToHashMap();
        readBusesToHashMap();
        readCarsToHashMap();
        readMotorCyclesToHashMap();


        for (MotorCycle motorCycle:motorcycles.values())
        {
            motorCycle.print();
            if (motorCycle.getDriver()!=null)
                System.out.println(motorCycle.getDriver().getFirstName()+" "+motorCycle.getDriver().getLastName());
        }
    }
}
