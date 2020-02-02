package Group2_W2020_MAD3463_FP.VehicalPack;

import Group2_W2020_MAD3463_FP.Enums.Fuel;
import Group2_W2020_MAD3463_FP.IDisplay;
import Group2_W2020_MAD3463_FP.PersonPack.Driver;

abstract public class Vehical implements IDisplay {

    private String vehicalIndentificationNumber;
    private String vechicalDiscription;
    private String manufacturerName;
    private Boolean isSelfDrive;
    private Driver driver;  //Object of driver assigned to the vehical
    private Boolean isInsured;
    private String insuranceProviderName;
    private Byte noOfSeat;
    private Fuel fuelType;
    private Integer baseRate;
    private Integer ratePerKm;
    private String vehicleType;

    public Vehical() {}

    public Vehical(String vehicalIndentificationNumber, String vechicalDiscription, String manufacturerName, Boolean isSelfDrive, Driver driver, Boolean isInsured, String insuranceProviderName, Byte noOfSeat, Fuel fuelType, Integer baseRate, Integer ratePerKm, String vehicleType) {
        this.vehicalIndentificationNumber = vehicalIndentificationNumber;
        this.vechicalDiscription = vechicalDiscription;
        this.manufacturerName = manufacturerName;
        this.isSelfDrive = isSelfDrive;
        this.driver = driver;
        this.isInsured = isInsured;
        this.insuranceProviderName = insuranceProviderName;
        this.noOfSeat = noOfSeat;
        this.fuelType = fuelType;
        this.baseRate = baseRate;
        this.ratePerKm = ratePerKm;
        this.vehicleType = vehicleType;
    }

    public String getVehicalIndentificationNumber() {
        return vehicalIndentificationNumber;
    }

    public String getVechicalDiscription() {
        return vechicalDiscription;
    }

    public void setVechicalDiscription(String vechicalDiscription) {
        this.vechicalDiscription = vechicalDiscription;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public Boolean getSelfDrive() {
        return isSelfDrive;
    }

    public void setSelfDrive(Boolean selfDrive) {
        isSelfDrive = selfDrive;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Boolean getInsured() {
        return isInsured;
    }

    public void setInsured(Boolean insured) {
        isInsured = insured;
    }

    public String getInsuranceProviderName() {
        return insuranceProviderName;
    }

    public void setInsuranceProviderName(String insuranceProviderName) {
        this.insuranceProviderName = insuranceProviderName;
    }

    public Byte getNoOfSeat() {
        return noOfSeat;
    }

    public void setNoOfSeat(Byte noOfSeat) {
        this.noOfSeat = noOfSeat;
    }

    public Fuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(Fuel fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(Integer baseRate) {
        this.baseRate = baseRate;
    }

    public Integer getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(Integer ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleType() {
        return vehicleType;
    }
}
