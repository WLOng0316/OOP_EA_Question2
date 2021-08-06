package EAQuestion2TicTacToe;


import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;

public class Cell extends Pane{
	
	Game game = new Game();
	
	char whoseTurn = 'X';
	public char token = ' ';
	//char token = main.token;
	
	
	//int state;
	// if in that sqaure is empty, state = 0; square is 'X', state = 1, square is 'O', state = 2;
	
	//public char token = ' ';
	
	public Cell() {
		
        setStyle(" -fx-border-color: black");
        this.setPrefSize(2000,2000);
        this.setOnMouseClicked(event -> handleMouseClick());
		
	}
	
    //getter and setter
    public char getToken() {
        return token;
    }
    
    public void setToken(char c) {
        token = c;

        if (token == 'X'){
            Line line1 = new Line(10,10,this.getWidth()-10,this.getHeight()-10);
            line1.endXProperty().bind(this.widthProperty().subtract(10));
            line1.endYProperty().bind(this.heightProperty().subtract(10));
            Line line2 = new Line(10,this.getHeight() - 10, this.getWidth()-10,10);
            line2.startYProperty().bind(this.heightProperty().subtract(10));
            line2.endXProperty().bind(this.widthProperty().subtract(10));

            this.getChildren().addAll(line1,line2);
        }else if (token == 'O'){
            Ellipse ellipse = new Ellipse(this.getWidth()/2,this.getHeight()/2,
                    this.getWidth()/2 - 10,this.getHeight()/2 - 10);
            ellipse.centerXProperty().bind(this.widthProperty().divide(2));
            ellipse.centerYProperty().bind(this.heightProperty().divide(2));
            ellipse.radiusXProperty().bind(this.widthProperty().divide(2).subtract(10));
            ellipse.radiusYProperty().bind(this.heightProperty().divide(2).subtract(10));
            ellipse.setFill(Color.ORANGE);
            ellipse.setStroke(Color.BLACK);

            this.getChildren().add(ellipse);
        }

    }
    
    private void handleMouseClick() {

        if (token == ' ' && whoseTurn != ' '){
            setToken(whoseTurn);

            if (game.isWon(whoseTurn)) {
                //lblStatus.setText(whoseTurn+" won! The game is over!");
                whoseTurn = ' ';
            }else if (game.isFill()){
                //lblStatus.setText("Draw! The game is over!");
                whoseTurn = ' ';
            }else {
                whoseTurn = (whoseTurn == 'X')? 'O': 'X';
                //lblStatus.setText(main.whoseTurn+"'s turn");
            }
        }
    }
    
    
	
	
	

}
