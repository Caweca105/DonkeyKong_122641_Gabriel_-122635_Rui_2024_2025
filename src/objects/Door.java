package objects;

import pt.iscte.poo.gui.ImageTile;

import pt.iscte.poo.utils.Point2D;

public class Door extends Object implements ImageTile {

    private int x;
    private int y;

    public Door(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // private Point2D position;

    // public Door(Point2D initialPosition) {
    //     position = initialPosition;
    // }

    @Override
    public String getName() {
        return "DoorClosed";
    }

    @Override
    public int getLayer() {
        return 0;
    }

    // Tornar possível ao invés de coordenadas ler o ficheiro de texto e criar as portas onde existe "0".
    @Override
    public Point2D getPosition() {
        return new Point2D(x, y);
    }




}
