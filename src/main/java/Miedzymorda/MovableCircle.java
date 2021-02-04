package Miedzymorda;

public class MovableCircle implements Movable   {

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius) {
        this.radius = radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);



    }



    @Override
    public int moveUp() {
       return center.y-=center.ySpeed;

    }

    @Override
    public int moveDown() {
     return    center.y+=center.ySpeed;

    }

    @Override
    public int moveLeft() {
     return    center.x-= center.xSpeed;

    }

    @Override
    public int moveRight() {
      return   center.x+= center.xSpeed;


    }
}
