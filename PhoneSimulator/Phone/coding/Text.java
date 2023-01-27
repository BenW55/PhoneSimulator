public class Text 
{
    private String oS;
    private double pSS;
    private double pMemory;
    private String pColor;
    
    
    public Text(String OS, double sS, double memory, String colorPhone)
    {
        oS = OS;
        pSS = sS;
        pMemory = memory;
        pColor = colorPhone;
    }
    public Text(String OS) 
    {
    	oS = OS;
    	pSS = 9.8;
    	pMemory = 16;
    	pColor = "black";
    }
    public Text() 
    {
    	oS = "Android";
    	pSS = 9.8;
    	pMemory = 16;
    	pColor = "matt black";
    }
    public Text(double sS) 
    {
    	oS = "Android";
    	pSS = sS;
    	pMemory = 16;
    	pColor = "matt black";
    }
    
    public void osChange(String os)
    {
        oS = os;
    }
    public void ssChange(double size)
    {
        pSS = size;
    }
    public void memChange(double mem)
    {
        pMemory = mem;
    }
    public void colChange(String col)
    {
        pColor = col;
    }
    public void osSSChange(String os, double size)
    {
        oS = os;
        pSS = size;
    }
    
    public String toString()
    {
        return "Your operating system is " + oS + " Your screen size is " + pSS + " inches\n" + "You have " + pMemory + " gigs of memory " + " Your color is " + pColor;
    }
}