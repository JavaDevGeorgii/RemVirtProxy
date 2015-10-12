package doParser.impl;

import doParser.interfaces.PartStringPrimitive;

/**
 * Created by GEO on 10.10.15.
 */
public class ChainOfEntries implements PartStringPrimitive {

    @Override
    public void visit(PrimitiveFloat primFloat) {
        System.out.println("PrimitiveFloat");
    }

    @Override
    public void visit(PrimitiveInt primInt) {

        System.out.println("PrimitiveInt");
    }

    @Override
    public void visit(PrimitiveDate primDate) {

        System.out.println("PrimitiveDate");
    }

    @Override
    public void visit(PrimitiveString primitiveString) {

        System.out.println("PrimitiveString");
    }

    @Override
    public void visit(CollectEntries entries) {

    }
}
