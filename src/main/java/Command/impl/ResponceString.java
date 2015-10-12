package Command.impl;

import Command.inerfaces.Handler;

/**
 * Created by GEO on 12.10.15.
 */
public class ResponceString extends Handler {

    @Override
    public void stringRequest(String string) {

        if(!string.isEmpty()){
            System.out.println("String = string: "+string);
            //return string;
        }else {
            System.out.println(" Unhendled string! ");
            //getSuccessor().stringRequest(string);
        }
    }
}
