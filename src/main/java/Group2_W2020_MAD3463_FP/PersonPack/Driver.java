package Group2_W2020_MAD3463_FP.PersonPack;

public class Driver extends Person {

    private String drivingLicenceNumber;
    private Boolean isHistoryCleared;
    private Double salary;

    public Driver() {
    }

    public String getDrivingLicenceNumber() {
        return drivingLicenceNumber;
    }


    public Boolean getHistroyCleared() {
        return isHistoryCleared;
    }

    public void setHistroyCleared(Boolean histroyCleared) {
        isHistoryCleared = histroyCleared;
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

