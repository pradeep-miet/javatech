package demo.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "product")
public class Product {
	
private String id;
private String name;
private double price;
private int qty;
private Date creationDate;



 
public Product(String id, String name, double price, int qty, Date creationDate) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.qty = qty;
	this.creationDate = creationDate;
}
public Product() {
	super();
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + ", creationDate="
			+ creationDate + "]";
}

@XmlElement
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}

@XmlElement
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

@XmlElement
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

@XmlElement
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}

@XmlElement
public Date getCreationDate() {
	return creationDate;
}
public void setCreationDate(Date creationDate) {
	this.creationDate = creationDate;
}





}
