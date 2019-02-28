/**
 * Implement a polynomial using a linked list with terms stored in it.
 *
 * @author Nigel Nahnfeldt
 * @version 1.0
 */

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class Polynomial

{
    private LinkedList <Term> poly;
    
    public Polynomial()
    {
        poly = new LinkedList <Term>();
    }
    
    public void addTerm(Term newTerm)
    {
        if(poly.isEmpty()){
            poly.add(newTerm);
        }else{
        	ListIterator <Term> polyIterator = poly.listIterator();
            int addPosition = 0;
            while(polyIterator.hasNext()){
                Term current = polyIterator.next();
                if(current.getExponent() > newTerm.getExponent()){
                    addPosition += 1;
                }else{
                    break;
                }
            }
            poly.add(addPosition, newTerm);
        }
    }
    
    public String toString()
    {
       String result = new String();
       ListIterator <Term> polyIterator = poly.listIterator();
        
        while(polyIterator.hasNext()){
            result += polyIterator.next();
            if(polyIterator.hasNext()){
               result += " + "; 
            }
       }
       return result;
    }
    
    public Polynomial add(Polynomial toAdd)
    {
       Polynomial result = new Polynomial();
       ListIterator <Term> polyIterator = poly.listIterator();
       
       
          //Two list iterators, if the exponents are the same then add the term together in poly 3 and then display, if they are not equal
    	  //Then add the greater Iterator and advance the iterator.
       
       return result;
    }
}
