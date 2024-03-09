package cn.zust.edu.cn;
/**
 * 
 * @author czg
 * @since 2023/3/7 10:50
 */
public class Rectangle implements IShape{
    Point ptTopLeft;
    Point ptTopRight;
    int width;
    int height;

    public Rectangle() {
    }

    Rectangle(Point Topleft,int height,int width){
        this.width = width;
        this.height = height;
        ptTopLeft = Topleft;
        ptTopRight = new Point(ptTopLeft.x+width,ptTopLeft.y);
    }
    @Override
    public double perimeter(){
        return 2*(width+height);
    }
    @Override
    public void draw(){
        System.out.println("画一个长方形");
        System.out.println(perimeter());
        System.out.println(area());
    }
    @Override
    public double area(){
        return width*height;
    }

}

