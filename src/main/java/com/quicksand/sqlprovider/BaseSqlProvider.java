package com.quicksand.sqlprovider;

import java.lang.reflect.Field;

import com.quicksand.entity.JswyCoupon;

public class BaseSqlProvider {
	public String save(JswyCoupon entity) {
		Field[] fields=entity.getClass().getDeclaredFields();
		String strKey="";
		String strValue="";
		for (Field field : fields) {
			field.setAccessible(true);// 设置属性可以访问
			try {
				Object val = fields[1].get(entity);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// 得到此属性的值
			String type = field.getType().toString();// 得到此属性的类型
			if (type.endsWith("String")) {
				System.out.println(field.getType() + "\t是String");
			} else if (type.endsWith("int") || type.endsWith("Integer")) {
				System.out.println(field.getType() + "\t是int");
			} else {
				System.out.println(field.getType() + "\t");
			}
		}
		return "";
	}
	
//	public String name() {
//		
//	}
}
