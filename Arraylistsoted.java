import java.util.*;
public class ArrayListSorted{
  public static void main(String args[]){
    ArrayList<String> list=new   ArrayList<String>();
      list.add("gulabjamun");
      list.add("sweet curd");
      list.add("jalebi");
      list.add("sandwich");
      list.add("pasta");
    //for descending order using collection sort method with reverse order
    Collections.sort(list,Collections.reverseOrder());
    //print the sorted array list
    System.out.print(list);
    
  }
}

