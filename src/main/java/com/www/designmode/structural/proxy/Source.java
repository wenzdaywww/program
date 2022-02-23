/**
 *
 */
package com.www.designmode.structural.proxy;

import com.www.designmode.structural.proxy.interfaces.Sourceable;


/**
 * 被代理的类
 * @author www
 *
 */
public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("这是被代理的类");
	}

}