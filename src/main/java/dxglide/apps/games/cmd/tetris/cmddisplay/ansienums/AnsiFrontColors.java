package dxglide.apps.games.cmd.tetris.cmddisplay.ansienums;

/**
 * ANSI terminal https://misc.flogisoft.com/bash/tip_colors_and_formatting
 *
 */
public enum AnsiFrontColors {

	BLACK("30"),
	RED("31"),
	GREEN("32"),
	YELLOW("33"),
	BLUE("34"),
	MAGENTA("35"),
	CYAN("36"),
	LIGHT_GREY("37"),
	
	DEFAULT_COLOR("39"),
	
	DARK_GREY("90"),
	LIGHT_RED("91"),
	LIGHT_GREEN("92"),
	LIGHT_YELLOW("93"),
	LIGHT_BLUE("94"),
	LIGHT_MAGENTA("95"),
	LIGHT_CYAN("96"),
	WHITE("97");
	
	
	private String code;
	
	AnsiFrontColors(String code) {
		this.code = code;
	}
	
	public String code() {
		return code;
	}
	
	
}
