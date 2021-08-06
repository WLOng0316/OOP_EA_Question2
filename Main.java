package EAQuestion2TicTacToe;



import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application{
	
	//int boardGrid = 3;
	
	Board board = new Board();
	Player player1 = new Player("Player1", 'X');
	Player player2 = new Player("Player1", 'O');

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Group root = new Group();
		
		
		
		
		
		
		//Canvas canvas = new Canvas(600,600);
		//GraphicsContext gc = canvas.getGraphicsContext2D();
		
        /*GridPane pane = new GridPane();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                pane.add(square[i][j] = new Cell(),j,i);
            }
        }*/
		
		//GridPane pane = new GridPane();
		
		GridPane pane = board.drawBoard();
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);
		//root.getChildren().add(borderPane);
		
		

		stage.setResizable(false);
		stage.setTitle("TicTacToe"); 
		Image image = new Image("tictactoe.png"); 
		stage.getIcons().add(image);
		
		Scene scene = new Scene(borderPane,450,460,Color.WHITE);
		
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
