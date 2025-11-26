package com.demo.nov25singleton;

import com.dem.nov25builderpattern.DrinkMaker;
import com.dem.nov25builderpattern.Pizza;
import com.dem.nov25builderpattern.TeaMaker;

public class AppMain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DBConnection db = DBConnection.getInstance();
//		DBConnection db1 = DBConnection.getInstance();
//		DBConnection db2 = DBConnection.getInstance();
//		System.out.println(db.hashCode());
//		System.out.println(db1.hashCode());
//		System.out.println(db2.hashCode());
//			
//		Shape sf = ShapeFactory.getShape("circle");
//		sf.draw();
//
//		GUIFactory winfac = new WinFactory();
//		Button b = winfac.createButton();
//		CheckBox c = winfac.createCheckbox();
//		b.click();
//		c.check();
//
//		GUIFactory macfac = new MacFactory();
//		Button Mb = macfac.createButton();
//		CheckBox Mc = macfac.createCheckbox();
//		Mb.click();
//		Mc.check();
//
//		Pizza p = new Pizza.Builder("medium").cheese(true).olives(false).build();
//		System.out.println(p);
		
		
		DrinkMaker tea = new TeaMaker();
		tea.prepareDrink();
	}

}
