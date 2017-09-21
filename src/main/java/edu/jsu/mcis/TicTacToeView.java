package edu.jsu.mcis;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
		
		System.out.print("\n  ");
		for (int i = 0; i < model.getWidth(); i++){
			System.out.print(i);
		}
		System.out.print("\n\n");
		
		for(int i = 0; i < model.getWidth(); i++){
			System.out.print(i + " ");
			for(int j = 0; j < model.getWidth(); j++)
				System.out.print(model.getMark(j,i));
			
			System.out.print("\n");
		}
		System.out.print("\n\n\n");
	}

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

		if(model.isXTurn()){
        
			System.out.println("Player 1(X) Move:");
		}
		else{
			System.out.println("Player 2(O) Move:");
		}
			System.out.println("Enter the row and column numbers, separated by a space: ");	
    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        System.out.println("Error: Invalid input. Try Again!");

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}