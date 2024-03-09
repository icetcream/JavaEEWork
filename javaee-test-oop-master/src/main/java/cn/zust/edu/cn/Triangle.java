package cn.zust.edu.cn;

public class Triangle implements IShape{
    Point ptA;
    Point ptB;
    Point ptC;
    private double edgeA ;
    private double edgeB ;
    private double edgeC ;
    public Triangle(Point ptA,Point ptB,Point ptC){
        this.ptA = ptA;
        this.ptB = ptB;
        this.ptC = ptC;
        edgeA = Math.sqrt((ptB.x-ptA.x)*(ptB.x-ptA.x)+(ptB.y-ptA.y)*(ptB.y-ptA.y));
        edgeB = Math.sqrt((ptC.x-ptB.x)*(ptC.x-ptB.x)+(ptC.y-ptB.y)*(ptC.y-ptB.y));
        edgeC = Math.sqrt((ptC.x-ptA.x)*(ptC.x-ptA.x)+(ptC.y-ptA.y)*(ptC.y-ptA.y));
    }
    @Override
    public double perimeter(){
        return edgeA+edgeB+edgeC;
    }
    @Override
    public double area(){
        double p = perimeter()/2;
        return Math.sqrt(p*(p-edgeA)*(p-edgeB)*(p-edgeC));
    }
    @Override
    public void draw() {
        System.out.println("画一个三角形");
        System.out.println(area());
        System.out.println(perimeter());
    }

    public double getEdgeA() {
        return edgeA;
    }

    public double getEdgeB() {
        return edgeB;
    }

    public double getEdgeC() {
        return edgeC;
    }
}
