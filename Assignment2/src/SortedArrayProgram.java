/**
 * Created by dmd383 on 2/2/2017.
 */
public class SortedArrayProgram {
    public static void main(String[] args)  {
        SortedArray sortedArray = new SortedArray(4);
     /*   sortedArray.students = new StudentListings[]{
                new StudentListings("Donald Davis", "31", "2.5"),
                new StudentListings("Peter Faulkner", "32", "3.0"),
                new StudentListings("Henry Dafoux", "33", "3.5")};*/
        sortedArray.insert(new StudentListings("Donald Davis", "31", "2.5"));
        sortedArray.insert(new StudentListings("Peter Faulkner", "32", "3.0"));
        sortedArray.insert(new StudentListings("Henry Dafoux", "33", "3.5"));
        for (StudentListings student : sortedArray.students)
        {
                System.out.println(student.toString());
        }
        //Testing insert method
    //    sortedArray.insert(new StudentListings("Randy Wilcox", "34", "3.2"));
//        for (StudentListings student : sortedArray.students)
//        {
//            System.out.println(student);
//        }
        //Testing fetch method
        // String shouldBeDonaldDavis = sortedArray.fetch("Donald Davis").toString();
        //  System.out.println(shouldBeDonaldDavis);
        //Testing delete method
        // sortedArray.delete("Donald Davis");

    }
}
