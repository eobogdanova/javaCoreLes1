package les1;

public class Task1 {
    public static void main(String[] args) {
        Course course = new Course(new Cross(100), new Swimming(50));

        Team team1 = new Team("Team 1", new Human1("Katya"), new Human2("Vlad"));

        Team team2 = new Team("Team 2", new Human3("Juli"), new Human4("Roma"));

        course.doIt(team1);
        course.doIt(team2);

        System.out.println("\n===== RESULTS =====\n");
        team1.showResults();
        System.out.println();
        team2.showResults();
    }
}
