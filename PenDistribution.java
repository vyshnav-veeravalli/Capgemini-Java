public class PenDistribution {
    public static void main(String[] args) {
        // Define total pens 
        int totalPens = 14;
		// Define number of students
        int students = 3;

        // Calculate how many pens each student gets
        int pensPerStudent = totalPens / students;

        // Calculate the remaining pens
        int remainingPens = totalPens % students;

        // Display the results
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}

