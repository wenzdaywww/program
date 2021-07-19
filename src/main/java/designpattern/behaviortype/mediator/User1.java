/**
 *
 */
package main.java.designpattern.behaviortype.mediator;

import main.java.designpattern.behaviortype.mediator.interfaces.Mediator;


/**
 * @author www
 *
 */
public class User1 extends AbstractUser {

	public User1(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("user1 exe!");
	}

}