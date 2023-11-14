public class Job{
  public String job;
  public int dollars;

  public Student(String jobName, int dollarsEarned){
    job = jobName;
    dollars = dollarsEarned;
  }
  
  public String toString(){
    return "Your job is " + job + " and you have earned $" + dollars + ".";
  }
}
