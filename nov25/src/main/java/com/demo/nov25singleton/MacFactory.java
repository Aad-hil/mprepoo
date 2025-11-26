package com.demo.nov25singleton;

public class MacFactory implements GUIFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

	@Override
	public CheckBox createCheckbox() {
		// TODO Auto-generated method stub
		return new MacCheckBox();
	}

}
