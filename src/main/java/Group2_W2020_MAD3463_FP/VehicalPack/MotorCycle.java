package Group2_W2020_MAD3463_FP.VehicalPack;

import Group2_W2020_MAD3463_FP.Enums.Fuel;
import Group2_W2020_MAD3463_FP.PersonPack.Driver;

public class MotorCycle extends Vehical {

    private Integer maxTopSpeed;
    private float milage;

    public MotorCycle(String vehicalIndentificationNumber, String vechicalDiscription, String manufacturerName, Boolean isSelfDrive, Driver driver, Boolean isInsured, String insuranceProviderName, Byte noOfSeat, Fuel fuelType, Integer baseRate, Integer ratePerKm, Integer maxTopSpeed, float milage) {
        super(vehicalIndentificationNumber, vechicalDiscription, manufacturerName, isSelfDrive, driver, isInsured, insuranceProviderName, noOfSeat, fuelType, baseRate, ratePerKm);
        this.maxTopSpeed = maxTopSpeed;
        this.milage = milage;
    }

    public Integer getMaxTopSpeed() {
        return maxTopSpeed;
    }

    public void setMaxTopSpeed(Integer maxTopSpeed) {
        this.maxTopSpeed = maxTopSpeed;
    }

    public float getMilage() {
        return milage;
    }

    public void setMilage(float milage) {
        this.milage = milage;
    }

    @Override
    public void print() {
        System.out.println(getVehicalIndentificationNumber()+" "+getVechicalDiscription()+" "+getManufacturerName()+" "+getSelfDrive()+" "+getInsured()+" "+getInsuranceProviderName()+" "+getNoOfSeat()+" "+getFuelType()+" "+getBaseRate()+" "+getRatePerKm()+" "+getMaxTopSpeed()+" "+getMaxTopSpeed());
    }
}
