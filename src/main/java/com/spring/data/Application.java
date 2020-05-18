package com.spring.data;

import com.spring.data.entity.Customer;
import com.spring.data.entity.Merchant;
import com.spring.data.service.ICustomerService;
import com.spring.data.service.IMerchantService;
import com.spring.data.service.MerchantServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        IMerchantService merchantService = applicationContext.getBean(MerchantServiceImpl.class);
        Merchant merchant = merchantService.findById(1);

        if(merchant!=null) {
            System.out.println(merchant.getName());
        }

        ICustomerService customerService = applicationContext.getBean(ICustomerService.class);
//        Customer customer = customerService.findById(1);
//        System.out.println(customer.toString());
//
//        Customer customer1 = new Customer();
//        customer1.setName("Bob");
//        customer1.setAddress("Toronto");
//        customerService.save(customer1);

        System.out.println(customerService.updateCustomerAddress(2, "15 Brick Road"));

        Customer customer = customerService.findById(2);
        System.out.println(customer.toString());

    }

}
