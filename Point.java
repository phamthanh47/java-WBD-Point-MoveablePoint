package com.company;

public class Point {
    private double x;
    private double y;
    public Point()
    {
    }
    public Point(double x,double y)
    {
        setXY(x,y);
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double[] getXY()
    {
        return new double[]{x,y};
    }
    public String toString(){
        return "("+getXY()[0]+","+getXY()[1]+")";
    }
}
