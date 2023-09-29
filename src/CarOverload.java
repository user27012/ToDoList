public class CarOverload {

    public int rik;
    public double speed;
    public int vaga;
    public String colour;

    public CarOverload(int rik, double speed, int vaga, String colour) {
        this.rik = rik;
        this.speed = speed;
        this.vaga = vaga;
        this.colour = colour;
    }

    public CarOverload(int rik, double speed, int vaga) {
        this.rik = rik;
        this.speed = speed;
        this.vaga = vaga;
    }

    public CarOverload(int rik, double speed) {
        this.rik = rik;
        this.speed = speed;
    }

    public CarOverload(int rik) {
        this.rik = rik;
    }
}
