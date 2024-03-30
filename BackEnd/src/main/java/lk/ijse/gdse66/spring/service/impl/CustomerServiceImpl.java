package lk.ijse.gdse66.spring.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse66.spring.dto.CustomerDTO;
import lk.ijse.gdse66.spring.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : L.H.J
 * @File: CustomerServiceImpl
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-03-30, Saturday
 **/

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Override
    public void save(CustomerDTO customerDTO) {
        System.out.println("Customer Save");
    }

    @Override
    public void update(CustomerDTO customerDTO) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public CustomerDTO search(String id) {
        return null;
    }

    @Override
    public List<CustomerDTO> getAll() {
        return null;
    }
}