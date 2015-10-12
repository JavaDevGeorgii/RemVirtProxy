package doParser.interfaces;

import doParser.impl.*;

/**
 * Created by GEO on 10.10.15.
 */
public interface PartStringPrimitive {

    public void visit(PrimitiveFloat primFloat);
    public void visit(PrimitiveInt primInt);
    public void visit(PrimitiveDate primDate);
    public void visit(PrimitiveString primitiveString);
    public void visit(CollectEntries entries);
}
