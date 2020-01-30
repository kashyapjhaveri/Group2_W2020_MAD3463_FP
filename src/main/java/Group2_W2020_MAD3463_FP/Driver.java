package Group2_W2020_MAD3463_FP;

public class Driver extends Person {

    private String drivingLicenceNumber;
    private Boolean isHistroyCleared;
    private double salary;

    public String getDrivingLicenceNumber() {
        return drivingLicenceNumber;
    }


    public Boolean getHistroyCleared() {
        return isHistroyCleared;
    }

    public void setHistroyCleared(Boolean histroyCleared) {
        isHistroyCleared = histroyCleared;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void print() {
    }
}

