package dxglide.apps.games.cmd.tetris;

public class CmdGameApp {

	public static void main(String[] args) {
		
		CmdScreenHandler csh = new CmdScreenHandler(System.out, 1000L);
		
		
		Thread cshRunnnable = new Thread(csh, "test mano ");
		cshRunnnable.start();
		 

	}


	


}
