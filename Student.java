public class Student{
  public String firstName;
  public int volunteerHours;

  public Student(String fName, int numVolunteerHours){
    firstName = fName;
    volunteerHours = numVolunteerHours;
  }
  
  public String toString(){
    return "Your first name is " + firstName + " and you have " + volunteerHours + " volunteer hours";
  }
}
