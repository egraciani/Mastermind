package mastermind;


public class Mastermind {
    
    private MastermindView view;
    private MastermindModel model;
    
    public Mastermind() {
        this.view = new MastermindView();
        this.model = new MastermindModel();
            
    }
    
    public void play() {
        MastermindController controller = new MastermindController(view, model);
        controller.play();
        
    }
    
    public static void main(String[] args) {
        new Mastermind().play();
        
    }
    
}

