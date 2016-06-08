package com.andrewbroekman.cos301.rootSolver;

/**
 * Class that implements a Bisection root solver against the {@link RootSolver} interface
 *
 * @author Andrew Broekman
 * @since 02 June 2016
 * @version 1.0
 */
public class BisectionRootSolver implements RootSolver {


    @Override
    public double solve(Function f, double start, double end, double eps) {

        if (Math.abs(f.value(start)) < eps)
            return start;

        if (Math.abs(f.value(end)) < eps)
            return end;

        double avg = (start + end) / 2.0;

        if (Math.signum(f.value(start)) + Math.signum(f.value(avg)) == 0)
            return solve(f, start, avg, eps);
        else
            return solve(f, avg, end, eps);
    }
}
