package dxglide.apps.games.cmd.tetris.cmddisplay.screenEntities;

import dxglide.apps.games.cmd.tetris.utils.MatrixCharArrayUtils;

public class StatsBoxArea extends BoxArea {
	
	private final char[] labelPoints= "POINTS:".toCharArray();
	private int statPoints = 0;
	private final char[] labelNext= "NEXT:".toCharArray();
	
	private final char[] labelTime= "TIME:".toCharArray();
	private long timePassed = 0;
	
	public StatsBoxArea() {
		super();
	}


	public StatsBoxArea(int xpos, int ypos, int sizeX, int sizeY, EnumEntities entity) {
		super(xpos, ypos, sizeX, sizeY, entity);
	}

	@Override
	public void update(char[][] screenmatrix) {
		super.update(screenmatrix); //drawsbox
		
		MatrixCharArrayUtils.updateXArrayInMatrix(screenmatrix, labelPoints, xpos + 2, ypos + 2);
		MatrixCharArrayUtils.updateXArrayInMatrix(screenmatrix, getPointsAsChars(), xpos + 2 + labelPoints.length + 1, ypos + 2);
		MatrixCharArrayUtils.updateXArrayInMatrix(screenmatrix, labelNext, xpos + 2, ypos + 10);
		// figures .... next
		
		
		
		MatrixCharArrayUtils.updateXArrayInMatrix(screenmatrix, labelTime, xpos + 2, ypos + 28);
		MatrixCharArrayUtils.updateXArrayInMatrix(screenmatrix, getTimeAsChars(), xpos + 2 + labelTime.length + 1, ypos + 28);
		
		
	}
	
	private char[] getPointsAsChars() {
		return Integer.toString(statPoints).toCharArray();
	}
	
	private char[] getTimeAsChars() {
		return Long.toString(timePassed).toCharArray();
	}

	public int getStatPoints() {
		return statPoints;
	}

	public void setStatPoints(int statPoints) {
		this.statPoints = statPoints;
	}


	public long getTimePassed() {
		return timePassed;
	}


	public void setTimePassed(long timePassed) {
		this.timePassed = timePassed;
	}

}
