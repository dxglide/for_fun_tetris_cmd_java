package dxglide.apps.games.cmd.tetris.cmddisplay.ansienums;

/**
 * ANSI terminal https://misc.flogisoft.com/bash/tip_colors_and_formatting
 *
 */
public enum AnsiBackColors {

	BLACK("40"),
	RED("41"),
	GREEN("42"),
	YELLOW("43"),
	BLUE("44"),
	MAGENTA("45"),
	CYAN("46"),
	LIGHT_GREY("47"),
	
	DEFAULT_COLOR("49"),
	
	DARK_GREY("100"),
	LIGHT_RED("101"),
	LIGHT_GREEN("102"),
	LIGHT_YELLOW("103"),
	LIGHT_BLUE("104"),
	LIGHT_MAGENTA("105"),
	LIGHT_CYAN("106"),
	WHITE("107");
	
	
	private String code;
	
	AnsiBackColors(String code) {
		this.code = code;
	}
	
	public String code() {
		return code;
	}
	
	
}
