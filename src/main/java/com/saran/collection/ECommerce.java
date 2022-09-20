/*package com.saran.collection;

import java.util.HashSet;
import java.util.Set;

class Product{
	int prdId;
	String prdName;
	double prdPrice;
	public Product(int prdId, String prdName, double prdPrice) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
	}
	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + ", prdPrice=" + prdPrice + "]";
	}
	
	
}

public class ECommerce {
	
	public static void main(String[] args) {
		Set<Product> set=new HashSet<>();
		Product p1=new Product(111,"Laptop",1200.34);
		Product p2=new Product(112,"Desktop",800.23);
		Product p3=new Product(113,"KeyBoard",20.45);
		set.add(p1);set.add(p2);set.add(p3);
		
		for(Product p:set) {
			System.out.println(p.prdId+"  "+p.prdName+"  "+p.prdPrice);
		}
		
		set.forEach(System.out::println);
		
		
		
	}

}
*/