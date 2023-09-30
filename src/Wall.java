public class Wall extends Barrier{
    private String nameWall;

    public Wall(int size, String nameWall) {
        super(size);
        this.nameWall = nameWall;
    }

    public String getNameWall() {
        return nameWall;
    }

    @Override
    public String toString() {
        return "Стена с названием - " + "'" + nameWall + "'" + " высота = " + getSize();
    }
}

