/**
 *
 */
package com.www.designmode.behavior.mediator;

import com.www.designmode.behavior.mediator.interfaces.Mediator;

/**
 * @author www
 *
 */
public class MyMediator implements Mediator {

    private AbstractUser user1;
    private AbstractUser user2;

    public AbstractUser getUser1() {
        return user1;
    }

    public AbstractUser getUser2() {
        return user2;
    }

    @Override
    public void createMediator() {
        user1 = new User1(this);
        user2 = new User2(this);
    }

    @Override
    public void workAll() {
        user1.work();
        user2.work();
    }

}
