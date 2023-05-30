package com.Ganesh;

import java.util.*;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;

@Configuration
public class JavaConfig {
@Bean("id1")
public Product getbean() {
	
	Margin m1=new Margin();
	m1.setMarginId(45);
	m1.setMarginCode("H1A5G");
		
	Modal m3=new Modal();
	m3.setModelId(101);
	m3.setModelCode("A1ADC143");
	m3.setModelCost(9000.09);
	Map<Integer,Margin> m2=new HashMap<>();
	m2.put(1, m1);
	m3.setMap(m2);
	
	
	Product m4=new Product();
	m4.setProductId(12);
	m4.setProductName("Laptop");
	List<Modal> m5=new ArrayList<>();
	m5.add(m3);
	m4.setLm(m5);
	
	return m4;
}
}
