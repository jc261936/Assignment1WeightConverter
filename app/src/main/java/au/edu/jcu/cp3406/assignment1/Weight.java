package au.edu.jcu.cp3406.assignment1;

public enum Weight {
    GRAMS,
    KILOGRAMS,
    OUNCES,
    STONE,
    TONNES;


    private String toString;

    public static Weight fromString(String text) {
        if (text != null) {
            for (Weight weight : Weight.values()) {
                if (text.equalsIgnoreCase(weight.toString)) {
                    return weight;
                }
            }
        }
        /*IllegalArgumentException is thrown in order to indicate that a method has been passed an illegal argument.*/
        throw new IllegalArgumentException("Cannot find a value for " + text);
    }

    /*The Math part of the program. We multiply the first number by a value to get new value*/
    class Converter {
        private final double multiplier;

        public Converter(Weight from, Weight to) {
            double constant = 1;
            switch (from) {
                case GRAMS:
                    if (to == Weight.KILOGRAMS) {
                        constant =
                    }
            }
            multiplier = constant;
        }
    }

    /*Returns the result of the conversion*/
    public double convert(double input) {
        return input * multiplier;
    }
}
