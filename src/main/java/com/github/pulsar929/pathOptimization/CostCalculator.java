package com.github.pulsar929.pathOptimization;

import com.casebank.example.WorldGeometry;

public class CostCalculator {
	public static int getCost(int newElevation, int oldElevation) {
		int delta = newElevation - oldElevation;
		if (delta < -5) {
			return -1 * delta;
		} else if (delta < 0) {
			return 5 + delta;
		} else if (delta == 0) {
			return 5;
		} else if (delta <= 5) {
			return 5 + delta;
		} else {
			return 5 + 2 * delta;
		}
	}

	public static int getCost(WorldGeometry geo, int newX, int newY, int oldX, int oldY) {
		if (newX == oldX && Math.abs(newY - oldY) == 1 || newY == oldY && Math.abs(newX - oldX) == 1) {
			return getCost(geo.getElevation(newX, newY), geo.getElevation(oldX, oldY));
		}
		throw new IllegalArgumentException("Must be adjacent points.");
	}
}
