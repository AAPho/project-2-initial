package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2.
 *
 * Modify the driver as needed to demonstrate your classes.
 *
 */
public class Project2 extends Shape{

    public static void main(String[] args) {

        /*
        The following code works with the example design given.
         */

        ThreeDimensionalShape sphere = new Sphere(2.0);
        ThreeDimensionalShape cube = new Cube(5.0);
        ThreeDimensionalShape cylinder = new Cylinder(4.0, 1.0);
        ThreeDimensionalShape pyramid = new Pyramid(3.0, 2.0, 5.0);

        // We'll cover this stuff in module 4
        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);
        shapes.add(pyramid);

        shapes.forEach(System.out::println);

        /*
        The following code works with the code given.
         */

        //Sphere sphere = new Sphere(2.0);
        //System.out.println(sphere);

        //Cylinder cylinder = new Cylinder(4.0, 1.0);
        //System.out.println(cylinder);

        //Cube cube = new Cube(5.0);
        //System.out.println(cube);
    }

}

