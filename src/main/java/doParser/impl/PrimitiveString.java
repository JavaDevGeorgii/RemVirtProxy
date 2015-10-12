package doParser.impl;

import doParser.interfaces.Entries;
import doParser.interfaces.PartStringPrimitive;

/**
 * Created by GEO on 10.10.15.
 */
public class PrimitiveString implements Entries{

    @Override
    public void accept(PartStringPrimitive part) {
        part.visit(this);
    }
}
