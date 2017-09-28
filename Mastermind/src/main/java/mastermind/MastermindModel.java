package mastermind;

import java.util.ArrayList;

public class MastermindModel {
    
    private static final int MAX_TURNS = 10;
    public String codeGeneratedToGuess;
    private int turnCountdown;
    private int gameType;
    
    public MastermindModel(){
        
    }
    
    public ArrayList<Color> convertInputIntoCode(String StringCode) {
        //TODO
        ArrayList<Color> codeTriedByUser = null;
        return codeTriedByUser;
        
    }
    
    public String createGame(int gameType){
        SetGameType(gameType);
        resetTurnCountdown();
        resetCodes();
        return generateRandomCode();
        
    }
    
    private void SetGameType(int gameType) {
        this.gameType = gameType;
    }

    public void resetTurnCountdown() {
        turnCountdown = MAX_TURNS;
    }
    
    public void decrementTurnCountdown() {
        turnCountdown = turnCountdown - 1;
    }
    
    public String newGuess(String codeAttempt) {
        decrementTurnCountdown();
        return checkCodeAttempt(codeAttempt);
    }
    
    public void resetCodes() {
        resetCodeAttempt();
        resetCodeToGuess();
    }
    
    public void resetCodeAttempt() {
        //TODO
    }
    
    public void resetCodeToGuess() {
        //TODO
   }
    
    public String generateRandomCode() {
        codeGeneratedToGuess = "AARR";
        //TODO: create algorithm to randomize code (either with Array/List and then convert to String or directly with String)
        return codeGeneratedToGuess;
    }
    
    public String checkCodeAttempt(String codeAttempt) {
        //TODO: create comparison algorithm (compare codeGenerated and codeAttempt)
        return "has ganado";
    }
    
    public String getResults() {
        //TODO
        //if 
        return null;
    }

    public String getGameStatus() {
        
        if(isGameStarted()) {
            return "PLAYING";
        }
        
        else if(isNewGame()) {
            return "INITIAL";
        }
        
        else if(isGameEnded()) {
            return "FINAL";
        }
        
        else return "EXIT";
    }

    private boolean isGameEnded() {
        // TODO Auto-generated method stub
        return false;
    }

    private boolean isNewGame() {
        // TODO Auto-generated method stub
        return false;
    }

    private boolean isGameStarted() {
        // TODO Auto-generated method stub
        return false;
    }
    
    public boolean isGameWon() {
        //TODO
        return true;
    }
    
}
