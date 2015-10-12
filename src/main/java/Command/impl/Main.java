package Command.impl;

import Command.inerfaces.Handler;

/**
 * Created by GEO on 12.10.15.
 */
public class Main {
    public static void main(String[] sss) {

        Handler handler1 = new ResponceFloat();
        Handler handler2 = new ResponceInt();
        Handler handler3 = new ResponceString();

        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        handler1.stringRequest("10g");

    }
}
