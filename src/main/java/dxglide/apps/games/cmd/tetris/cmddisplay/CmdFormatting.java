package dxglide.apps.games.cmd.tetris.cmddisplay;

import dxglide.apps.games.cmd.tetris.cmddisplay.ansienums.AnsiBackColors;
import dxglide.apps.games.cmd.tetris.cmddisplay.ansienums.AnsiEffects;
import dxglide.apps.games.cmd.tetris.cmddisplay.ansienums.AnsiFrontColors;
import dxglide.apps.games.cmd.tetris.cmddisplay.ansienums.AnsiResets;

public class CmdFormatting {
	
	private final static String ESC = "\033";  
	private final static String BRA = "[";
	private final static String SEM = ";";
	private final static String MSG = "m";
	
	
	
	
	
	public static String resetAllAnsiColors() {
		
		return ESC + BRA + AnsiFrontColors.DEFAULT_COLOR.code() + SEM + AnsiResets.CLEAR.code();
	}
	
	public static String formatTextColor(String text, AnsiFrontColors front, AnsiBackColors back, AnsiEffects effect) {
		String temp = null;
		if (text != null) {
			
			//  ("\033[31;1m"  + text + "\033[0m");
			temp =  ESC + BRA;
			if (front != null) {
				temp +=  front.code();
			}
			if (effect != null) {
				temp +=  SEM + effect.code();
			}
			if (back != null) {
				temp +=  SEM + back.code();
			}

			
			temp += MSG + text + ESC + BRA + AnsiResets.CLEAR.code();
			
			
			
		} 
		return temp;
	}

}
