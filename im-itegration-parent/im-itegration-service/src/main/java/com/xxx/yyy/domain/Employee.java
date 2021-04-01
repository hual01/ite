package com.xxx.yyy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@TableName("employee")
@Data
public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@TableId(value="id",type = IdType.INPUT)
	private Integer id;
	@TableField(value = "name")
    private String name;	//姓名
	@TableField(value = "gender")
    private String gender;	//性别

	@TableField(value = "birthday")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date birthday;	//生日
	@TableField(value = "idCard")
    private String idCard;	//身份证
	@TableField(value = "wedlock")
    private String wedlock;	//婚姻状况
	
	@TableField(value = "nationId")
    private Integer nationId;//民族id
	@TableField(value = "nativePlace")
    private String nativePlace;//籍贯
	@TableField(value = "politicId")
    private Integer politicId;//政治面貌id

	@TableField(value = "email")
    private String email;//邮箱
	@TableField(value = "phone")
    private String phone;//电话
	@TableField(value = "address")
    private String address;//联系地址
	@TableField(value = "deptId")
    private Integer deptId;//部门id


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public String getIdCard() {
		return idCard;
	}


	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}


	public String getWedlock() {
		return wedlock;
	}


	public void setWedlock(String wedlock) {
		this.wedlock = wedlock;
	}


	public Integer getNationId() {
		return nationId;
	}


	public void setNationId(Integer nationId) {
		this.nationId = nationId;
	}


	public String getNativePlace() {
		return nativePlace;
	}


	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}


	public Integer getPoliticId() {
		return politicId;
	}


	public void setPoliticId(Integer politicId) {
		this.politicId = politicId;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Integer getDeptId() {
		return deptId;
	}


	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
    
	
}