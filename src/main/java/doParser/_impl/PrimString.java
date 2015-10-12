package doParser._impl;

import doParser._interfaces.Element;
import doParser._interfaces.Visitor;

/**
 * Created by GEO on 11.10.15.
 */
public class PrimString implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
