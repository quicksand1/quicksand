package com.quicksand.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sys_Option")
public class Option {
	private Long id;
	private Integer optionType;
	private String showText;
	private String value;
	private Boolean isAffect;
	private Integer sortOrder;
	private String remark;
	
	@Id
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getOptionType() {
		return optionType;
	}
	public void setOptionType(Integer optionType) {
		this.optionType = optionType;
	}
	public String getShowText() {
		return showText;
	}
	public void setShowText(String showText) {
		this.showText = showText;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Boolean getIsAffect() {
		return isAffect;
	}
	public void setIsAffect(Boolean isAffect) {
		this.isAffect = isAffect;
	}
	public Integer getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
