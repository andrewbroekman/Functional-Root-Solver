package com.andrewbroekman.cos301.rootSolver;

/**
 * Functional Interface providing the idea of a root solver, given a function, some domain and accuracy.
 *
 * @author Andrew Broekman
 * @since 02 June 2016
 * @version 1.0
 */
@FunctionalInterface
public interface RootSolver {

    /**
     * Solve for a root of the function f, over the specified domain for a predetermined accuracy
     * @param f A function for which we want to obtain a root. {@link Function}
     * @param start The start boundary of the domain.
     * @param end The end boundary of the domain.
     * @param eps Specified accuracy..
     * @return Returns the root for the function f
     */
    double solve(Function f, double start, double end, double eps);
}
