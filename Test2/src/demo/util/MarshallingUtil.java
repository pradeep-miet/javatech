package demo.util;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import demo.model.Product;
 
public class MarshallingUtil {
	
	public static boolean Marshalling(Product product)
	{
		boolean isMarshalled = false;
				
		try {
			JAXBContext context = JAXBContext.newInstance(Product.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.marshal(product, System.out);
			marshaller.marshal(product, new File("src\\data\\product.xml"));
			isMarshalled = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		return isMarshalled;
	}
	
	public static boolean UnMarshalling(String file)
	{
		boolean isUnMarshalled = false;
				
		try {
			
	        JAXBContext context = JAXBContext.newInstance(Product.class);
	        Unmarshaller um = context.createUnmarshaller();
	        Product product = (Product) um.unmarshal(new File(file));
	        System.out.println("Id :"+product.getId());
	        System.out.println("Name :"+product.getName());
	        System.out.println("Price :"+product.getPrice());
	        System.out.println("Qty :"+product.getQty());
	        System.out.println("Creation Date :"+product.getCreationDate());
	        
	        isUnMarshalled = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		return isUnMarshalled;
	}

}
