package Miedzymorda;

public class MovablePoint implements Movable {

    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {

        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public int moveUp() {
      return   y -= ySpeed;

    }

    @Override
    public int moveDown() {
      return   y += ySpeed;

    }

@Override
    public int moveLeft() {
      return   x -= xSpeed;

    }

    @Override
    public int moveRight() {

        return x += xSpeed;
    }
}
