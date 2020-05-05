package com.spring.data;

import com.spring.data.entity.Merchant;
import com.spring.data.service.IMerchantService;
import com.spring.data.service.MerchantService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        IMerchantService merchantService = applicationContext.getBean(MerchantService.class);
        Merchant merchant = merchantService.findById(1);

        if(merchant!=null) {
            System.out.println(merchant.getName());
        }
    }

}
