package in.solvingx.kailash.bills.request;

import in.solvingx.kailash.bills.modal.BillType;
import in.solvingx.kailash.bills.modal.BillingLocation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

public class CreateBillRequest {

    String name;
    BillType billType;
    Float amount;
    String dueDate;
    BillingLocation billingLocation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BillType getBillType() {
        return billType;
    }

    public void setBillType(BillType billType) {
        this.billType = billType;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public BillingLocation getBillingLocation() {
        return billingLocation;
    }

    public void setBillingLocation(BillingLocation billingLocation) {
        this.billingLocation = billingLocation;
    }
}
