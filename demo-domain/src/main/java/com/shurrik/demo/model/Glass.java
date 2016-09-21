package com.shurrik.demo.model;
import com.shurrik.common.domain.BaseDomain;
import java.math.BigDecimal;
import java.util.Date;

public class Glass extends BaseDomain{
	private String name; //书名
	private Integer price; //价格
	private Date createDate; //创建时间

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}
