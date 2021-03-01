
public class Ponto2d extends Object implements Objeto2D {

    private float x, y;
    public Ponto2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX(){

        return x;
    }

    public float getY(){
        return y;
    }

    @Override
    public void moveX(float dX) {
        x += dX;
    }
    @Override
    public void moveY(float dY) {
        y += dY;
    }
    @Override
    public void move(float dX, float dY) {
        x += dX;
        y += dY;
    }
    @Override
    public String toString() {
        return "Ponto2d{" + "x = " + x + ", y = " + y + '}';
    }

}