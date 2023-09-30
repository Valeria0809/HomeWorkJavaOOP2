public abstract class Creature {
    private String name;
    private int run;
    private int jump;

    public Creature(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }
    abstract boolean running(int runDistanse);

    abstract boolean jumping(int jumpDistanse);
}
