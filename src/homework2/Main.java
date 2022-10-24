package homework2;

public class Main {
    public static void main(String[] args) {

        Country estonia = new Country("Estonia", 45227.0);
        Country latvia = new Country("Latvia", 64589.0);
        Country lithuania = new Country("Lithuania", 65300.0);
        Country croatia = new Country("Croatia", 56594.0);

        Measurable[] smallCountries = new Measurable[4];
        smallCountries[0] = estonia;
        smallCountries[1] = latvia;
        smallCountries[2] = lithuania;
        smallCountries[3] = croatia;


        Country vatican = new Country("Vatican City", 0.44);
        Country tuvalu = new Country("Tuvalu", 26.0);
        Country monaco = new Country("Monaco", 2.02);
        Country nauru = new Country("Nauru", 21.0);

        Measurable[] smallestCountries = new Measurable[4];
        smallestCountries[0] = vatican;
        smallestCountries[1] = tuvalu;
        //smallestCountries[2] = nauru;
        smallestCountries[3] = monaco;


        System.out.println("Largest of small countries: " + Country.maximum(smallCountries));
        System.out.println("Largest of the smallest countries: " + Country.maximum(smallestCountries));

        System.out.println();

        System.out.println("Largest of small countries: " + Country.maximumWithLambda(smallCountries));
        System.out.println("Largest of the smallest countries: " + Country.maximumWithLambda(smallestCountries));

    }
}
