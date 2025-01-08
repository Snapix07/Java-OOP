import java.util.List;

public class FitnessApp {
    public static void main(String[] args) {

        WorkoutRoutine c1 = new CardioRoutine("Cardio", 30, "Medium", 500);
        WorkoutRoutine s1 = new StrengthTraining("Strength Training", 45, "Hard", 10);
        WorkoutRoutine s2 = new StrengthTraining("Powerlifting", 90, "Hard", 10 );


        User user1 = new User("Jordan", 30, 70, 170, c1);
        User user2 = new User("Chico", 25, 80, 180, s1);
        User user3 = new User("Zeta", 35, 65, 165, s2);


        List<User> filteredUsers = user1.filterByRoutine("Cardio");
        System.out.println("Filtered users with Cardio routine:");
        for (User user : filteredUsers) {
            System.out.println(user);
        }


        List<User> sortedUsers = user1.sortByWeight(User.getUsers());
        System.out.println("\nUsers sorted by weight:");
        for (User user : sortedUsers) {
            System.out.println(user);
        }
    }
}
