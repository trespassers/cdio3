package gr_34;

import gr_34.entity.Spillerliste;

public class Main {
	
    public static void main( String[] args ) {
    	Spillerliste l = new Spillerliste();
    	l.tilføjSpiller(2);
    	System.out.println(l.toString());
    }
}
