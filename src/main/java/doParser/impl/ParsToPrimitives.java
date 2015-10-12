package doParser.impl;

import doParser.interfaces.Entries;
import doParser.interfaces.PartStringPrimitive;

import java.util.List;

/**
 * Created by GEO on 10.10.15.
 */
public class ParsToPrimitives implements Entries{


    List<List<Entries>> listListEntries;

    public List<List<Entries>> returnParsedFile(List<List<String>> llS){


        for(int numberRow=0; numberRow<llS.size();numberRow++){

            for(int numberColumn=0; numberColumn<(llS.get(numberRow)).size();numberColumn++){

                if(Integer.parseInt(llS.get(numberRow).get(numberColumn))!=0){

                }
            }
        }

        return null;
    }

    @Override
    public void accept(PartStringPrimitive part) {
        //part.visit(listListEntries.get(0).get(0).toString());
    }
}
