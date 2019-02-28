package dxglide.apps.games.cmd.tetris;

public class CmdGameApp {

	public static void main(String[] args) {
		
		GameHandler csh = new GameHandler(System.out, 1000L);
		
		
		Thread cshRunnnable = new Thread(csh, "test mano ");
		cshRunnnable.start();
		 

	}


	


}
