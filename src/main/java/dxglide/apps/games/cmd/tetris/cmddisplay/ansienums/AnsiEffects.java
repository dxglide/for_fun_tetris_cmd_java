package dxglide.apps.games.cmd.tetris.cmddisplay.ansienums;

/**
 * ANSI terminal https://misc.flogisoft.com/bash/tip_colors_and_formatting
 * https://stackoverflow.com/questions/4842424/list-of-ansi-color-escape-sequences
 *
 */
public enum AnsiEffects {
	
	BOLD("1"),
	ITALICS("3"),
	UNDERLINE("4");
	
	private String code;
	
	AnsiEffects(String code) {
		this.code = code;
	}
	
	public String code() {
		return code;
	}
}
