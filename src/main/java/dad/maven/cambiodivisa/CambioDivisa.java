package dad.maven.cambiodivisa;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CambioDivisa extends Application {
	
	private Button btCambiar;
	private TextField tfMonedaOrigen;
	private TextField tfMonedaCambio;
	private ComboBox<String> cbMonedaOrigen;
	private ComboBox<String> cbMonedaCambio;

	@Override
	public void start(Stage primaryStage) throws Exception {
		btCambiar = new Button();
		btCambiar.setText("Cambiar");
		btCambiar.setDefaultButton(true);
		
		tfMonedaOrigen = new TextField("0");
		tfMonedaOrigen.setPrefColumnCount(4);
		tfMonedaOrigen.setPromptText("Indique el valor origen de la divisa");
		tfMonedaOrigen.setMaxWidth(100.0);
		
		tfMonedaCambio = new TextField();
		tfMonedaCambio.setPrefColumnCount(4);
		tfMonedaCambio.setMaxWidth(100.0);
		tfMonedaCambio.setEditable(false);
		
		cbMonedaOrigen = new ComboBox<String>();
		cbMonedaCambio = new ComboBox<String>();
		
		HBox hbOrigen = new HBox();
		hbOrigen.setSpacing(1);
		hbOrigen.setAlignment(Pos.BASELINE_CENTER);
		hbOrigen.getChildren().addAll(tfMonedaOrigen, cbMonedaOrigen);
		
		HBox hbDivisa = new HBox();
		hbDivisa.setSpacing(1);
		hbDivisa.setAlignment(Pos.BASELINE_CENTER);
		hbDivisa.getChildren().addAll(tfMonedaCambio, cbMonedaCambio);
		
		VBox root = new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(hbOrigen, hbDivisa, btCambiar);
		
		Scene escena = new Scene(root, 320, 200);
		
		primaryStage.setScene(escena);
		primaryStage.setTitle("Cambio de divisa");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
