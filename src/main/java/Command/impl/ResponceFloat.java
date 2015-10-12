package Command.impl;

import Command.inerfaces.Handler;

/**
 * Created by GEO on 12.10.15.
 */
public class ResponceFloat extends Handler {

    @Override
    public void stringRequest(String string) {

        Float fl = null;
        try {

            fl = Float.parseFloat(string);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            getSuccessor().stringRequest(string);
        }

        if (!fl.isNaN()) {
            System.out.println("String = float: " + fl);
            //return fl;
        } else {
            getSuccessor().stringRequest(string);
        }

    }

}
