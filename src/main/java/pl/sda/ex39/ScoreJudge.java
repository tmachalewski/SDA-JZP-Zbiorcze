package pl.sda.ex39;

public class ScoreJudge {
    private Integer score;

    public ScoreJudge(Integer score) {
        this.score = score;
    }

    public Integer getScore(){
        return score;
    }
    public void setScore(Integer currentScore, Integer newScore){
        System.out.println("Received proposal: currentScore "+currentScore + " new score "+newScore+"Actual score "+score);
        synchronized(this){
            if(score.equals(currentScore)){
                score = newScore;
                System.out.println("New Judge Score "+score);
            }
        }
    }
}
