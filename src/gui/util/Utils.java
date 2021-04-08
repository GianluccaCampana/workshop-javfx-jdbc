package gui.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Utils {

	public static Stage currentStage(ActionEvent event) { //ActionEvente é clicar no botao
		return (Stage)((Node) event.getSource()).getScene().getWindow();
	}
	
	// converter valar do textFiled para int
	public static Integer tryParseToInt(String str) {
		try {
			return Integer.parseInt(str);
			
		} catch (NumberFormatException e) { // caso valor na caixa não sja um numero inteiro válido
			return null;
		}
		
	}
}
