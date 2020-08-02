package pl.sda.ex16;

public enum RunnerEnum {
    BEGINNER(360, 600),
    INTERMEDIATE(300, 359),
    ADVANCED(0, 259);

    RunnerEnum(int minimumTime, int maximumTime) {
        this.minimumTime = minimumTime;
        this.maximumTime = maximumTime;
    }

    public int getMinimumTime() {
        return minimumTime;
    }

    public int getMaximumTime() {
        return maximumTime;
    }

    private int minimumTime;
    private int maximumTime;

    public static RunnerEnum getFitnessLevel(int timeInMinutes){
        for(RunnerEnum level : RunnerEnum.values()){
            if(level.getMinimumTime()<=timeInMinutes && timeInMinutes<=level.getMaximumTime()){
                return level;
            }
        }
        return null;
    }
}
