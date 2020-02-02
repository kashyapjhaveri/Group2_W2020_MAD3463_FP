package Group2_W2020_MAD3463_FP;

import Group2_W2020_MAD3463_FP.Enums.Fuel;
import Group2_W2020_MAD3463_FP.Enums.Gender;
import Group2_W2020_MAD3463_FP.PersonPack.Customer;
import Group2_W2020_MAD3463_FP.PersonPack.Driver;
import Group2_W2020_MAD3463_FP.PersonPack.Owner;
import Group2_W2020_MAD3463_FP.VehicalPack.Bus;
import Group2_W2020_MAD3463_FP.VehicalPack.Car;
import Group2_W2020_MAD3463_FP.VehicalPack.MotorCycle;
import Group2_W2020_MAD3463_FP.VehicalPack.Vehical;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;


public class Group2MainClass {

    public static HashMap<String,Customer> customers = new HashMap<>();
    public static HashMap<String, Owner> owners = new HashMap<>();
    public static HashMap<String, Driver> drivers = new HashMap<>();
    public static HashMap<String, Bus> buses = new HashMap<>();
    public static HashMap<String, Car> cars = new HashMap<>();
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

    public static void readOwnersToHashMap()
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

    public static void readDriversToHashMap()
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

    public static void readBusesToHashMap()
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

    public static void readCarsToHashMap()
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
                    cars.put(content[0],tempObj);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void readMotorCyclesToHashMap()
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

    public static void readOwnerVehicles()
    {
        String line="";
        try{
            File file = new File(".\\InputFiles\\OwnerVehicals.csv");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(reader);
            while ((line=bufferedReader.readLine())!=null)
            {
                HashMap<String, Vehical> tempOwnerVehicles = new HashMap<>();
                String content[]=line.split(",");
                Owner tempOwner=owners.get(content[0]);
                Vehical tempVehicle=null;
                for (int j=1;j<content.length;j++)
                {
                    if (cars.get(content[j])!=null)
                    {
                        tempVehicle=cars.get(content[j]);
                    }
                    else if(buses.get(content[j])!=null)
                    {
                        tempVehicle=buses.get(content[j]);
                    }
                    else if(motorcycles.get(content[j])!=null)
                    {
                        tempVehicle=motorcycles.get(content[j]);
                    }
                    tempOwnerVehicles.put(tempVehicle.getVehicalIndentificationNumber(),tempVehicle);
                }
                tempOwner.setListOfVehcialOwned(tempOwnerVehicles);
            }
            bufferedReader.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }


    }


    public static void listAllVehicals(String type)
    {
        switch (type)
        {
            case "car":
            {
                for (Car car:cars.values())
                {
                    System.out.println("=========================================");
                    car.print();
                    if (car.getDriver()!=null)
                        System.out.println("DriverName:- "+car.getDriver().getFirstName()+" "+car.getDriver().getLastName());
                    System.out.println("=========================================");
                }
                break;
            }
            case "bus":
            {
                for (Bus bus:buses.values())
                {
                    System.out.println("=========================================");
                    bus.print();
                    if (bus.getDriver()!=null)
                        System.out.println("DriverName:- "+bus.getDriver().getFirstName()+" "+bus.getDriver().getLastName());
                    System.out.println("=========================================");
                }
                break;
            }
            case "motorcycle":
            {
                for (MotorCycle motorCycle:motorcycles.values())
                {
                    System.out.println("=========================================");
                    motorCycle.print();
                    if (motorCycle.getDriver()!=null)
                        System.out.println("DriverName:- "+motorCycle.getDriver().getFirstName()+" "+motorCycle.getDriver().getLastName());
                    System.out.println("=========================================");
                }
                break;
            }
        }
    }

    public static void listAllPersons(String type)
    {
        switch (type)
        {
            case "owner":
            {
                for (Owner owner:owners.values())
                {
                    owner.print();
                }
                break;
            }
            case "customers":
            {
                for (Customer customer:customers.values())
                {
                    customer.print();
                }
                break;
            }
            case "drivers":
            {
                for (Driver driver:drivers.values())
                {
                    driver.print();
                }
                break;
            }
        }
    }

    public static void listOwnerAllVehicals()
    {
        for (Owner owner:owners.values())
        {
            if (owner.getListOfVehcialOwned()!=null)
            {
                System.out.println("==================");
                System.out.println("OwnerName:- "+owner.getFirstName()+" "+owner.getLastName());
                for (Vehical vehical:owner.getListOfVehcialOwned().values())
                {
                    if (vehical instanceof Car)
                    {
                        System.out.println("+++++++++++++++++++++++");
                        ((Car)vehical).print();
                        System.out.println("+++++++++++++++++++++++");
                    }
                    else if (vehical instanceof Bus)
                    {
                        System.out.println("+++++++++++++++++++++++");
                        ((Bus)vehical).print();
                        System.out.println("+++++++++++++++++++++++");
                    }
                    else if (vehical instanceof MotorCycle)
                    {
                        System.out.println("+++++++++++++++++++++++");
                        ((MotorCycle)vehical).print();
                        System.out.println("+++++++++++++++++++++++");
                    }
                }
                System.out.println("==================");
            }
        }
    }

    public static void main(String[] args) {
        int choice=0;
        Scanner input=  new Scanner(System.in);

        readCustomersToHashMap();
        readOwnersToHashMap();
        readDriversToHashMap();

        readBusesToHashMap();
        readCarsToHashMap();
        readMotorCyclesToHashMap();

        readOwnerVehicles();

        System.out.println("+++++++++++++++++");
        System.out.println("1.List All Person");
        System.out.println("2.List All Vehicles");
        System.out.println("2.List all owner vehicles");
        System.out.println("+++++++++++++++++");
        System.out.println("Enter choice:- ");
        choice=input.nextInt();

        switch (choice)
        {
            case 1:
            {
                int nextChoice=0;
                System.out.println("1.Customers" );
                System.out.println("2.Owners" );
                System.out.println("2.Drivers" );
                System.out.println("Enter choice:- ");

                nextChoice=input.nextInt();

                switch (nextChoice)
                {
                    case 1:
                    {
                        listAllPersons("customers");
                        break;
                    }
                    case 2:
                    {
                        listAllPersons("owners");
                        break;
                    }
                    case 3:
                    {
                        listAllPersons("drivers");
                        break;
                    }
                }

                break;
            }
            case 2:
            {
                int nextChoice=0;

                System.out.println("1.Cars");
                System.out.println("2.Buses");
                System.out.println("3.MotorCycle");
                System.out.println("Enter your choice:- ");
                nextChoice=input.nextInt();

                switch (nextChoice)
                {
                    case 1:
                    {
                        listAllVehicals("car");
                        break;
                    }
                    case 2:
                    {
                        listAllVehicals("bus");
                        break;
                    }
                    case 3:
                    {
                        listAllVehicals("motorcycle");
                        break;
                    }
                }
            }
            case 3:
            {
                listOwnerAllVehicals();
                break;
            }
        }

    }
}
