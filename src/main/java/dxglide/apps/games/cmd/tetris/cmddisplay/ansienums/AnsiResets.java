package dxglide.apps.games.cmd.tetris.cmddisplay.ansienums;

/**
 * ANSI terminal https://misc.flogisoft.com/bash/tip_colors_and_formatting
 *
 */
public enum AnsiResets {
	
	CLEAR("0");
	
	private String code;
	
	AnsiResets(String code) {
		this.code = code;
	}
	
	public String code() {
		return code;
	}
}
