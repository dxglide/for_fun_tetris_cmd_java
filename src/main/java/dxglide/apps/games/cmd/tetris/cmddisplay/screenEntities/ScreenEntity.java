package dxglide.apps.games.cmd.tetris.cmddisplay.screenEntities;

public abstract class ScreenEntity {
	
	protected int xmatrix;
	protected int ymatrix;
	protected int xlength;
	protected int ylenght;
	
	public ScreenEntity() {
	}

	public ScreenEntity(int xmatrix, int ymatrix, int xlength, int ylenght) {
		super();
		this.xmatrix = xmatrix;
		this.ymatrix = ymatrix;
		this.xlength = xlength;
		this.ylenght = ylenght;
	}
	
	
	public abstract void calculateMatrix(char [][] screenmatrix);
	
	public abstract void updateMatrix(char [][] screenmatrix);
	
	public abstract void draw(char [][] screenmatrix);
	
	
	

}
