package cn.zust.edu.cn;
/**
 * 
 * @author czg
 * @since 2023/3/7 10:50
 */
public class Point {
    int x;
    int y;
    Point(){};
    Point(int x,int y){
        this.x = x;
        this.y = y;
    };
    Point(Point p){
        this.x = p.x;
        this.y = p.y;
    };

}
