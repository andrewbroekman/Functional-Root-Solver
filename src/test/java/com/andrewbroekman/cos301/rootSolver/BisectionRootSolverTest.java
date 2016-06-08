package com.andrewbroekman.cos301.rootSolver;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for bisection root solver class.
 *
 * @author Andrew Broekman
 * @since 02 June 2016
 * @version 1.0
 * @see BisectionRootSolver
 */
public class BisectionRootSolverTest {

    @Test
    public void questionA() {

        double root = new BisectionRootSolver().solve(x -> 2*x - 1, 0, 3, 1e-8);
        assertEquals(0.5, root, 1e-8);
    }

    @Test
    public void questionB() {

        double root = new BisectionRootSolver().solve(x -> x*x + 2*x - 3, -4, -1, 1e-6);
        assertEquals(-3, root, 1e-6);
    }
}
