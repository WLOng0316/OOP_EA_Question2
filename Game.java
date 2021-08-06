package EAQuestion2TicTacToe;


public class Game {
	
	Cell[][] cells = new Cell[3][3];
	
	
    public boolean isFill(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cells[i][j].getToken() == ' '){
                    return false;
                }

            }
        }
        return true;
    }

    public boolean isWon(char token){
        for (int i = 0; i < 3; i++) {
            if (cells[i][0].getToken() == token
                && cells[i][1].getToken() == token
                && cells[i][2].getToken() == token){
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (cells[0][i].getToken() == token
                    && cells[1][i].getToken() == token
                    && cells[2][i].getToken() == token){
                return true;
            }
        }
        if (cells[0][0].getToken() == token
                && cells[1][1].getToken() == token
                && cells[2][2].getToken() == token){
            return true;
        }
        if (cells[2][0].getToken() == token
                && cells[1][1].getToken() == token
                && cells[0][2].getToken() == token){
            return true;
        }

        return false;
    }
    
    
    

}
