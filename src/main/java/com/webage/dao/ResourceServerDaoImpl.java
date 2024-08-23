package com.webage.dao;

import com.webage.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.Arrays;
import java.util.Optional;

@Service
public class ResourceServerDaoImpl implements ResourceServerDao {

    @Value("${resource.server.uri}")    String uri;
    @Value("${resource.server.port}")   String port;

    @Autowired
    RestClient client;

	private String serverUri() {
        return String.format(uri, port);
	}


    @Override
    public Iterable<Customer> findAllCustomers(String jwt) {
        ResponseEntity<Customer[]> responseEntity = client
                .get()
                .uri(serverUri() + "/api/customers")
                .header("Authorization", "Bearer " + jwt)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .toEntity(Customer[].class);
        return Arrays.asList(responseEntity.getBody());
    }


    @Override
    public Optional<Customer> findCustomerById(String jwt, long id) {
        ResponseEntity<Customer> responseEntity = client
                .get()
                .uri(serverUri() + "/api/customers/{id}",id)
                .header("Authorization", "Bearer " + jwt)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .toEntity(Customer.class);
        return Optional.of(responseEntity.getBody());
    }
}
