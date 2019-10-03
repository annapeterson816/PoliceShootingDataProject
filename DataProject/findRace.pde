//race is the 8th component in the data 
String[] race;


public void findRace(){
  race = new String[shootings.length];
  
  
 for(int i =0; i< shootings.length-1; i++){
    
    String s = shootings[i];
    //println(s);
    
   String[] list = split(s , ",");
        race[i] = list[7];
        println(race[i]);
        
  }
  
      
  
}