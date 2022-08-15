package in.solvingx.kailash.bills;

import in.solvingx.kailash.bills.modal.Bill;
import in.solvingx.kailash.bills.modal.BillRepository;
import in.solvingx.kailash.bills.request.CreateBillRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class BillService {
    @Autowired
    BillRepository billRepository;
    public Long saveBill(CreateBillRequest createBillRequest) {
        Bill bill = new Bill();
        bill.setName(createBillRequest.getName());
        bill.setAmount(createBillRequest.getAmount());
        bill.setDueDate(Date.valueOf(createBillRequest.getDueDate()));
        bill.setBillingLocation(createBillRequest.getBillingLocation());
        bill.setBillType(createBillRequest.getBillType());
        Bill billRes = billRepository.save(bill);
        return billRes.getId();
    }
}
