package Command.inerfaces;

/**
 * Created by GEO on 12.10.15.
 */
public abstract class Handler {

    private Handler successor;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public void stringRequest(String string){

        successor.stringRequest(string);
    }
}
