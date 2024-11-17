package objects;

import pt.iscte.poo.gui.ImageTile;
import pt.iscte.poo.utils.Point2D;

public class Wall extends Object implements ImageTile {

	private int x;
	private int y;

	public Wall(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String getName() {
		return "Wall";
	}

	@Override
	public int getLayer() {
		return 0;
	}

	//Tornar possível ao invés de coordenadas ler o ficheiro de texto e criar as paredes onde existe "W".
	@Override
	public Point2D getPosition() {
		return new Point2D(x, y);
	}


	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}	
	
}

