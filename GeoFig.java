    import Ponto2d;
    import SegdReta2D;


    public class GeoFig {
        public static void main(String[] args) {

            Ponto2d p0 = new Ponto2d (2.9f , 4.2f);
            System.out.println(p0.toString());
            Ponto2d p1 = new Ponto2d (4.4f , 5.7f);
            System.out.println(p1.toString());


            SegdReta2D sr0 = new SegdReta2d(p0, p1);
            System.out.println(sr0.toString());


        }
    }

