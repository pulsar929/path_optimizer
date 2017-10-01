package com.casebank.example;

/**
 * Defines the physical characteristics of the game world.
 */
public interface WorldGeometry {
	/** Width of the game map */
	public int getXMAX();

	/** Height of the game map */
	public int getYMAX();

	/** Terrain elevation at a point */
	public int getElevation(int x, int y);
	/** other methods irrelevant to this assignment follow... */
}