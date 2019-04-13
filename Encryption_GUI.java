
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Encryption_GUI extends Application {

	@Override
	public void start(Stage primaryStage) {

		// BORDERPANE
		BorderPane borderPane = new BorderPane();
		borderPane.setPadding(new Insets(5));

		Label lbl1 = new Label("Encryption & Decryption - Software");
		lbl1.setFont(Font.font("Verdana", FontWeight.BOLD, 20));

		VBox vb1 = new VBox();
		HBox hb1 = new HBox();
		TextField tf1 = new TextField();
		tf1.setFont(Font.font("Verdana", FontWeight.BOLD, 50));
		TextField tf2 = new TextField();
		tf2.setFont(Font.font("Verdana", FontWeight.BOLD, 50));
		Button bt1 = new Button("encrypt");
		bt1.setPrefSize(150, 60);
		bt1.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		Button bt2 = new Button("decrypt");
		bt2.setPrefSize(150, 60);
		bt2.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		Button bt3 = new Button("CLEAR");
		bt3.setPrefSize(150, 60);
		bt3.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		hb1.getChildren().addAll(bt1, bt2, bt3);
		tf1.setMinSize(600, 200);
		tf2.setMinSize(600, 200);
		vb1.getChildren().addAll(tf1, tf2);
		borderPane.setPrefSize(700, 580);
		borderPane.setTop(lbl1);
		borderPane.setLeft(vb1);
		borderPane.setBottom(hb1);

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		System.out.print("Encrypted: ");
		char[] alphabet1 = "abcdefghijklmnopqrstuvwxyz".toCharArray();

		System.out.println("");
		bt1.setOnAction(gd -> {

			String s1 = "";
			for (int i = 0; i < tf1.getText().length(); i++) {
				if (tf1.getText().charAt(i) != ' ' && (tf1.getText().charAt(i) != '.')
						&& (tf1.getText().charAt(i) != ',')) {
					if (alphabet.indexOf(tf1.getText().charAt(i)) < 21) {
						int output = alphabet.indexOf(tf1.getText().charAt(i)) + 5;
						System.out.print(Character.toString(alphabet1[output]).toLowerCase());
						s1 += Character.toString(alphabet1[output]).toLowerCase();
						tf2.setText(s1);
					} else {
						int output = alphabet.indexOf(tf1.getText().charAt(i)) - 21;
						System.out.print(Character.toString(alphabet1[output]).toLowerCase());
						s1 += Character.toString(alphabet1[output]).toLowerCase();
						tf2.setText(s1);
					}
				} else {
					System.out.print(tf1.getText().charAt(i));
					s1 += tf1.getText().charAt(i);
					tf2.setText(s1);
				}
			}
		});

		bt2.setOnAction(gd -> {

			String s1 = "";
			for (int j = 1; j < 27; j++) {
				System.out.println("Shift Number: " + (26-j));
				
				for (int i = 0; i < tf1.getText().length(); i++) {
					if (tf1.getText().charAt(i) != ' ' && (tf1.getText().charAt(i) != '.') && (tf1.getText().charAt(i) != ',')) {
						if ((alphabet.indexOf(tf1.getText().charAt(i)) + j) <= 25) {
							int output1 = alphabet.indexOf(tf1.getText().charAt(i)) + j;
							System.out.print(Character.toString(alphabet1[output1]).toLowerCase());
							s1 += Character.toString(alphabet1[output1]).toLowerCase();
							tf2.setText(s1);
						} else {
							int output1 = alphabet.indexOf(tf1.getText().charAt(i)) - (26 - j);
							System.out.print(Character.toString(alphabet1[output1]).toLowerCase());
							s1 += Character.toString(alphabet1[output1]).toLowerCase();
							tf2.setText(s1);
						}
					} else {
						System.out.print(tf1.getText().charAt(i));
						s1 += tf1.getText().charAt(i);
						tf2.setText(s1);
					}
				}
				System.out.println();
				s1 += "  \n";
				tf2.setText(s1);
			}
		});

		
		bt3.setOnAction(gd -> {
			tf1.clear();
			tf2.clear();
		});

		primaryStage.setScene(new Scene(borderPane));
		primaryStage.setTitle("Doris Klingenschmid, Rocsika Toth");
		primaryStage.setResizable(true);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
