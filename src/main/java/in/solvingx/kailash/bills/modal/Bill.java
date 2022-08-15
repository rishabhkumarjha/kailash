package in.solvingx.kailash.bills.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Bill {
    @Id
    @GeneratedValue
    Long id;
    String name;
    BillType billType;
    Float amount;
    Date dueDate;
    Boolean isPaid;
    BillingLocation billingLocation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    public void setPaid(Boolean paid) {
        isPaid = paid;
    }

    public BillingLocation getBillingLocation() {
        return billingLocation;
    }

    public void setBillingLocation(BillingLocation billingLocation) {
        this.billingLocation = billingLocation;
    }
}
