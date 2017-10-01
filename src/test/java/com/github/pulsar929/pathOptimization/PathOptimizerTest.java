package com.github.pulsar929.pathOptimization;

import java.util.Arrays;

import org.junit.Test;

import com.casebank.example.WorldGeometry;

public class PathOptimizerTest {

	@Test
	public void testGetRoute() {
		WorldGeometry geo = new FlatSquare(5);

		PathOptimizer po = new PathOptimizer(geo);
		String[] actualRoute = po.getRoute(0, 0, 4, 4);
		System.out.println("actualRoute = " + Arrays.toString(actualRoute));

		actualRoute = po.getRoute(0, 0, 1, 1);
		System.out.println("actualRoute = " + Arrays.toString(actualRoute));

	}

}
