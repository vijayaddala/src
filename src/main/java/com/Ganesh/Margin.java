package com.Ganesh;

public class Margin {
private int marginId;
private String marginCode;
public Margin() {
	super();
}
public int getMarginId() {
	return marginId;
}
public void setMarginId(int marginId) {
	this.marginId = marginId;
}
public String getMarginCode() {
	return marginCode;
}
public void setMarginCode(String marginCode) {
	this.marginCode = marginCode;
}
@Override
public String toString() {
	return "Margin Id=" + marginId +"\n"+ "Margin Code=" + marginCode+"\n";
}

}
