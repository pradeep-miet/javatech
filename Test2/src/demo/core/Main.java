package demo.core;

import java.util.Date;

import demo.model.Product;
import demo.util.MarshallingUtil;

public class Main {

	public static void main(String[] args) {
		System.out.println("This is the main class..linked with GIT");
		Product product = new Product("101","Laptop",45000,5,new Date());
		System.out.println("******Called Marshalling************");
		boolean isMarshalled = MarshallingUtil.Marshalling(product);
		System.out.println("isMarshalled :"+isMarshalled);
		
		System.out.println("******Called UnMarshalling************");
		String xmlFile = "src\\data\\product.xml";
		boolean isUnMarshalled = MarshallingUtil.UnMarshalling(xmlFile);
		System.out.println("isUnMarshalled :"+isUnMarshalled);
	} 

}
