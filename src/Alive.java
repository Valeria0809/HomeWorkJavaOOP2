public class Alive  extends Creature {
    private final String typeCreature;
    public Alive(String name, int run, int jump, String typeCreature) {
        super(name, run, jump);
        this.typeCreature = typeCreature;
    }

    @Override
    boolean running(int runDistance) {
        if(getRun() >= runDistance){
            System.out.println(typeCreature + " " + getName() + " пробежал " + runDistance + " метров");
            return true;
        } else {
            System.out.println(typeCreature + " " + getName() + " не смог пробежать " + runDistance + " метров ");
            return false;
        }
    }
    @Override
    boolean jumping(int jumpDistance) {
        if (getJump() >= jumpDistance) {
            System.out.println(typeCreature + " " + getName() + " прыгнул " + jumpDistance + " метра");
            return true;
        } else {
            System.out.println(typeCreature + " " + getName() + " не смог прыгнуть " + jumpDistance + " метра ");
            return false;
        }
    }

    @Override
    public String toString() {
        return getName();
    }
}
