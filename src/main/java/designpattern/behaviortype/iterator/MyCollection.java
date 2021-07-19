/**
 *
 */
package main.java.designpattern.behaviortype.iterator;

import main.java.designpattern.behaviortype.iterator.interfaces.Collection;
import main.java.designpattern.behaviortype.iterator.interfaces.Iterator;

/**
 * @author www
 *
 */
public class MyCollection implements Collection {

	   public String []string = {"A","B","C","D","E"};
	    @Override
	    public Iterator iterator() {
	        return new MyIterator(this);
	    }

	    @Override
	    public Object get(int i) {
	        return string[i];
	    }

	    @Override
	    public int size() {
	        return string.length;
	    }
}