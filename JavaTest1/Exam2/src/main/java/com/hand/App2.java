package com.hand;

/**
 * Hello world!
 *
 */
public class App2
{
    public static void main( String[] args )
    {
        Calmoney calmoney=Calmoney.getInstance();
        float UserA=5000;
        float UserB=10000;
        float UserC=15000;
        float UserD=60000;
        System.out.println( "UserA:"+calmoney.getMoney(UserA) );
        System.out.println( "UserB:"+calmoney.getMoney(UserB) );
        System.out.println( "UserC:"+calmoney.getMoney(UserC) );
        System.out.println( "UserD:"+calmoney.getMoney(UserD) );
    }
}
