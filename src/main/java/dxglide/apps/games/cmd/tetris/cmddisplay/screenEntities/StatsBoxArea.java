package dxglide.apps.games.cmd.tetris.cmddisplay.screenEntities;

public class StatsBoxArea extends BoxArea {
	
	public StatsBoxArea() {
		super();
	}

	public StatsBoxArea(int xpos, int ypos, int sizeX, int sizeY) {
		super(xpos, ypos, sizeX, sizeY);
	}

	@Override
	public void update(char[][] screenmatrix) {
		super.update(screenmatrix); //drawsbox
		
	}

}
