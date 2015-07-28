package com.thoughtworks.tw101.exercises.exercise5;

// Exercise #5: Create an array of 5 Rectangles (each with height and width instance variables and an area() method).
// Find the average area of the rectangles.

public class Main {
    public static void main(String[] args) {

        Rectangle[] rectangles = {
                new Rectangle(2, 3),
                new Rectangle(3, 4),
                new Rectangle(4, 5),
                new Rectangle(5, 6),
                new Rectangle(6, 7)
        };

        //Rectangle[] rectangles2 = {};

        float average = new RectangleAverager().averageArea(rectangles);
        //float average2 = new RectangleAverager().averageArea(rectangles2);

        System.out.println(average);
        //System.out.println(average2);
    }

}
