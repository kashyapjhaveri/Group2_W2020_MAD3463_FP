package Group2_W2020_MAD3463_FP;

import Group2_W2020_MAD3463_FP.VehicalPack.Vehical;

import java.time.LocalDate;

public class VehicalRent implements IDisplay {

    private LocalDate startDate;
    private LocalDate endDate;
    private Integer noOfDays;
    private Integer noOfKmDriven;
    private Float totalBill;
    private Vehical vehicalRented;

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Integer getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(Integer noOfDays) {
        this.noOfDays = noOfDays;
    }

    public Integer getNoOfKmDriven() {
        return noOfKmDriven;
    }

    public void setNoOfKmDriven(Integer noOfKmDriven) {
        this.noOfKmDriven = noOfKmDriven;
    }

    public Float getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(Float totalBill) {
        this.totalBill = totalBill;
    }

    public Vehical getVehicalRented() {
        return vehicalRented;
    }

    public void setVehicalRented(Vehical vehicalRented) {
        this.vehicalRented = vehicalRented;
    }



    @Override
    public void print() {

    }
}
