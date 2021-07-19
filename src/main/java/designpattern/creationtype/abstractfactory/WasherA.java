/**
 *
 */
package main.java.designpattern.creationtype.abstractfactory;

import main.java.designpattern.creationtype.abstractfactory.interfaces.Washer;

/**
 * A型洗衣机
 * @author www
 *
 */
public class WasherA implements Washer {

	public WasherA(){
		System.out.println("洗衣机-A被制造了");
	}
}