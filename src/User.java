public class User {
    private int id;
    private static int id_counter = 0;
    private String name;
    private int age;
    private double weight;
    private int height;
    private WorkoutRoutine routine;


    User(){
        this.id = id_counter++;
    }

    public User(String name, int age, double weight, int height, WorkoutRoutine routine) {
        this();
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.routine = routine;

    }
    public WorkoutRoutine getRoutine() {
        return routine;
    }
    public void setRoutine(WorkoutRoutine routine) {
        this.routine = routine;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height+"\n"+routine.toString();

    }
}
