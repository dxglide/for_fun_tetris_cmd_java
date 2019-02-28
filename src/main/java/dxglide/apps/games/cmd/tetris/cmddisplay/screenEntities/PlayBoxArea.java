package dxglide.apps.games.cmd.tetris.cmddisplay.screenEntities;

public class PlayBoxArea extends BoxArea {

	
	public PlayBoxArea() {
		super();
	}

	public PlayBoxArea(int xpos, int ypos, int sizeX, int sizeY) {
		super(xpos, ypos, sizeX, sizeY);
	}

	@Override
	public void update(char[][] screenmatrix) {
		super.update(screenmatrix); //drawsbox
		
		
	}
}
