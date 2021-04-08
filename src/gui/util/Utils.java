package gui.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Utils {

	public static Stage currentStage(ActionEvent event) { //ActionEvente � clicar no botao
		return (Stage)((Node) event.getSource()).getScene().getWindow();
	}
	
	// converter valar do textFiled para int
	public static Integer tryParseToInt(String str) {
		try {
			return Integer.parseInt(str);
			
		} catch (NumberFormatException e) { // caso valor na caixa n�o sja um numero inteiro v�lido
			return null;
		}
		
	}
}
