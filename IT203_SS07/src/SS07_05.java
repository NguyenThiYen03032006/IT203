public class SS07_05 {
    public static void main(String[] args) {
        //Config.MAX_SCORE = 20.0;
        // error: cannot assign a value to final variable MAX_SCORE
    }
}
class Config {
    public static final double MAX_SCORE = 10.0;
    public static final double MIN_SCORE = 0.0;
}
