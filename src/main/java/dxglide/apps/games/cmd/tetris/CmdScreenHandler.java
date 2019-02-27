package dxglide.apps.games.cmd.tetris;

import java.io.PrintStream;

public class CmdScreenHandler implements Runnable {
	
	private PrintStream out;
	private boolean isRunning;
	private long delayTick;
	

	public CmdScreenHandler(PrintStream out, long delayTick) {
		this.out = out;
		this.isRunning = false;
		this.delayTick = delayTick;
	}
	
	public void printAnytinh() {
		
		out.println("STARTING ....");

		sleep(1000);

		out.println("After sleeping .... 1");

		sleep(1000);

		out.println("After sleeping .... 2");

		sleep(1000);

		out.println("After sleeping .... 3");

		clearScreen();

		// sleep(1000);

		out.println("Screan is cleared");
		
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
	
	


	@Override
	public void run() {
		
		start();
		
		long  tickCnt = 0L;
		while(isRunning) {
			
			// calculate
			// draw somthing
			out.println("Current tick .... " + tickCnt);
			
			sleep(delayTick);
			
			tickCnt++;
			
			clearScreen();
			
			if (tickCnt > 10) {
				stop();
			}
			
		}
		
		
	}
	

}
