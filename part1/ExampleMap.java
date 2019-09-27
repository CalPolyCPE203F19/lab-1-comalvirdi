import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class ExampleMap
{
   public static List<String> highEnrollmentStudents(
      Map<String, List<Course>> courseListsByStudentName, int unitThreshold)
   {
      List<String> overEnrolledStudents = new LinkedList<>();

      /*
         Build a list of the names of students currently enrolled
         in a number of units strictly greater than the unitThreshold.
      */
      for (Map.Entry<String, List<Course>> student: courseListsByStudentName.entrySet()){
         List getList = student.getValue();
         int size = getList.size();
         // System.out.println(student.getKey());
         // System.out.println(student.getValue());
         // System.out.println(getList.size());
         if (unitThreshold < 4*size){
            overEnrolledStudents.add(student.getKey());
            

         }
      }

      
      return overEnrolledStudents;      
   }
}
