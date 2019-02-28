package dxglide.apps.games.cmd.tetris.cmddisplay.screenEntities;

public abstract class ScreenEntity {

	protected int xpos;
	protected int ypos;
	protected int sizeX;
	protected int sizeY;
	protected EnumEntities entity;

	public ScreenEntity() {
		// default
		this.sizeY = 0;
		this.ypos = 0;
		this.sizeX = 80;
		this.sizeY = 25;
		this.entity = EnumEntities.DEFAULT;
	}

	public ScreenEntity(int xpos, int ypos, int sizeX, int sizeY, EnumEntities entity) {
		this.xpos = xpos;
		this.ypos = ypos;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.entity = entity;
	}

	public abstract void setup(char[][] screenmatrix);

	public abstract void update(char[][] screenmatrix);

	public abstract void draw(char[][] screenmatrix);

	public int getXpos() {
		return xpos;
	}

	public void setXpos(int xpos) {
		this.xpos = xpos;
	}

	public int getYpos() {
		return ypos;
	}

	public void setYpos(int ypos) {
		this.ypos = ypos;
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

	public EnumEntities getEntity() {
		return entity;
	}

}
