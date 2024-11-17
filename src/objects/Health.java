package objects;

import pt.iscte.poo.gui.ImageTile;

import pt.iscte.poo.utils.Point2D;

public class Health extends Object implements ImageTile {

    private int x;
    private int y;

    public Health(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // private Point2D position;

    // public Health(Point2D initialPosition) {
    //     position = initialPosition;
    // }

    @Override
    public String getName() {
        return "GoodMeat";
    }

    @Override
    public int getLayer() {
        return 1;
    }

    // Tornar possível ao invés de coordenadas ler o ficheiro de texto e criar os bifes onde existe "H".
    @Override
    public Point2D getPosition() {
        return new Point2D(x, y);
    }

}
