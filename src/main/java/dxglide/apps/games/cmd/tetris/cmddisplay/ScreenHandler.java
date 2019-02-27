package dxglide.apps.games.cmd.tetris.cmddisplay;

import java.io.PrintStream;

/**
 * https://en.wikipedia.org/wiki/Box-drawing_character
 *
 */
public class ScreenHandler {

	private int sizeX;
	private int sizeY;
	private char [][] screenMatrix = null;
	private PrintStream out;
	

	public ScreenHandler(int sizeX, int sizeY, PrintStream out) {
		super();
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.out = out;
	}
	
	
	/**
	 * Initialize screen matrix for overall display.
	 */
	public void initScreen() {
		screenMatrix = new char [sizeX][sizeY];
			
		
		for (int y = 0 ; y < sizeY; y++) {
			for (int x = 0 ; x < sizeX; x++) {
				screenMatrix[x][y] = (char)0x2591;   // filling with somthinf
			}
		}
		
		
		// MAIN BOX
		// set conners
		
		screenMatrix[0][0] = (char)0x2554; //upper left
		screenMatrix[sizeX-1][0] = (char)0x2557; //upper right
		screenMatrix[0][sizeY-1] = (char)0x255A; //low left
		screenMatrix[sizeX-1][sizeY-1] = (char)0x255D; //low right
		
		//lines x axis
		for (int i = 1 ; i < sizeX - 1; i++) {
			screenMatrix[i][0] = (char)0x2550; //upper left
			screenMatrix[i][sizeY-1] = (char)0x2550; //upper left
		}
		
		//lines y axis
		for (int i = 1 ; i < sizeY - 1; i++) {
			screenMatrix[0][i] = (char)0x2551; //horizontal bar
			screenMatrix[sizeX-1][i] = (char)0x2551; //vertical bar
		}
	}
	
	public void update() {
		
	}
	
	
	public void draw() {
		if (screenMatrix != null) {
			
			for (int y = 0 ; y < sizeY; y++) {
				out.print("\n");
				for (int x = 0 ; x < sizeX; x++) {
					out.print(screenMatrix[x][y]); 
				}
			}
			
			out.flush();
			
		}
	}
	
	


	public int getSizeX() {
		return sizeX;
	}

	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}

	public int getSizeY() {
		return sizeY;
	}

	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}

}
