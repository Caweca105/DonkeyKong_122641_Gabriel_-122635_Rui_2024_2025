package objects;

import pt.iscte.poo.gui.ImageTile;

import pt.iscte.poo.utils.Point2D;

public class Sword extends Object implements ImageTile {

    private int x;
    private int y;

    public Sword(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // private Point2D position;

    // public Sword(Point2D initialPosition) {
    //     position = initialPosition;
    // }

    @Override
    public String getName() {
        return "Sword";
    }

    @Override
    public int getLayer() {
        return 1;
    }

    // Tornar possível ao invés de coordenadas ler o ficheiro de texto e criar a espada onde existe "s".
    @Override
    public Point2D getPosition() {
        return new Point2D(x, y);
    }






}
