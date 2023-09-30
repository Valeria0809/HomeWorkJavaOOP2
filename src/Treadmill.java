public class Treadmill extends Barrier {
    private String nameTreadmill;

    public Treadmill(int size, String nameTreadmill) {
        super(size);
        this.nameTreadmill = nameTreadmill;
    }

    public String getNameTreadmill() {
        return nameTreadmill;
    }

    public String toString() {
        return "Беговая дорожка с названием - " + "'" + nameTreadmill + "'" + " длинна = " + getSize();
    }
}

