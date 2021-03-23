public class SpeedConverter {

    //Method that converts Km/h to Mi/h
    public static long toMilesPerHour(double kilometersPerHour) {

        //Tests if kilometersPerHour is less than 0
        //which return -1;
        if (kilometersPerHour < 0) {
            return -1;
        }

        //Returns the rounded value of kilometersPerHour
        //divided by the conversion number of milesPerHour
        return Math.round(kilometersPerHour / 1.609);
    }

    //Method that prints out the conversion of Km/h to Mi/h
    public static void printConversion(double kilometersPerHour) {

        //Tests if kilometersPerHour is less than 0
        //which will result in an Invalid Value
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");

        } else {
            //If not less than zero then continue with method

            //milesPerHour variable that uses the first method to convert kilometersPerHour
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            //Prints out the converted values
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
