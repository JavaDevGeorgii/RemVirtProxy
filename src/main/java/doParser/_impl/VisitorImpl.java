package doParser._impl;

import doParser._interfaces.Visitor;

/**
 * Created by GEO on 11.10.15.
 */
public class VisitorImpl implements Visitor {

    @Override
    public void visit(PrimFloat primFloat) {
        System.out.println(" Float ");
        //return float;
    }

    @Override
    public void visit(PrimInt primInt) {

        System.out.println(" Int ");
    }

    @Override
    public void visit(PrimString primString) {

        System.out.println(" String ");
    }

    @Override
    public void visit(PrimDate primDate) {

        System.out.println(" Date ");
    }
}
