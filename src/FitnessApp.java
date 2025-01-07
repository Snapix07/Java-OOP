import java.util.List;

public class FitnessApp {
    public static void main(String[] args) {

        WorkoutRoutine cardioRoutine = new CardioRoutine("Cardio", 30, "Medium", 5);
        WorkoutRoutine strengthRoutine = new StrengthTraining("Strength Training", 45, "Hard", 10);


        User user1 = new User("Alice", 30, 70, 170, cardioRoutine);
        User user2 = new User("Bob", 25, 60, 180, strengthRoutine);


        User.addUser(user1);
        User.addUser(user2);


        List<User> cardioUsers = User.filterUsersByRoutine("Cardio");
        System.out.println("Users with Cardio routine: " + cardioUsers);


        User.sortUsersByWeight();
        System.out.println("Sorted users by weight: " + User.getUsers());
    }
}