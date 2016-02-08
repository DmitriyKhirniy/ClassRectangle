/**
 * Created by dima- on 07.02.2016.
 */
public class MainApi {
    public static void main( String[] args )
    {
      Rectangle rect = new Rectangle(10,10,100,100);
       System.out.println( rect.pointContain( 50,50 ) );
       System.out.println( rect.toString());
       System.out.println( rect.move( 50,50 )) ;
        System.out.println( rect.intersectionOfREctangles( new Rectangle( 110,110,120,120 ) ).toString()) ;
    };
}
