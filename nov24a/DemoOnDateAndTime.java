package com.demo.nov24a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoOnDateAndTime {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date d2 = new Date(148,3,23);
		System.out.println(d2);
		
		
		Date d1 = new Date(82,0,22);
		System.out.println(d1);
		System.out.println(d1.after(d2));
		
		String str = "24-11-2024";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println(sdf.format(d1));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		Date d = sdf1.parse(str);
		System.out.println(d);
		System.out.println(d.toString());

	}

}
