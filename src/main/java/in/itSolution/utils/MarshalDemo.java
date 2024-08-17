package in.itSolution.utils;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import in.itSolution.bindings.Address;
import in.itSolution.bindings.Person;

public class MarshalDemo {
	
	public static void main(String[] args) throws Exception {
		
		
		Address addr=new Address();
		addr.setCity("Bengaluru");
		addr.setState("Karnataka");
		addr.setCountry("India");
		
		
		
		Person p=new Person();
		p.setId(1001);
		p.setName("Sandeep Kumar");
		p.setEmail("Sandeep@gmail.com");
		p.setGender("Male");
		p.setAddr(addr);
		
		JAXBContext context = JAXBContext.newInstance(Person.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(p,new File("person.xml"));
		
		System.out.println("XML File Created......");
		
	}

}
