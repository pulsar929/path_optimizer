package com.github.pulsar929.pathOptimization;

import com.casebank.example.RouteSelector;
import com.casebank.example.WorldGeometry;

public class PathOptimizer implements RouteSelector {
	private WorldGeometry geo;

	public PathOptimizer(WorldGeometry geo) {
		this.geo = geo;
	}

	public String[] getRoute(int startX, int startY, int endX, int endY) {
		if (startX == endX && startY == endY) {
			// No move
			return new String[0];
		}

		String[] route = new String[endX - startX + endY - startY];
		int r = 0;
		int totalCost = 0;
		for (int i = startX; i < endX; i++) {
			route[r++] = "E";
			totalCost += 5;
		}
		for (int i = startY; i < endY; i++) {
			route[r++] = "S";
			totalCost += 5;
		}
		System.out.println("Total cost = " + totalCost);
		return route;
	}

}
