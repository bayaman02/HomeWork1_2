import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(ageOftemperatur(22, 23));
        System.out.println(ageOftemperatur(33, 20));
        System.out.println(ageOftemperatur(11, 16));
        System.out.println(ageOftemperatur(23, 45));
        System.out.println(ageOftemperatur(44, 34));

        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println("можно идти гулять");
            System.out.println(rand.nextInt(8) + 1);
        }
    }

    public static String ageOftemperatur(int age, int temperatur) {
        if (age > 20 && age < 45 && temperatur > -20 && temperatur < 30) {
            return "можно идти гулять";
        } else if (age < 20 && temperatur > 0 && temperatur < 28) {
            return "можно идти гулять";
        } else if (age > 45 && temperatur > -10 && temperatur < 25) {
            return "можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
    


}



