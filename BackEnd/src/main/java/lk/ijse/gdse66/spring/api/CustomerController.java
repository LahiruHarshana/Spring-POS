package lk.ijse.gdse66.spring.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : L.H.J
 * @File: CustomerController
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-03-30, Saturday
 **/

@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin(origins = "*")
public class CustomerController {

    @PostMapping
    public void saveCustomer(){
        System.out.println("Customer Save");
    }
}
