package lk.ijse.gdse66.spring.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.io.Serializable;

/**
 * @author : L.H.J
 * @File: CustomerDTO
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-03-30, Saturday
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO implements Serializable {
    @Null(message = "Customer ID must be null")
    private String cus_id;

    @NotBlank(message = "Name can not be null")
    @Pattern(regexp = "^[A-Za-z ]*$", message = "Name should only contain alphabetical characters")
    private String name;

    @NotBlank(message = "Address can not be null")
    private String address;

    @NotNull(message = "Salary can not be null")
    private Double salary;
}
