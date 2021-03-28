package au.edu.jcu.cp3406.assignment1;

/*The Math part of the program. We multiply the first number by a value to get new value*/
public class Converter {
    private double multiplier;

    public Converter(Weight from, Weight to) {
        if (from == Weight.GRAMS) {
            if (to == Weight.KILOGRAMS) {
                multiplier = 0.001;
            } else if (to == Weight.OUNCES) {
                multiplier = 0.035274;
            } else if (to == Weight.STONE) {
                multiplier = 0.000157473;
            } else if (to == Weight.TONNES) {
                multiplier = 0.000001 ;
            } else if (to == Weight.POUND) {
                multiplier = 0.00220462;
            }
        } else if (from == Weight.KILOGRAMS) {
            if (to == Weight.GRAMS) {
                multiplier = 1000;
            } else if (to == Weight.OUNCES) {
                multiplier = 35.274;
            } else if (to == Weight.STONE) {
                multiplier = 35.274;
            } else if (to == Weight.TONNES) {
                multiplier = 35.274;
            } else if (to == Weight.POUND) {
                multiplier = 35.274;
            }
        } else if (from == Weight.OUNCES) {
            if (to == Weight.KILOGRAMS) {
                multiplier = 0.0283495;
            } else if (to == Weight.POUND) {
                multiplier = 0.0625;
            } else if (to == Weight.GRAMS) {
                multiplier = 28.3495;
            } else if (to == Weight.STONE) {
                multiplier = 0.00446429;
            } else if (to == Weight.TONNES) {
                multiplier = 0.0000283495;
            }
        } else if (from == Weight.STONE) {
            if (to == Weight.GRAMS) {
                multiplier = 6350.29;
            } else if (to == Weight.OUNCES) {
                multiplier = 224;
            } else if (to == Weight.TONNES) {
                multiplier = 0.00635029;
            } else if (to == Weight.KILOGRAMS) {
                multiplier = 6.35029;
            } else if (to == Weight.POUND) {
                multiplier = 14;
            }
        } else if (from == Weight.TONNES) {
            if (to == Weight.GRAMS) {
                multiplier = 1e+6;
            } else if (to == Weight.OUNCES) {
                multiplier = 35274;
            } else if (to == Weight.STONE) {
                multiplier = 157.473;
            } else if (to == Weight.KILOGRAMS) {
                multiplier = 1000;
            } else if (to == Weight.POUND) {
                multiplier = 2204.62;
            }
        } else if (from == Weight.POUND) {
            if (to == Weight.GRAMS) {
                multiplier = 453.592;
            } else if (to == Weight.OUNCES) {
                multiplier = 16;
            } else if (to == Weight.STONE) {
                multiplier = 0.0714286;
            } else if (to == Weight.KILOGRAMS) {
                multiplier = 0.453592;
            } else if (to == Weight.TONNES) {
                multiplier = 0.000453592;
            }
        }

    }

    /*Returns the result of the conversion*/
    public double convert(double input) {
        return input * multiplier;
    }
}