package doParser._interfaces;

import doParser._impl.*;

/**
 * Created by GEO on 11.10.15.
 */
public interface Visitor {

    void visit(PrimFloat primFloat);
    void visit(PrimInt primInt);
    void visit(PrimString primString);
    void visit(PrimDate primDate);
}
