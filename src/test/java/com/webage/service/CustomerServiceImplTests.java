// package com.webage.service;

// import static org.assertj.core.api.Assertions.assertThat;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.mockito.Mockito.verify;
// import static org.mockito.Mockito.when;

// import java.util.Arrays;
// import java.util.List;
// import java.util.Optional;

// import org.junit.jupiter.api.Disabled;
// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.extension.ExtendWith;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.junit.jupiter.MockitoExtension;

// import com.webage.dao.AuthorizationServerDao;
// import com.webage.dao.ResourceServerDao;
// import com.webage.domain.Customer;

// /**
//  * This test exercises the CustomerServiceImpl.
//  * This is 100% Mockito, and a true unit test.
//  */
// @ExtendWith(MockitoExtension.class)
// public class CustomerServiceImplTests {

//     @Mock
//     AuthorizationServerDao authorizationServerDao;
//     @Mock
//     ResourceServerDao resourceServerDao;
//     @InjectMocks
//     CustomerServiceImpl customerService;

//     @Test
//     // @Disabled
//     public void testFindAllCustomers() {
//         // Mock the behavior of the authorization service client
//         String jwt = "mockJwt";
//         when(authorizationServerDao.getJwt()).thenReturn(jwt);

//         // Mock the behavior of the resource server client
//         when(resourceServerDao.findAllCustomers(jwt)).thenReturn(expectedCustomers());

//         // Call the method under test
//         Iterable<Customer> result = customerService.findAllCustomers();

//         // Verify the result
//         assertThat(result).containsExactlyElementsOf(expectedCustomers());
//         // assertEquals(expectedCustomers(), result);

//         // Verify interactions
//         verify(authorizationServerDao).getJwt();
//         verify(resourceServerDao).findAllCustomers(jwt);
//     }

//     @Test
//     // @Disabled
//     public void testFindCustomerById() {
//         // Mock the behavior of the authorization service client
//         String jwt = "mockJwt";
//         when(authorizationServerDao.getJwt()).thenReturn(jwt);

//         // Mock the behavior of the resource server client
//         long customerId = 1L; // Adjust as needed
//         when(resourceServerDao.findCustomerById(jwt, customerId)).thenReturn(expectedCustomer());

//         // Call the method under test
//         Optional<Customer> result = customerService.findCustomerById(customerId);

//         // Verify the result
//         assertEquals(expectedCustomer(), result);

//         // Verify interactions
//         verify(authorizationServerDao).getJwt();
//         verify(resourceServerDao).findCustomerById(jwt, customerId);
//     }

//     private Optional<Customer> expectedCustomer() {
//         return Optional.of(expectedCustomers().get(0));
//     }

//     private List<Customer> expectedCustomers() {
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
