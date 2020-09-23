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
    

}