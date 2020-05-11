package com.spring.data;

import com.spring.data.entity.Customer;
import com.spring.data.entity.Merchant;
import com.spring.data.service.CustomerService;
import com.spring.data.service.ICustomerService;
import com.spring.data.service.IMerchantService;
import com.spring.data.service.MerchantService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class Application {
    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        IMerchantService merchantService = applicationContext.getBean(MerchantService.class);
        Merchant merchant = merchantService.findById(1);

        if(merchant!=null) {
            System.out.println(merchant.getName());
        }

        ICustomerService customerService = applicationContext.getBean(ICustomerService.class);
        Customer customer = customerService.findById(1);
        System.out.println(customer.toString());

        Customer customer1 = new Customer();
        customer1.setName("Bob");
        customer1.setAddress("Toronto");
        customerService.save(customer1);
        //Hibernate updates Object before writing to db,
        // does it mean we can use this object.id afterwards and assume it 100% corresponds?

        //my table didn't have an AUTOINCREMENT turned on, and Hibernate failed to assign a value.
        //Is it because of the strategy?

        System.out.println();
    }

}
