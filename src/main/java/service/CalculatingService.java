package service;

public class CalculatingService {
    public static Double calculating(Double num1, Double num2, String operation) {
        double response = 0;
        switch (operation) {
            case "sum":
                response = num1+num2;
                break;
            case "subtraction":
                response = num1-num2;
                break;
            case "multiplication":
                response = num1*num2;
                break;
            case "division":
                response = num1/num2;
                break;
        }
        return response;
    }
}
