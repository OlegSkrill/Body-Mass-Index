public class BmiService {
    public float calculate (int weight, float height) {

        float BodyMassIndex = weight / (height * height);
        return BodyMassIndex;
    }

}
