package com.company;

public class Main {

    public static void main(String[] args) {
	MoveablePoint point=new MoveablePoint(1,2,3,4);
        System.out.println(point);
        point.move();
        System.out.println(point);
        point.setSpeed(5,6);
        System.out.println("xSpeed= "+ point.getSpeed()[2]+" ySpeed= "+point.getSpeed()[3]);
        point.move();
        System.out.println(point);
    }
}
