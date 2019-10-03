import java.util.Arrays;


String[] original;
ArrayList<String> newList;


public ArrayList convertToArrayList(String a[]){
  original =a;
   newList = new ArrayList<String>(Arrays.asList(original));
   
   
  return newList;
}