
package work04;


public class Person {
    private int id;
     
    public Person(int userid) {
        id = userid;
  }
    public int getid(){
        return id;
    }
    public void setid(int newid){
        this.id = newid;
    }
    @Override
    public String toString(){
        return "id" + id;  
    }  
}
