package in.solvingx.kailash.bills;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bills")
public class BillController {
    @GetMapping("health")
    public ResponseEntity<String> checkHealth(){
        return ResponseEntity.ok("All Good");
    }
}
