package com.company;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbWriter {

    public static void main(String[] args) throws JAXBException {

        Customer customer = new Customer(1, 30, "Markus Donald");

        File file = new File("customer.xml");
        JAXBContext context = JAXBContext.newInstance(Customer.class);
        Marshaller marshaller = context.createMarshaller();

// output like column
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(customer, file);
        marshaller.marshal(customer, System.out);
    }
}