package root.Factory;

import root.Product.Button.Button;
import root.Product.ComboBox.ComboBox;
import root.Product.TextField.TextField;

public interface SkinFactory {
	public Button createButton();
	public TextField createTextField();
	public ComboBox createComboBox();
}