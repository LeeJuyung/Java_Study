/**
 * 
 */
package org.java_SummerStudy;

/**
 * @author jylpi
 *
 */
public interface PlayingCard {
	public static final int SPADE = 4;
	final int DIAMOND = 3; 
	static int HEART = 2;
	int CLOVER = 1; //public static final
	
	public abstract String getCardNumber();
	String getCardKind();//public abstract
}
