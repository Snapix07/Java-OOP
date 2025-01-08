public class WorkoutRoutine {
    private String name;
    private int duration;
    private String difficulty;

    public WorkoutRoutine(String name, int duration, String difficulty) {
        this.name = name;
        this.duration = duration;
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getDifficulty() {
        return difficulty;
    }
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return name  +
                ", duration=" + duration +
                ", difficulty='" + difficulty;
    }
}

