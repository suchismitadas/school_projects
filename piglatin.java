public class piglatin
{
    private static final BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter sentence: ");
        String english = getString();
        String latin = pigLatin(english);
        System.out.println(latin);
    }
    private static String pigLatin(String s)
    {
    String latin = "";
    int i = 0;
    while (i<s.length())
    {
        while (i<s.length() && !isLetter(s.charAt(i))) // Take care of punctuation and spaces
        {
        latin = latin + s.charAt(i);
        i++;
        }
        if (i>=s.length()) // If there aren't any words left, stop.
        {
            break;
        }
        int begin = i;
        while (i<s.length() && isLetter(s.charAt(i))) // Otherwise we're at the beginning of a word.
        {
        i++;
        }
        int end = i;
        latin = latin + pigWord(s.substring(begin, end));// Now we're at the end of a word, so translate it.
    }
    return latin;
    }
    private static boolean isLetter(char c)
    {
        return ( (c >='A' && c <='Z') || (c >='a' && c <='z') );
    }
    private static String pigWord(String word)
    {
    int split = firstVowel(word);
    return word.substring(split)+word.substring(0, split)+"ay";
    }
    private static int firstVowel(String word)
    {
        word = word.toLowerCase();
        for (int i=0; i<word.length(); i++)
        {
            if (word.charAt(i)=='a' || word.charAt(i)=='e' ||word.charAt(i)=='i' || word.charAt(i)=='o' ||word.charAt(i)=='u')
            {
                return i;
            }
        }
        return 0;
    }
    private static String getString() throws IOException
    {
        return buf.readLine();
    }
}