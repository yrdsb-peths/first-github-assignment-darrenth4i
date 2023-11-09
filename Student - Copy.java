public class Dog{
  public String name;
  public int age;

  public Student(String dName, int theAge){
    name = dName;
    age = theAge;
  }
  
  public String toString(){
    return "Your dog's name is " + name + " and it is " + age + " years old";
  }
}
