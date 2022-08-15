package in.solvingx.kailash.bills;

import in.solvingx.kailash.bills.modal.Bill;
import in.solvingx.kailash.bills.modal.BillRepository;
import in.solvingx.kailash.bills.request.CreateBillRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("bills")
public class BillController {
    @Autowired
    BillService billService;
    @GetMapping("health")
    public ResponseEntity<String> checkHealth(){
        return ResponseEntity.ok("All Good");
    }
    @GetMapping("allBills")
    public ResponseEntity<List<Bill>> getAllBills(){
        return ResponseEntity.ok(billService.getAllBills());
    }
    @PostMapping("createBill")
    public ResponseEntity<String> createBill(CreateBillRequest createBillRequest){
        Long id =billService.saveBill(createBillRequest);
        return ResponseEntity.ok("Bill Created with id="+id);
    }
}
