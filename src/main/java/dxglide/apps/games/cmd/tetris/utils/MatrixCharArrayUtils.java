package dxglide.apps.games.cmd.tetris.utils;

public class MatrixCharArrayUtils {

	public static void updateXArrayInMatrix(char[][] screenmatrix, char[] addArray, int startXPos, int startYPos) {
		if (screenmatrix != null && addArray != null) {
			int ti = 0;
			for (int i = startXPos; i < startXPos + addArray.length; i++) {
				screenmatrix[i][startYPos] = addArray[ti];
				ti++;
			}
		}

	}

}
