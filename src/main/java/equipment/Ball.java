package equipment;

public class Ball extends SportsEquipment {

    double size;    //размер
    String material;    //материал

    public Ball(double size, String material, double weight, String manufacturer) {

        super(weight, manufacturer);
        this.size = size;
        this.material = material;
    }

    public Ball Update(Ball ball) {

        super.Update(ball);
        this.size = ball.size;;
        this.material = ball.material;
        return this;
    }
}
