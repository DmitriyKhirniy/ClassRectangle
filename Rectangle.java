import java.awt.*;

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

    public boolean pointContain(int x , int y)
    {
        boolean contain = false;

         if( ( x1 <= x && x <= x2 ) && (y1 <= y && y <= y2 ) )    contain = true;

        return contain;
    };

    @Override
    public String toString()
    {
        return "( ("+this.x1+" , "+this.y1+" ) , ( "+this.x2+" , "+this.y2+") )";
    };

    public String move( int x , int y )
    {
        this.x1 +=x;
        this.y1+=y;
        this.x2+=x;
        this.y2+=x;
        return "Нова позиція:"+ "( ("+this.x1+" , "+this.y1+" ) , ( "+this.x2+" , "+this.y2+") )";
    };

    public Rectangle combineRectangles( Rectangle rect )
    {
        int x1,y1,x2,y2;

        x1 = Math.min( this.x1 , rect.getX1() );
        y1 = Math.min( this.y1 , rect.getY1() );
        x2 = Math.max( this.x2 , rect.getX2() );
        y2 = Math.max( this.y2 , rect.getY2() );
        return new Rectangle(x1,y1,x2,y2);
    };

    public Rectangle intersectionOfREctangles( Rectangle rect )
    {
        int x1,y1,x2,y2;

        x1 = Math.max( this.x1 , rect.getX1() );
        y1 = Math.max( this.y1 , rect.getY1() );
        x2 = Math.min( this.x2 , rect.getX2() );
        y2 = Math.min( this.y2 , rect.getY2() );

        if( (x1>x2) || (y1>y2) ) return new Rectangle(0,0,0,0);
        return new Rectangle(x1,y1,x2,y2);
    };

}
