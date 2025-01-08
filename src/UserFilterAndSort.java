import java.util.List;

public interface UserFilterAndSort {
    List<User> filterByRoutine(String routineName);
    List<User> sortByWeight(List<User> users);
}
