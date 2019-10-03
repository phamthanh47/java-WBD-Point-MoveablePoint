package com.company;

import org.jcp.xml.dsig.internal.dom.DOMBase64Transform;

public class MoveablePoint extends Point {
    private double xSpeed;
    private double ySpeed;
    public MoveablePoint(){
    }
    public MoveablePoint(double x, double y,double xSpeed,double ySpeed)
    {
        super(x,y);
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(double xSpeed,double ySpeed)
    {
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public double[] getSpeed(){
        return new double[]{getX(),getY(),getxSpeed(),getySpeed()};
    }
    public String toString()
    {
        return "("+getSpeed()[0]+","+getSpeed()[1]+","+getSpeed()[2]+","+getSpeed()[3]+")";
    }
    public void move()
    {
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
    }
}
