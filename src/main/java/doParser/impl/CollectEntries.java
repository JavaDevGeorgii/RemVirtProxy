package doParser.impl;

import doParser.interfaces.Entries;
import doParser.interfaces.PartStringPrimitive;

/**
 * Created by GEO on 10.10.15.
 */
public class CollectEntries implements Entries {


    Entries[] entries;

    public CollectEntries() {

        entries=new Entries[]{new PrimitiveString(),new PrimitiveString(), new PrimitiveFloat(),new PrimitiveDate()};
    }

    @Override
    public void accept(PartStringPrimitive part) {

        for (Entries e:entries){
            e.accept(part);
        }
        part.visit(this);
    }
}
