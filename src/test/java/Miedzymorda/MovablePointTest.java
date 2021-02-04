package Miedzymorda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovablePointTest {

     private MovablePoint movablePoint;

     @BeforeEach
   public void beforeEach(){
          movablePoint = new MovablePoint(10,9,8,7);
     }
     @Test
     public void testMovablePoint(){
          Assertions.assertNotNull(movablePoint);

     }
     @Test
     public void moveLeft() {
          assertEquals(2,movablePoint.moveLeft());

     }

     @Test
     public void moveRight() {
          assertEquals(18,movablePoint.moveRight());
     }
    @Test
    public void moveUp() {
        assertEquals(2,movablePoint.moveUp());
    }
    @Test
    public void moveDown() {
        assertEquals(16,movablePoint.moveDown());
    }






}
