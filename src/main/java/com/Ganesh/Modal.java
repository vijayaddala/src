package com.Ganesh;

import java.util.*;

public class Modal {
private int modelId;
private String modelCode;
private double modelCost;
private Map<Integer,Margin> map;
public Modal() {
	super();
}
public int getModelId() {
	return modelId;
}
public void setModelId(int modelId) {
	this.modelId = modelId;
}
public String getModelCode() {
	return modelCode;
}
public void setModelCode(String modelCode) {
	this.modelCode = modelCode;
}
public double getModelCost() {
	return modelCost;
}
public void setModelCost(double modelCost) {
	this.modelCost = modelCost;
}
public Map<Integer, Margin> getMap() {
	return map;
}
public void setMap(Map<Integer, Margin> map) {
	this.map = map;
}
@Override
public String toString() {
	return "ModelId=" + modelId +"\n"+ "Model Code=" + modelCode+"\n" + "Model Cost=" + modelCost +"\n"+ "Map=" + map + "\n";
}

}