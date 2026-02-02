public class SS07_03 {
    public static void main(String[] args) {
        double[] scores={6.5,8.0,4.5};
        for (double score:scores){
            boolean check =ScoreUtils.checkPass(score);
            System.out.println("Diem: "+ score+" : "+ (check?"Dat":"Truot"));
        }
        double avg= ScoreUtils.calculateAverage(scores);
        System.out.println("Diem trung binh ca lop: "+ avg);
    }
}
class ScoreUtils{
    public static boolean checkPass(double score){
        if(score>=5.0) return true;
        else return false;
    }
    public static double calculateAverage(double[] scores){
        double sum=0;
        for(double score:scores){
            sum+=score;
        }
        return sum/scores.length;
    }
}
