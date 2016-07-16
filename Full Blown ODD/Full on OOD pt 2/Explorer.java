
/**
 * Write a description of class Explorer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explorer{
    // instance variables - replace the example below with your own
    private String name;
    Room room;
    Treasure leftPocket;
    Treasure RightPocket;

    public Explorer(String _name, Room _room, Treasure _leftPocket, Treasure _rightPocket){
        this.name = _name;
        this.room = _room;
        this.leftPocket = _leftPocket;
        this.rightPocket = _rightPocket;
    }

    public int sampleMethod(int y){
        return x + y;
    }
}
