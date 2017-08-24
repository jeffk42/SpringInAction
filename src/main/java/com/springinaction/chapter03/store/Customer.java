package com.springinaction.chapter03.store;

public class Customer {
	
	private boolean broke = false;
	private String name = null;
	
	public boolean isBroke() {
		return broke;
	}
	
	public void setBroke(boolean broke) {
		this.broke = broke;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
