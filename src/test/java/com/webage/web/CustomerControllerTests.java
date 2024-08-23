// package com.webage.web;

// import com.webage.domain.Customer;
// import com.webage.domain.Customer;
// import com.webage.service.CustomerService;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
// import org.springframework.boot.test.mock.mockito.MockBean;
// import org.springframework.security.test.context.support.WithMockUser;
// import org.springframework.test.web.servlet.MockMvc;

// import java.util.Arrays;

// import static org.mockito.BDDMockito.*;

// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

// /**
//  * This test verifies the behavior of the user-facing interface,
//  * focusing on assuring authentication.
//  */

// @WebMvcTest(CustomerController.class)
// public class CustomerControllerTests {

//     @Autowired
//     MockMvc mvc;

//     @MockBean
//     CustomerService service;

//     @Test
//     void browseWhenUnauthenticatedThen401() throws Exception {
//         this.mvc.perform(get("/browse"))
//                 .andExpect(status().isUnauthorized());
//     }

//     @Test
//     @WithMockUser
//     public void browseWhenAuthenticatedThen200() throws Exception {
//         // Program mock with expectations.
//         // The expect the mock customerService will have its findAllCustomers() method
//         // colled.
//         // When this happens, we wish for a list of Customers to be returned.
//         // This mock allows us to test the controller layer without a backend server
//         // running, or without WireMock:
//         given(service.findAllCustomers()).willReturn(getTestData());

//         this.mvc.perform(get("/browse")).andExpect(status().isOk());
//     }

//     private Iterable<Customer> getTestData() {
//         Customer c = new Customer();
//         c.setName("test");
//         c.setId(1);
//         c.setEmail("a@a.com");
//         Customer p = new Customer();
//         p.setId(1);
//         p.setProduct("something");
//         p.setCustomer(c);

//         return Arrays.asList(p);
//     }
// }
