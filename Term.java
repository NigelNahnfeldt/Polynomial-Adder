
/**
 * Creates an object to represent a term within a polynomial.
 *
 * @author Nigel Nahnfeldt
 * @version 1.0
 */
public class Term
{
    private float coefficient;
    private int exponent;
    
    
    public Term()
    {
        coefficient = 0.0f;
        exponent = 0;
    }
    
    public Term(float coefficient, int exponent)
    {
        this.coefficient = coefficient;
        this.exponent = exponent;
    }
    
    public int getExponent()
    {
        return exponent;
    }
    
    public float getCoefficient()
    {
        return coefficient;
    }
    
    public void setExponent(int exponent)
    {
        this.exponent = exponent;
    }
    
    public void setCoefficient(float coefficient)
    {
        this.coefficient = coefficient;
    }
    
    public String toString()
    {
        String term = coefficient + "x" + "^" + exponent;
        return term;
    }
}
