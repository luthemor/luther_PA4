import java.io.*;
import java.util.*;
class DuplicateRemover
{
    public Set < String > uniqueWords = new HashSet <> ();
    void remove (String dataFile)
    {

        try (FileInputStream fileInputStream = new FileInputStream (dataFile);
             Scanner scanner = new Scanner (fileInputStream);
        )
        {

            while (scanner.hasNext ())
            {
                String nextWord = scanner.next ();
                uniqueWords.add (nextWord);
            }
        }
        catch (IOException e)
        {
            throw new RuntimeException (e);
        }

    }
    void write (String outputFile)
    {
        try (BufferedWriter bw = new BufferedWriter (new FileWriter (outputFile)))
        {
            bw.write (String.join (" ", uniqueWords));
        } catch (IOException e)
        {
            throw new RuntimeException (e);
        }
    }

}