package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "demo")
public class BeanConfig {

    @Bean
    @Scope(scopeName = "prototype")
    public Doctor getDoctor() {
        return new Doctor();
    }

    @Bean
    public Nurse getNurse() {
        return new Nurse();
    }
}
