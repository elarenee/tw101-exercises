package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        float average = 0f;
        int rectangleCount = 0;
        for (Rectangle r: rectangles) {
            average += r.area();
            rectangleCount++;
        }
        if(rectangleCount > 0)
            return average/rectangleCount;
        else
            return 0;
    }
}
