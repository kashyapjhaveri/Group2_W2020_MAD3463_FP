package Group2_W2020_MAD3463_FP.VehicalPack;

import Group2_W2020_MAD3463_FP.Enums.Fuel;
import Group2_W2020_MAD3463_FP.PersonPack.Driver;

public class Car extends Vehical {

    private String carType;
    private String color;

    public Car(String vehicalIndentificationNumber, String vechicalDiscription, String manufacturerName, Boolean isSelfDrive, Driver driver, Boolean isInsured, String insuranceProviderName, Byte noOfSeat, Fuel fuelType, Integer baseRate, Integer ratePerKm, String carType, String color) {
        super(vehicalIndentificationNumber, vechicalDiscription, manufacturerName, isSelfDrive, driver, isInsured, insuranceProviderName, noOfSeat, fuelType, baseRate, ratePerKm);
        this.carType = carType;
        this.color = color;
    }


    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println(getVehicalIndentificationNumber()+" "+getVechicalDiscription()+" "+getManufacturerName()+" "+getSelfDrive()+" "+getInsured()+" "+getInsuranceProviderName()+" "+getNoOfSeat()+" "+getFuelType()+" "+getBaseRate()+" "+getRatePerKm()+" "+getCarType()+" "+getColor());
    }
}
