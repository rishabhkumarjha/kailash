package in.solvingx.kailash.bills;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

@WebMvcTest
public class BillControllerTests {
    @Autowired
    MockMvc mvc;
    @Test
    void billsHealthCheck() throws Exception {
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("/bills/health")).andReturn();
        assertEquals(200, mvcResult.getResponse().getStatus());
        assertEquals("All Good", mvcResult.getResponse().getContentAsString());
    }
}
