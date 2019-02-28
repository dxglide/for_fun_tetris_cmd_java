package dxglide.apps.games.cmd.tetris.cmddisplay;


import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import dxglide.apps.games.cmd.tetris.cmddisplay.screenEntities.BoxArea;
import dxglide.apps.games.cmd.tetris.cmddisplay.screenEntities.PlayBoxArea;
import dxglide.apps.games.cmd.tetris.cmddisplay.screenEntities.ScreenEntity;
import dxglide.apps.games.cmd.tetris.cmddisplay.screenEntities.StatsBoxArea;

/**
 * https://en.wikipedia.org/wiki/Box-drawing_character
 *
 */
public class ScreenHandler {

	private int screenSizeX;
	private int screenSizeY;
	
	
	List<ScreenEntity> screenEntities = new ArrayList<ScreenEntity>();
	
	private char [][] screenMatrix = null;
	private PrintStream out;
	

	public ScreenHandler(int screenSizeX, int screenSizeY, PrintStream out) {
		super();
		this.screenSizeX = screenSizeX;
		this.screenSizeY = screenSizeY;
		this.out = out;
	}
	
	
	/**
	 * Initialize screen objects ant etc.
	 */
	public void init() {
		
		screenMatrix = new char [screenSizeX][screenSizeY]; // 100, 30
		
		// fill for debugging a background
		// Initialize screen array, if null there is missing fields
		
		for (int y = 0; y < screenSizeY; y++) {
			for (int x = 0; x < screenSizeX; x++) {
				screenMatrix[x][y] = (char) 0x2591; // filling with somthinf
			}
		}
		
		
		
		PlayBoxArea mainPlayBox = new PlayBoxArea(0,0,80,30);
		StatsBoxArea statsBox = new StatsBoxArea(80,0,20,30);
		screenEntities.add(mainPlayBox);
		screenEntities.add(statsBox);

		

		
	}
	
	public void update() {
		
		for (ScreenEntity se : screenEntities) {
			se.update(screenMatrix);
		}
		
	}
	
	
	public void draw() {
		
		if (screenMatrix != null) {
			
			for (int y = 0 ; y < screenSizeY; y++) {
				out.print("\n");
				for (int x = 0 ; x < screenSizeX; x++) {
					out.print(screenMatrix[x][y]); 
				}
			}
			
			out.flush();
			
		}
	}

}
