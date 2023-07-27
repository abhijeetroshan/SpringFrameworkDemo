package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor staff = applicationContext.getBean(Doctor.class);
        Doctor staff2 = applicationContext.getBean(Doctor.class);
//        staff.assist();
        staff.setQualification("MBBS");
        System.out.println(staff);
        System.out.println(staff2);
//        staff2.assist();
    }
}
