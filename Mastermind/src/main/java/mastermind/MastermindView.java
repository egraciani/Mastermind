package mastermind;

import utils.IO;
import utils.LimitedIntDialog;

public class MastermindView {
    
    private IO io;
    private String initialMessage;
    private String codeAttemptedByUser;
    private String winMessage;
    private String chooseGameModeMessage;
    private String introduceAttemptMesage;
    private int gameType;
    
    public void Mastermind() {
        initialMessage = "Mastermind. Opciones: 1. Partida y 2. Demo";
        chooseGameModeMessage = "Elige un modo de juego";
        introduceAttemptMesage = "Introduce el intento";
    }
    
    public int startGame(){
        io.writeln(initialMessage);
        
        //Game or demo
        gameType = LimitedIntDialog.instance().read(chooseGameModeMessage, 1, 2);
        
        return gameType;
     }
    
    public String readAttempt() {
        codeAttemptedByUser = io.readString(introduceAttemptMesage);
        return codeAttemptedByUser;
    }
    
    public int getGameType() {
        return gameType;
    }
    
    public String getAttempt() {
        return codeAttemptedByUser;
    }
    
    public void showResults(String results) {
        io.writeln(results);
    }
 
    
    public void showWinMessage() {
        io.writeln(winMessage);
    }
    
}
