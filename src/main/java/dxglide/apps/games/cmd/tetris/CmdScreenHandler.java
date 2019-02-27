package dxglide.apps.games.cmd.tetris;

import java.io.PrintStream;

import dxglide.apps.games.cmd.tetris.cmddisplay.CmdFormatting;
import dxglide.apps.games.cmd.tetris.cmddisplay.ScreenHandler;
import dxglide.apps.games.cmd.tetris.cmddisplay.ansienums.AnsiBackColors;
import dxglide.apps.games.cmd.tetris.cmddisplay.ansienums.AnsiEffects;
import dxglide.apps.games.cmd.tetris.cmddisplay.ansienums.AnsiFrontColors;

public class CmdScreenHandler implements Runnable {
	
	private PrintStream out;
	private boolean isRunning;
	private long delayTick;
	private ScreenHandler screen;
	
	private int size = 10;
	private char [][] table  = {

            {1  ,2 ,3 ,  4},
            {5  ,6 ,7,   8},
            {9  ,10 ,11 ,12},
            {13 ,14 ,15  ,16}


    };
	
//	private drawTable() {
//		
//	}
	
	

	public CmdScreenHandler(PrintStream out, long delayTick) {
		this.out = out;
		this.isRunning = false;
		this.delayTick = delayTick;
		screen = new ScreenHandler(80, 30, out);
		screen.initScreen();
	}
	
	
	
	private void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	
	
	
	private void sleep(long millis) {
		
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
		}
	}
	
	public boolean isRunning() {
		return isRunning;
	}
	
	public void stop() {
		isRunning = false;
	}

	public void start() {
		isRunning = true;
	}
	
	
	public void run() {

		
		//out.println(CmdFormatting.formatTextColor(clear, AnsiFrontColors.GREEN, AnsiBackColors.LIGHT_YELLOW, AnsiEffects.BOLD));
		
		start();
		
		long  tickCnt = 0L;
		while(isRunning) {
			
			// calculate
			// draw somthing
			String text = "Current tick .... " + tickCnt; 
			
			screen.draw();
			
//			out.print((char)0x2560);
//			out.print((char)0x2550);
//			out.print((char)0x2550);
//			out.print((char)0x2550);
				
			//out.println(CmdFormatting.formatTextColor(text, AnsiFrontColors.BLUE, null, AnsiEffects.UNDERLINE));
			//out.println(CmdFormatting.formatTextColor(text, AnsiFrontColors.GREEN, AnsiBackColors.LIGHT_YELLOW, AnsiEffects.BOLD));
			
			sleep(delayTick);
			
			tickCnt++;
			
			//clearScreen();
			
			stop();
			
//			if (tickCnt > 1) {
//				stop();
//			}
			
		}
		
		// new line
		
		out.print("\n");
		
		
	}
	

}
