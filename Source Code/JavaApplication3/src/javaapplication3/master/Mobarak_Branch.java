public class mobarak_branch{
  int roll;
  String name;

  mobarak_branch(String a, int b){
  this.name = a;
  this.roll = b;
  }

  public int getRoll(){
    return roll;
  }
  public void setRoll(int roll){
    this.roll = roll;
  }
  public int getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }

}