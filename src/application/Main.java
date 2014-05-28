/**
 * tag V0.0 le 17/02/2012
 * V0.1 passage des fenetres visuel en compatible netBeans
 * version en cours V1.2
 */
package application;

import visuel.FenPrinc;

/**
 * @author Guillet
 *
 */
public class Main{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// MAIN Main principale
		FenPrinc maFen = new FenPrinc();
		maFen.pack();
		maFen.setVisible(true);


	}

}
