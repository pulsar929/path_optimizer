package com.casebank.example;

/**
 * Interface satisfied by algorithms that can route armies from one castle to
 * another. Routes are constrained to a sequence of atomic steps, where each
 * step can go in one of the four compass directions.
 */
public interface RouteSelector {
	/**
	 * Ask this RouteSelector for its preferred route between two castles.
	 * 
	 * @param startX
	 *            starting X co-ordinate
	 * @param startY
	 *            starting Y co-ordinate
	 * @param endX
	 *            final X co-ordinate
	 * @param endY
	 *            final Y co-ordinate
	 * @return An array of strings, constrained to the values "N", "S", "E", "W"
	 *         indicating the path to follow from (startX, startY) to (endX,
	 *         endY)
	 */
	String[] getRoute(int startX, int startY, int endX, int endY);
}
