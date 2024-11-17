package objects;

import pt.iscte.poo.gui.ImageTile;
import pt.iscte.poo.utils.Direction;
import pt.iscte.poo.utils.Point2D;
import pt.iscte.poo.gui.ImageGUI;

public class Manel extends Object implements ImageTile {

	private Point2D position;
	
	public Manel(Point2D initialPosition){
		position = initialPosition;
	}
	
	@Override
	public String getName() {
		return "JumpMan";
	}

	@Override
	public Point2D getPosition() {
		return position;
	}

	@Override
	public int getLayer() {
		return 1;
	}


	public void move(){

		position = position.plus(Direction.directionFor(ImageGUI.getInstance().keyPressed()).asVector());
	}
	
}
