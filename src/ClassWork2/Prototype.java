package ClassWork2;



class Bullet implements Cloneable {
   private String color;
    private int mm;
    private double weight;

    public Bullet(String color, int mm, double weight) {
        this.color = color;
        this.mm = mm;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void fire(){
        System.out.println("Bidiggg " + color);
    }

    @Override
    protected Bullet clone() throws CloneNotSupportedException {
     try{
         return (Bullet)super.clone();
     }catch(CloneNotSupportedException e){
        throw new CloneNotSupportedException();
     }
    }
}





public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
//Bullet[] bullets = new Bullet[20];
//        for (int i = 0; i < bullets.length; i++) {
//            bullets[i] = new Bullet("red", 1, 1.0);
//            bullets[i].fire();
//        }


        Bullet bullets=new Bullet("red",10,5);

        for (int i = 0; i < 20; i++) {
           Bullet copy= bullets.clone();
           copy.setColor("black");
           copy.fire();
        }

        bullets.fire();
    }
}
