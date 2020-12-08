package com.epam.jwd.app;

import com.epam.jwd.exception.FigureException;
import com.epam.jwd.factory.FigureFactory;
import com.epam.jwd.model.*;
import com.epam.jwd.model.ApplicationContext;
import com.epam.jwd.model.Figure;
import com.epam.jwd.model.FigureApplicationContext;
import com.epam.jwd.model.Point;


public class Main {
    public static void main(String[] args) {
        Point[] points = new Point[3];
        points[0] = new Point(1, 2);
        points[1] = new Point(3, 4);
        points[2] = new Point(1, 2);
        ApplicationContext context = FigureApplicationContext.getFigureApplicationContext();
        FigureFactory factory = context.createFigureFactory();
        try {
            Figure triangle = factory.createFigure(FigureType.Triangle, points);
            System.out.println(triangle);
        } catch (FigureException e) {
            System.out.println(e.getMessage());
        }
    }
}