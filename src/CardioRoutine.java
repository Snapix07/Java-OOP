public class CardioRoutine extends WorkoutRoutine {
    private int caloriesBurned;

    public CardioRoutine(String name, int duration, String difficulty, int caloriesBurned) {
        super(name, duration, difficulty);
        this.caloriesBurned = caloriesBurned;
    }

    @Override
    public String toString() {
        return super.toString() + ", caloriesBurned=" + caloriesBurned;
    }
}
