package dxglide.apps.games.cmd.tetris.cmddisplay.screenEntities;

public class BoxArea extends ScreenEntity {
	
	public BoxArea() {
	}

	public BoxArea(int xpos, int ypos, int sizeX, int sizeY) {
		super(xpos, ypos, sizeX, sizeY);
	}



	@Override
	public void setup(char[][] screenmatrix) {
	}

	@Override
	public void update(char[][] screenmatrix) {
		
		for (int y = ypos; y < ypos + sizeY; y++) {
			for (int x = xpos; x < xpos + sizeX; x++) {
				screenmatrix[x][y] = (char) ' '; // filling with somthinf //TODO: add
			}
		}

		// MAIN BOX
		// set conners

		screenmatrix[xpos][ypos] = (char) 0x2554; // upper left
		screenmatrix[xpos + sizeX - 1][ypos] = (char) 0x2557; // upper right
		screenmatrix[xpos][ypos + sizeY - 1] = (char) 0x255A; // low left
		screenmatrix[xpos + sizeX - 1][ypos + sizeY - 1] = (char) 0x255D; // low right

		// lines x axis
		for (int i = xpos + 1; i < xpos + sizeX - 1; i++) {
			screenmatrix[i][ypos] = (char) 0x2550; // upper left
			screenmatrix[i][ypos + sizeY - 1] = (char) 0x2550; // upper left
		}

		// lines y axis
		for (int i = ypos + 1; i < ypos + sizeY - 1; i++) {
			screenmatrix[xpos][i] = (char) 0x2551; // horizontal bar
			screenmatrix[xpos + sizeX - 1][i] = (char) 0x2551; // vertical bar
		}
		
	}
	
	
	@Override
	public void draw(char[][] screenmatrix) {


	}


}
