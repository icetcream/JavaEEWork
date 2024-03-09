package cn.zust.edu.cn;

public class Circle implements IShape{
    Point ptCenter;
    int radius;

    Circle(Point center,int r){
        ptCenter = center;
        radius = r;
    }
    @Override
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public double area(){
        return Math.PI*radius*radius;
    }
    @Override
    public void draw(){
        System.out.println("画一个圆形");
        System.out.println(perimeter());
        System.out.println(area());
    }
}
