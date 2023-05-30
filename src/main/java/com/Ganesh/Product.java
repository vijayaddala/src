package com.Ganesh;

import java.util.*;

import org.springframework.ui.Model;

public class Product {
private int productId;
private String productName;
private List<Modal> lm;
public Product() {
	super();
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public List<Modal> getLm() {
	return lm;
}
public void setLm(List<Modal> lm) {
	this.lm = lm;
}

public void printproduct()
{
	System.out.println("Product Id:"+productId);
	System.out.println("Product Name:"+productName);
	System.out.println(lm);
}
}
