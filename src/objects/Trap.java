package objects;

import pt.iscte.poo.gui.ImageTile;

import pt.iscte.poo.utils.Point2D;

public class Trap extends Object implements ImageTile {

    private int x;
    private int y;

    public Trap(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // private Point2D position;

    // public Trap(Point2D initialPosition) {
    //     position = initialPosition;
    // }

    @Override
    public String getName() {
        return "Trap";
    }

    @Override
    public int getLayer() {
        return 1;
    }

    // Tornar possível ao invés de coordenadas ler o ficheiro de texto e criar as armadilhas onde existe "t".
    @Override
    public Point2D getPosition() {
        return new Point2D(x, y);
    }


}
