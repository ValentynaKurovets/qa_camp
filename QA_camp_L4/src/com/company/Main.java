package com.company;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {

    public static void main(String[] args) throws JAXBException {

        Customer customer = new Customer(2, 35, "Markus Bonald");

        File file = new File("customer1.xml");

        JAXBContext context = JAXBContext.newInstance(Customer.class);
        Marshaller marshaller = context.createMarshaller();

// output like column
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(customer, file);
        marshaller.marshal(customer, System.out);

        Unmarshaller unmarshaller = context.createUnmarshaller();
        customer = (Customer) unmarshaller.unmarshal(file);
        System.out.println(customer);
    }
}
