import java.util.*;
public class StringMatcher
{
	public boolean isTrue(String s)
	{
		return s.matches("true");
	}
	
	public boolean isTrue2(String s)
	{
		return s.matches("[Tt]rue");
	}
	
	// returns true if the string matches exactly "true" or "True"
    // or "yes" or "Yes"
	public boolean isTrue3(String s)
	{
		return s.matches("[Tt]rue|[Yy]es");
	}
	
	// returns true if the string contains exactly "true"
	public boolean isTrue4(String s)
	{
		return s.matches(".*true.*");
	}
	
	public boolean isTrue5(String s)
	{
		return s.matches("[a-zA-z]{3}");
	}
	
	// returns true if the string does not have a number at the beginning
    public boolean isNoNumberAtBeginning(String s){
        return s.matches("^[^\\d].*");
    }
	
    // zwraca true, jeœli ci¹g zawiera dowoln¹ liczbê znaków, z wyj¹tkiem b
    public boolean isIntersection(String s){
        return s.matches("([\\w&&[^b]])*");
    }
	
    // returns true if the string contains a number less than 300
    public boolean isLessThenThreeHundred(String s){
        return s.matches("[^0-9]*[12]?[0-9]{1,2}[^0-9]*");
    }
	
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		StringMatcher result = new StringMatcher();
		
		System.out.println(result.isTrue("true"));
		System.out.println(result.isTrue3("yes"));
		System.out.println(result.isTrue4("alatrue1"));
		System.out.println(result.isTrue5("faz"));
		System.out.println(result.isNoNumberAtBeginning("c5tc"));
		System.out.println(result.isIntersection("ff"));
		System.out.println(result.isLessThenThreeHundred("111"));
	}
}




  
