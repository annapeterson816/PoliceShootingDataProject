//A is asian
//B is black
//W is white
//H is hispanic 

int a=0;
int b=0;
int w=0;
int h=0;
public void countRace(){
  
  
  for(int i=0; i<race.length-1;i++){
    //System.out.print(race[i] + " ");
    if (race[i].equals("A") ==true){
      
      a++;
    }
    
    if (race[i].equals('B')){
      b++;
    }
    
    if (race[i].equals("W")==true){
      System.out.println(w);
      w++;
    }
      
    if (race[i].equals('H')){
      h++;
    }
   
  }
}