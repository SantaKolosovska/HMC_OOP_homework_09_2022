package homework2;

import java.util.*;

public class Country implements Measurable {

    private String name;
    private double area;

    public Country(String name, double area) {
        this.name = name;
        this.area = area;
    }

    @Override
    public double getMeasure() {
        return this.area;
    }

    @Override
    public String toString() {
        return this.name + ", area: " + this.area + " square km";
    }

    public static Measurable maximum(Measurable[] objects) {
        Measurable largest = null;
        double maxArea = 0.0;

        for (var object : objects) {
            if ((object != null) && object.getMeasure() > maxArea) {
                maxArea = object.getMeasure();
                largest = object;
            }
        }

        return largest;
    }

    public static Measurable maximumWithLambda(Measurable[] objects) {
        List<Measurable> listOfObjects = new ArrayList<>(Arrays.asList(objects));
        listOfObjects.removeIf(Objects::isNull);

        listOfObjects.sort(
                Comparator.comparingDouble(Measurable::getMeasure));
        return listOfObjects.get(listOfObjects.size() - 1);
    }

}