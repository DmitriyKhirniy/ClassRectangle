/**
 * Created by dima- on 08.02.2016.
 */
public class Tester {

    private static int minX = 0;
    private static int minY = 0;
    private static int maxX = 1000;
    private static int maxY = 1000;

    private static int width;
    private static int height;

    public static void Test()
    {
        int posX1 = getRandom( minX , maxY );
        int posY1 = getRandom( minY , maxY );
        int posX2 = getRandom( posX1 , maxX );
        int posY2 = getRandom( posY1 , maxY );

        width = posX2 - posX1;
        height = posX2 - posY2;

        Rectangle rect = new Rectangle(posX1,posY1,posX2,posY2);
        show("Позиція створеного прямокутника",rect.toString() );

        int pointX = getRandom( minX , maxX);
        int pointY = getRandom( minY , maxY );
        show("Чи належить точка ("+pointX+","+pointY+") прямокутнику - " , getContain(rect, pointX,pointY) );

        int movingX = getRandom(minX , maxX-posX2);
        int movingY = getRandom( minY , maxY - posY2 );
        show("Перемістити на: "+movingX+" вбік, на:"+movingY+" вгору.", rect.move( movingX, movingY ) );

        int nposX1 = getRandom( minX , maxY );
        int nposY1 = getRandom( minY , maxY );
        int nposX2 = getRandom( nposX1 , maxX );
        int nposY2 = getRandom( nposY1 , maxY );
        Rectangle nRect = new Rectangle(nposX1,nposY1,nposX2,nposY2);
        show("Прямокутник:"+rect.toString()+" об'єднати з прямокутником "+nRect.toString()+".В результатіотримаємо прямокутник:" ,rect.combineRectangles( nRect ).toString()  );

        show("Прямокутник , що занходится на перетині прямокутника:"+nRect.toString()+" та:"+rect.toString(), rect.intersectionOfREctangles( nRect ).toString());
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");

    };

    private static void show(String message, String text)
    {
        System.out.println( message +" "+text );
    };

    private static String getContain( Rectangle rect , int pointX, int pointY )
    {
        if( rect.pointContain( pointX, pointY ) ) return "так";
        else return "ні";
    };

    private static int getRandom( int min ,int max )
    {
        return min + (int)(Math.random() * ((max - min) + 1));
    };
}
