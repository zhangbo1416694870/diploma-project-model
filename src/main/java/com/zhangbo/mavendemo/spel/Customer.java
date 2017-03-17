package com.zhangbo.mavendemo.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Customer")
public class Customer {
	
	@Value("#{Item}")
	private Item item;
	
	@Value("#{Item.name}")
	private String itemName;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "itemName=" +this.itemName+" "+"Item.total="+this.item.getTotal();
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	
}
