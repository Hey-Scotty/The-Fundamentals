/**
 * 
 * Explorer.java
 * @author Tevin Scott
 * @version Oct 22, 2014
 *
 */
public class Explorer{
    // instance variables - replace the example below with your own
    private String name;
    private Room room;
    private Treasure leftPocket;
    private Treasure rightPocket;

    public Explorer(String _name, Room _room, Treasure _leftPocket, Treasure _rightPocket){
        this.name = _name;
        this.room = _room;
        this.leftPocket = _leftPocket;
        this.rightPocket = _rightPocket;
    }
}
