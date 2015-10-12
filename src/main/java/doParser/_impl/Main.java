package doParser._impl;

import doParser._interfaces.Element;
import doParser._interfaces.Visitor;

/**
 * Created by GEO on 11.10.15.
 */
public class Main {

    public static void main(String[] arg){

        Element[] elements=new Element[]{new PrimDate(),new PrimFloat(), new PrimInt(), new PrimString()};

        Visitor v=new VisitorImpl();
        for (Element element:elements){
            element.accept(v);
        }

    }
}
