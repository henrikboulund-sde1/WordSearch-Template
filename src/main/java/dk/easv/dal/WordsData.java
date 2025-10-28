package dk.easv.dal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordsData
{
    private List<String> Words;
    private final String WordsPath = "/Users/henrikboulund/Documents/WordSearch/brit-a-z.txt";

    public WordsData()
    {
        Words = new ArrayList<>();
    }

    public List<String> getWords()
    {
        if(Words.isEmpty())
        {
            try (BufferedReader br = new BufferedReader(new FileReader(WordsPath)))
            {
                String line;
                while ((line = br.readLine()) != null)
                {
                    Words.add(line);
                }
                return Words;
            } catch (IOException e)
            {
                return null;
            }
        }
        else
        {
            return Words;
        }
    }
}
