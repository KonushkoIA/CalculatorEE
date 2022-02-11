package entity;

public class Operation {
    private int id;
    private int userId;
    private double answer;
    private String username;

    public Operation(){
    }

    public Operation(double answer) {
        this.answer = answer;
    }

    public Operation(double answer, String username) {
        this.answer = answer;
        this.username = username;
    }

    public Operation(int id, int userId, double answer) {
        this.id = id;
        this.userId = userId;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Answer=" + answer +
                ", username='" + username + '\'';
    }
}
