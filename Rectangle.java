/**
 * Created by dima- on 08.02.2016.
 */
public class Rectangle {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rectangle( int x1 , int y1 , int x2 , int y2 )
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void setX1( int x )
    {
        this.x1 = x;
    };

    public int getX1()
    {
        return this.x1;
    };

    public void setY1( int y )
    {
        this.y1 = y;
    };

    public int getY1()
    {
        return this.y1;
    };

    public void setX2( int x )
    {
        this.x2 = x;
    };

    public int getX2()
    {
        return this.x2;
    };

    public void setY2( int y )
    {
        this.y2 = y;
    };

    public int getY2()
    {
        return this.y2;
    };

    
}
