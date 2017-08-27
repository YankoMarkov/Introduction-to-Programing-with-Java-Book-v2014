
public class Student extends Human implements Comparable {
    private double score;

    public Student(String firstName, String lastName, double score) {
        super(firstName, lastName);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
