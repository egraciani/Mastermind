package mastermind;

public class MastermindController {
    MastermindView view;
    MastermindModel model;
    
    public MastermindController(MastermindView view, MastermindModel model) {
        //TODO
        this.view = view;
        this.model = model;
        
    }

    public void play() {
        int gameType;
        String codeGeneratedToGuess;
        String codeAttempt;
        String results;
        
        switch (this.model.getGameStatus()) {
        
        case "INITIAL":
            gameType = view.startGame();
            codeGeneratedToGuess = model.createGame(gameType);
            
            assert(codeGeneratedToGuess != null);
            codeAttempt = view.readAttempt();
            results = model.newGuess(codeAttempt);
            view.showResults(results);
            
        case "PLAYING":
            view.getAttempt();
            codeAttempt = view.readAttempt();
            results = model.newGuess(codeAttempt);
            
            if(model.isWin()) {
                view.showWinMessage();
            }
            else {
                view.showResults(model.getResults());
            }
            
        case "FINAL":
            
        case "EXIT":
            
        }
    
    }    
    

}