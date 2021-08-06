package EAQuestion2TicTacToe;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;

public class Board {
	
	Cell[][] cell = new Cell[3][3];
	
	public Board() {
		
		
	}
	
	
	public GridPane drawBoard() {
		
        GridPane pane = new GridPane();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                pane.add(cell[i][j] = new Cell(),j,i);
            }
        }
        
        return pane;
		
	}

}


