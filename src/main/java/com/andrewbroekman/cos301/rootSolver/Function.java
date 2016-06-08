package com.andrewbroekman.cos301.rootSolver;

/**
 * Functional Interface providing the idea of a mathematical function, specifically, a mapping, f: X -> Y, X,Y in R.
 *
 * @author Andrew Broekman
 * @since 02 June 2016
 * @version 1.0
 */
@FunctionalInterface
public interface Function {

    /**
     * Evaluate the function value of function at specified input.
     * @param x Value at which to determine function value.
     * @return Returns function value.
     */
    double value(double x);
}
