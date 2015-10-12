package doParser.impl;

//import com.opencsv.CSVReader;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Created by GEO on 10.10.15.
 */
public class ParserCSVFiles {

    List<List<String>> listStringEntries=new ArrayList<List<String>>();
    CSVReader reader;
    char delimiter=';';

    public List<List<String>> doParse(String file){

        String[] nextStringLine;
        try{
            reader=new CSVReader(new FileReader(file), delimiter);

            while ( (nextStringLine=reader.readNext() )!=null){
                listStringEntries.add(Arrays.asList(nextStringLine));
            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listStringEntries;
    }
}
