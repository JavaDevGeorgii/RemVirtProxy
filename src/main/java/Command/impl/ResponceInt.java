package Command.impl;

import Command.inerfaces.Handler;

/**
 * Created by GEO on 12.10.15.
 */
public class ResponceInt extends Handler {

    @Override
    public void stringRequest(String string) {

        Integer integer=null;
        try {

            integer = Integer.parseInt(string);

        } catch (NumberFormatException e) {
            e.printStackTrace();
            getSuccessor().stringRequest(string);
        }

        if (integer != null) {
            System.out.println("String = int: " + integer);
            //return integer;
        } else {
            getSuccessor().stringRequest(string);
        }

    }
}
