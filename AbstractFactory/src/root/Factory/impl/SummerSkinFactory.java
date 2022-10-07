package root.Factory.impl;

import root.Factory.SkinFactory;
import root.Product.Button.Button;
import root.Product.Button.impl.SummerButton;
import root.Product.ComboBox.ComboBox;
import root.Product.ComboBox.impl.SummerComboBox;
import root.Product.TextField.TextField;
import root.Product.TextField.impl.SummerTextField;

public class SummerSkinFactory implements SkinFactory {
	public Button createButton() {
		return new SummerButton();
	}

	public TextField createTextField() {
		return new SummerTextField();
	}

	public ComboBox createComboBox() {
		return new SummerComboBox();
	}
}