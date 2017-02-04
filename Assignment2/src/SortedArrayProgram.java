/**
 * Created by dmd383 on 2/2/2017.
 */
public class SortedArrayProgram {
    public static void main(String[] args)  {
        SortedArray sortedArray = new SortedArray(4);
     //Testing insert method
        sortedArray.insert(new StudentListings("Donald Davis", "31", "2.5"));
        sortedArray.insert(new StudentListings("Peter Faulkner", "32", "3.0"));
        sortedArray.insert(new StudentListings("Henry Dafoux", "33", "3.5"));
        for (StudentListings student : sortedArray.students)
        {
                System.out.println(student.toString());
        }
        //Testing fetch method
        StudentListings fetchTest = sortedArray.fetch("Donald Davis");
            System.out.println(fetchTest.toString());

        //Testing delete method
sortedArray.delete("Donald Davis");
        for (StudentListings student : sortedArray.students)
        {
            System.out.println(student.toString());
        }

    }
}
