package objects;

import pt.iscte.poo.gui.ImageTile;
import pt.iscte.poo.utils.Direction;
import pt.iscte.poo.utils.Point2D;

public class DonkeyKong extends Object implements ImageTile {

     private Point2D position;

    // public DonkeyKong(Point2D initialPosition) {
    //     position = initialPosition;
    // }

    private int x;
    private int y;

    public DonkeyKong(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public DonkeyKong(Point2D donkeyKongPosition) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getName() {
        return "DonkeyKong";
    }   

    @Override
    public int getLayer() {
        return 1;
    }

    @Override
    public Point2D getPosition(){
        return new Point2D(x, y);
    }

    public void move() {
       position = position.plus(Direction.random().asVector());
    }


}
