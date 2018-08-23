package com.company;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxbReader {

    public static void main(String[] args) throws JAXBException {

        File file = new File("customer.xml");
        JAXBContext context = JAXBContext.newInstance(Customer.class);

        Unmarshaller unmarshaller = context.createUnmarshaller();
        Customer customer = (Customer) unmarshaller.unmarshal(file);
        System.out.println(customer);
    }
}

