package doParser;

import doParser.impl.ChainOfEntries;
import doParser.impl.PrimitiveFloat;
import doParser.interfaces.Entries;

/**
 * Created by GEO on 10.10.15.
 */
public class Main {
    public static void main(String [] args){

//        ParserCSVFiles parserCSV=new ParserCSVFiles();
//        parserCSV.doParse("/Users/GEO/Documents/JavaExec/RemVirtProxy/src/main/java/doParser/sources/orders.csv");


        Entries entries=new PrimitiveFloat();
        entries.accept(new ChainOfEntries());

//        Entries entries=new CollectEntries();
//        entries.accept(new ChainOfEntries());
    }
}
