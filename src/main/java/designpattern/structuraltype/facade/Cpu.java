/**
 *
 */
package main.java.designpattern.structuraltype.facade;

/**
 * CPU
 * @author www
 *
 */
public class Cpu {
	/**
	 * CPU启动
	 */
	public void startup(){
		System.out.println("cpu startup!");
	}
	/**
	 * CPU关机
	 */
	public void shutdown(){
		System.out.println("cpu shutdown!");
	}
}