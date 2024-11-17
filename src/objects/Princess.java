package objects;

import pt.iscte.poo.gui.ImageTile;

import pt.iscte.poo.utils.Point2D;

public class Princess extends Object implements ImageTile {

    private int x;
    private int y;

    public Princess(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // private Point2D position;

    // public Princess(Point2D initialPosition) {
    //     position = initialPosition;
    // }

    public Princess(Point2D princessPosition) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getName() {
        return "Princess";
    }

    @Override
    public int getLayer() {
        return 1;
    }

    // Tornar possível ao invés de coordenadas ler o ficheiro de texto e criar a princesa onde existe "P".
    @Override
    public Point2D getPosition() {
        return new Point2D(x, y);
    }

}
