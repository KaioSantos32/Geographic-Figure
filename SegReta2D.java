
public class SegdReta2D extends Objeto2D {
    private Ponto2d p0;
    private Ponto2d p1;

    public SegdReta2D (Ponto2d p0, Ponto2d p1){
        this.p0 = new Ponto2d(p0.getX(), p0.getY());
        this.p1 = new Ponto2d(p1.getX(), p1.getY());
    }


    public Ponto2d getP0(){
        return p0;
    }
    public Ponto2d getP1() {
        return p1;
    }


    @Override
    public void moveX(float dX) {
        p0.moveX(dX);
        p1.moveX(dX);
    }
    @Override
    public void moveY(float dY) {
        p0.moveY(dY);
        p1.moveY(dY);
    }
    @Override
    public void move(float dX, float dY) {
        p0.move(dX, dY);
        p1.move(dX, dY);

    }
    @Override
    public String toString() {
        return "SegdReta2D{" + "p0 = " + p0 + ", p1 = " + p1 + '}';
    }



}