import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {
   private static final String REGEX = "(.*)(\\d+)(.*)?# 3 capturing groups";
   private static final String INPUT = "a1a        c1";

   public static void main(String[] args) {
      // create a pattern
      Pattern pattern = Pattern.compile(REGEX,Pattern.COMMENTS);
      // get a matcher object
      Matcher matcher = pattern.matcher(INPUT); 

      if(matcher.find()) {
         //get the MatchResult Object 
         MatchResult result = matcher.toMatchResult();

         //Prints the offset after the last character matched.
         System.out.println("First Capturing Group - Match String end(): "+result.end());         
      }
   }
}