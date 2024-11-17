package objects;

import pt.iscte.poo.gui.ImageTile;
import pt.iscte.poo.utils.Point2D;

public class Floor implements ImageTile{

	private int x;
	private int y;

	public Floor(int x, int y ) {
		this.x = x;
		this.y = y;
	
	}

	@Override
	public String getName() {
		return "Floor";
	}

	@Override
	public int getLayer() {
		return 0;
	}

	//Preencher a imagem do Floor em questão em todas as coodenadas.
	@Override
	public Point2D getPosition() {
		for(int i =0; i < 480; i++){
			for(int j = 0; j < 480; j++){
				if(i == x && j == y){
					return new Point2D(i, j);
				}
			}
		}
		return null;
	}


	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}