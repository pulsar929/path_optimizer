package com.github.pulsar929.pathOptimization;

import com.casebank.example.WorldGeometry;

public class FlatSquare implements WorldGeometry {

	private int side;

	public FlatSquare(int side) {
		this.side = side;
	}

	public int getXMAX() {
		return side;
	}

	public int getYMAX() {
		return side;
	}

	public int getElevation(int x, int y) {
		return 0;
	}

}
