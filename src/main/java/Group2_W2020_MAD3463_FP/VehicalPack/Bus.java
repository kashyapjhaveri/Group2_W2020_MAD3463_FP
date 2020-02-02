package Group2_W2020_MAD3463_FP.VehicalPack;

import Group2_W2020_MAD3463_FP.Enums.Fuel;
import Group2_W2020_MAD3463_FP.PersonPack.Driver;

public class Bus extends Vehical {

    private String typeOfBus;
    private Boolean isAccessibilityAvailable;
    private Boolean isWifiAvailable;

    public Bus(String vehicalIndentificationNumber, String vechicalDiscription, String manufacturerName, Boolean isSelfDrive, Driver driver, Boolean isInsured, String insuranceProviderName, Byte noOfSeat, Fuel fuelType, Integer baseRate, Integer ratePerKm, String typeOfBus, Boolean isAccessibilityAvailable, Boolean isWifiAvailable) {
        super(vehicalIndentificationNumber, vechicalDiscription, manufacturerName, isSelfDrive, driver, isInsured, insuranceProviderName, noOfSeat, fuelType, baseRate, ratePerKm,"bus");
        this.typeOfBus = typeOfBus;
        this.isAccessibilityAvailable = isAccessibilityAvailable;
        this.isWifiAvailable = isWifiAvailable;
    }

    public String getTypeOfBus() {
        return typeOfBus;
    }

    public void setTypeOfBus(String typeOfBus) {
        this.typeOfBus = typeOfBus;
    }

    public Boolean getAccessibilityAvailable() {
        return isAccessibilityAvailable;
    }

    public void setAccessibilityAvailable(Boolean accessibilityAvailable) {
        isAccessibilityAvailable = accessibilityAvailable;
    }

    public Boolean getWifiAvailable() {
        return isWifiAvailable;
    }

    public void setWifiAvailable(Boolean wifiAvailable) {
        isWifiAvailable = wifiAvailable;
    }

    @Override
    public void print() {
        /*System.out.println(getVehicalIndentificationNumber()+" "+getVechicalDiscription()+" "+getManufacturerName()+" "+getSelfDrive()+" "+getInsured()+" "+getInsuranceProviderName()+" "+getNoOfSeat()+" "+getFuelType()+" "+getBaseRate()+" "+getRatePerKm()+" "+getTypeOfBus()+" "+getAccessibilityAvailable()+" "+getWifiAvailable());*/
        System.out.println("VIn:- "+getVehicalIndentificationNumber());
        System.out.println("Description:- "+getVechicalDiscription());
        System.out.println("Manufacturer:- "+getManufacturerName());
        System.out.println("isSelfDrive:- "+getSelfDrive());
        System.out.println("isInsured:- "+getInsured());
        System.out.println("insuranceProviderName:- "+getInsuranceProviderName());
        System.out.println("NumberOfSeat:- "+getNoOfSeat());
        System.out.println("FuelType:- "+getFuelType());
        System.out.println("BaseRate:- "+getBaseRate());
        System.out.println("RatePerKm:- "+getRatePerKm());
        System.out.println("VehicleType:- "+getVehicleType());
        System.out.println("TypeOfBus:- "+getTypeOfBus());
        System.out.println("isAccessibilityAvailable:- "+getAccessibilityAvailable());
        System.out.println("isWifiAvailable:- "+getWifiAvailable());
    }
}
