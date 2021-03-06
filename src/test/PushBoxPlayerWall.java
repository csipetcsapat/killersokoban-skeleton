package test;

import sokoban.*;

/**
 * ebben a tesztben egy boxot tolunk, ami mögött egy player, ami mögött fal van
 * elvárt kimenet: a player törli magát, helyére kerül a box
 */

public class PushBoxPlayerWall implements Test {
	
	Field f1, f2, f3, f4;
	Worker w1,w2;
	Box b1;
	Wall wall;
	
	PushBoxPlayerWall () {
		
		f1 = new Field("f1");
		f2 = new Field("f2");
		f3 = new Field("f3");
		f4 = new Field("f4");
		
		
		w1 = new Worker("w1", f1);
		b1 = new Box("b1", f2);
		w2 = new Worker("w2", f3);
		wall = new Wall("wall", f4);
		
		f1.SetNeighbour(Directions.RIGHT, f2);
		f2.SetNeighbour(Directions.RIGHT, f3);
		f3.SetNeighbour(Directions.RIGHT, f4);
		
		f1.SetThing(w1);
		f2.SetThing(b1);
		f3.SetThing(w2);
		f4.SetThing(wall);
			
	}
	
	public void Run() {
		w1.Move(Directions.RIGHT);
	}
	
	
}
