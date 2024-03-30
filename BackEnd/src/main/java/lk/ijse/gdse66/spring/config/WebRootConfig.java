package lk.ijse.gdse66.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.xml.transform.Transformer;

/**
 * @author : L.H.J
 * @File: WebRootConfig
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-03-14, Thursday
 **/

@Configuration
@ComponentScan(basePackages = {"lk.ijse.gdse66.spring.service","lk.ijse.gdse66.spring.repositories"} , basePackageClasses = Transformer.class)

@EnableWebMvc
@Import({JPAConfig.class})
public class WebRootConfig {

}
