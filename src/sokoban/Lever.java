package sokoban;

import test.Skeleton;

/**Kapcsoló, amely egy hozzá tartozó lyukat vezérel.
Ha láda kerül rá a vonatkozó Hole objektum kinyílik.
 */
public class Lever extends Field {
    private Hole hole;

    /**
     * konstrunktor
     * @param objName az objektum neve
     */
    public Lever(String objName)
    {
      super(objName);
    }

    /**
     * átkapcsolja a hozzá tartozó lyukat
     */
    public void Operate()
    {
    	Skeleton.log.call(this);
        hole.Toggle();
    }

    /**
     * @param h az adott lyukat társítja magához
     */
    public void SetHole(Hole h)
    {
    	Skeleton.log.call(this);
        hole=h;
    }
}
