package dxglide.apps.games.cmd.tetris;

import java.io.PrintStream;

import dxglide.apps.games.cmd.tetris.cmddisplay.CmdFormatting;
import dxglide.apps.games.cmd.tetris.cmddisplay.ScreenHandler;
import dxglide.apps.games.cmd.tetris.cmddisplay.ansienums.AnsiBackColors;
import dxglide.apps.games.cmd.tetris.cmddisplay.ansienums.AnsiEffects;
import dxglide.apps.games.cmd.tetris.cmddisplay.ansienums.AnsiFrontColors;

public class GameHandler implements Runnable {
	
	private PrintStream out;
	private boolean isRunning;
	private long delayTick;
	private ScreenHandler screen;
	

	public GameHandler(PrintStream out, long delayTick) {
		this.out = out;
		this.isRunning = false;
		this.delayTick = delayTick;
		screen = new ScreenHandler(100, 30, out);  // 80 and 25 //  20 -> 5
		screen.init();
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
		
		jcurses.system.InputChar ch;
		start();
		
		long  tickCnt = 0L;
		while(isRunning) {
			ch=jcurses.system.Toolkit.readCharacter(); 
			//out.println("\nCurrent tick .... " + tickCnt);
			
			
			
			screen.updateStatsBox(ch.getCode(), tickCnt);
			screen.update();
			screen.draw();
			
//			out.print((char)0x2560);
//			out.print((char)0x2550);
//			out.print((char)0x2550);
//			out.print((char)0x2550);
				
			//out.println(CmdFormatting.formatTextColor(text, AnsiFrontColors.BLUE, null, AnsiEffects.UNDERLINE));
			//out.println(CmdFormatting.formatTextColor(text, AnsiFrontColors.GREEN, AnsiBackColors.LIGHT_YELLOW, AnsiEffects.BOLD));
			
			sleep(delayTick);
			
			tickCnt++;
			
			
			clearScreen();
			
			//stop();
			
			if (tickCnt > 10) {
				stop();
			}
			
	
			
			
		}
		
		// new line
		
		out.print("\n");
		
		
	}
	

}
