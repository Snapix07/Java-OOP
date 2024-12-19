
public class FitnessApp {
    public static void main(String[] args) {
        WorkoutRoutine routine1 = new WorkoutRoutine("Yoga", 30, "Beginner");
        WorkoutRoutine routine2 = new WorkoutRoutine("Box", 90, "Advanced");

        User user1 = new User("Zhanbolat" ,17 , 60,175,routine2);

        System.out.println(user1);
    }
}