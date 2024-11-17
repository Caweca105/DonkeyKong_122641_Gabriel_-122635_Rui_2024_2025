package objects;

import pt.iscte.poo.gui.ImageTile;

import pt.iscte.poo.utils.Point2D;

public class Stair extends Object implements ImageTile {

    private int x;
    private int y;

    public Stair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // private Point2D position;

    // public Stair(Point2D initialPosition) {
    //     position = initialPosition;
    // }


    @Override
    public String getName() {
        return "Stairs";
    }

    @Override
    public int getLayer() {
        return 1;
    }

    // Tornar possível ao invés de coordenadas ler o ficheiro de texto e criar as
    // escadas onde existe "S".
    @Override
    public Point2D getPosition() {
        return new Point2D(x, y);
    }



}
