package com.demo.nov24a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDate {

	public static void main(String[] args) throws ParseException {

		Date date = new Date();

		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		java.util.Date utildate = new java.util.Date();
		System.out.println("Util Date: " + date);
		System.out.println("SQL Date: " + sqlDate);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String formatDate = sdf.format(date);
		sqlDate = java.sql.Date.valueOf(formatDate);
		System.out.println(sqlDate);

		String strDate = "15-08-2025";
		sdf = new SimpleDateFormat("dd-MM-yyyy");
//		java.util.Date udate = sdf.parse(strDate);
//		java.sql.Date sdate = new java.sql.Date(udate.getTime());
//		java.sql.Date sqlDate1 = java.sql.Date.valueOf("2025-10-24");
//		java.util.Date uudate = new java.sql.Date(sqlDate.getTime());
//		java.util.Date uudate1 = sqlDate1;
//
//		String dobStr = "22-01-1982";
//		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
//		Date utilDate = sdf1.parse(dobStr);
//
//		java.sql.Date sqlDate11 = new java.sql.Date(utilDate.getTime());
//
//		System.out.println("Util Date: " + utilDate);
//		System.out.println("SQL Date: " + sqlDate11);

		String dobStr1 = "22-01-1982";
		Date utilDate1 = sdf.parse(dobStr1);
		java.sql.Date sqlDate111 = new java.sql.Date(utilDate1.getTime());
		Date backToUtil = new Date(sqlDate111.getTime());
		System.out.println("String: " + dobStr1);
		System.out.println("SQL Date: " + sqlDate111);
		System.out.println("Util Date: " + backToUtil);
	}

}
