[![Build Status](https://travis-ci.org/andrewbroekman/Functional-Root-Solver.svg?branch=master)](https://travis-ci.org/andrewbroekman/Functional-Root-Solver)
# Functional Programming Exercises #

This repository shows an implementation of a functional root solver in Java 8. This was done as part of additional exam
preparation at the University of Pretoria to a question posed in Functional Programming in Java by Dr. Fritz Solms
published 24 August 2015 in the COS301: Software Engineering module.

The associated document is available [here](http://www.cs.up.ac.za/files/COS301/Download/455/) or the Department of
Computer Science at the University of Pretoria's website, https://www.cs.up.ac.za.

[Contact information](http://www.cs.up.ac.za/users/view/fsolms) for Dr. Fritz Solms

## Question ##
The root of a function is the value of x for which f(x) = 0. In this project you should
develop an infrastructure for 1-dimensional root solvers and an implementation of a concrete
root solver which uses the bisection method for finding a root for a function. The method
receives a range over which f changes sign (containing an odd number of roots) and the
required accuracy, eps as inputs. The interval is halved, and the sub-interval over which
the f changes sign is selected as new interval. This is repeated until the function value at
either of the boundaries is less than the required accuracy, eps. In particular
  * Write a functional interface for a 1-dimensional function.
  * Write a functional interface for a RootSolver which receives a function, an interval over
which the function changes sign and the required accuracy, eps, as inputs.
  * Write an implementation of RootSolver which uses the bisection method to solve for
the root of a given function.
  * Write a unit test which uses lambda expressions for functions and verifies that the
BiSectionRootSolver correctly calculates the roots of those functions. Use
    *  f(x) = 2x − 1 , range = [0, 3] , solution: x = 1
211
    *  f(x) = x^2 + 2x − 3 , range = [−4, −1] , solution: x = −3