import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 
 */

/**
 * @author 77
 *
 */
public class MedianTracker {
	  PriorityQueue<Double> smallPart;
	  PriorityQueue<Double> largePart;
	  
	  public MedianTracker() {
	    largePart = new PriorityQueue<Double>();
	    smallPart = new PriorityQueue<Double>(11, Collections.reverseOrder());
	  }
	  
	  //Read a new value
	  public void read(double value) {
	    if (smallPart.isEmpty() || value <= smallPart.peek()) {
	      smallPart.offer(value);
	    } else {
	      largePart.offer(value);
	    }
	    
	    if (smallPart.size() - largePart.size() >= 2) {
	      largePart.offer(smallPart.poll());
	    } else if (largePart.size() > smallPart.size()) {
	      smallPart.offer(largePart.poll());
	    }
	    
	  }
	  
	  public Double median() {
	    int size = this.size();
	    if (size == 0) {
	      return null;
	    } else if (size % 2 == 0) {
	      return (smallPart.peek() + largePart.peek())/2.0;
	    } else {
	      return (double)(smallPart.peek());
	    }
	  }
	  
	  private int size() {
	    return smallPart.size() + largePart.size();
	  }
	}