public class StrengthTraining extends WorkoutRoutine {
    private int sets;
    private int reps;

    public StrengthTraining(String name, int duration, String difficulty, int sets) {
        super(name, duration, difficulty);
        this.sets = sets;
        this.reps = reps;
    }

    @Override
    public String toString() {
        return super.toString() + ", sets=" + sets + ", reps=" + reps;
    }
}
