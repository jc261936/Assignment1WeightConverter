package au.edu.jcu.cp3406.assignment1;

/*The Math part of the program. We multiply the first number by a value to get new value*/
public class Converter {
    private double multiplier;

    public Converter(Weight from, Weight to) {
        if (from == Weight.GRAMS) {
            if (to == Weight.KILOGRAMS) {
                multiplier = 0.001;
            }
        }
    }

    /*Returns the result of the conversion*/
    public double convert(double input) {
        return input * multiplier;
    }
}