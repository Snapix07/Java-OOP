import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class User implements  UserFilterAndSort{
    private static List<User> users = new ArrayList<>();
    private int id;
    private static int id_counter = 0;
    private String name;
    private int age;
    private double weight;
    private int height;
    private WorkoutRoutine routine;

    User() {
        this.id = id_counter++;
    }

    public User(String name, int age, double weight, int height, WorkoutRoutine routine) {
        this();
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.routine = routine;
        users.add(this);
    }

    public static void addUser(User user) {
        users.add(user);
    }

    public static List<User> getUsers() {
        return users;
    }


    private double getWeight() {
        return weight;
    }

    public WorkoutRoutine getRoutine() {
        return routine;
    }

    @Override
    public String toString() {
        return "\nUser:\n" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", routine=" + routine +
                '}';
    }

    @Override
    public List<User> filterByRoutine(String routineName) {
        List<User> filteredUsers = new ArrayList<>();
        for (User user : users) {
            if (user.getRoutine().getName().equalsIgnoreCase(routineName)) {
                filteredUsers.add(user);
            }
        }
        return filteredUsers;
    }

    @Override
    public List<User> sortByWeight(List<User> users) {
        users.sort(Comparator.comparingDouble(User::getWeight));
        return users;
    }
}