
public class Application
{
    public static void main (String[]args)
    {
        DuplicateRemover d = new DuplicateRemover ();

        d.remove ("problem1.txt");

        d.write ("unique_words.txt");
    }
}

