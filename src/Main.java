public class Main {
    public static void main (String[] args) {

        BmiService bmiservice = new BmiService();
        float BodyMassIndex = bmiservice.calculate(81, 1.80f);
        System.out.println(BodyMassIndex);
    }
}
