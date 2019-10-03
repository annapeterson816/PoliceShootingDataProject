
 String [] file;
  String[] shootings;
  int height=0;
  int count=0;
 
  
 
void setup(){
 size(1400,900);
 background(255);
 fill(149,0,255);
 textSize(32);
  file = loadStrings("data/data.txt");
  shootings = new String[file.length-1];
  
  for(int i=0; i< shootings.length-1; i++){
    shootings[i] = new String(file[i+1]);
    
  }
  
  
 // println(convertToArrayList(shootings));
  
 findRace();
 
 countRace();
 
}

void draw(){
  //title
  fill(0);
  text("Number of Fatal Shootings by Race", 400, 75);
  
  //axis
 line(100,80,100,780);
 stroke(10);
  
  line(100,780,1200,780);
 stroke(10);
  
  //labels 
  
  fill(0);
  textSize(24);
  text("Asian", 250, 830);
  
  fill(0);
  textSize(24);
  text("Hispanic", 500, 830);
  
  fill(0);
  textSize(24);
  text("Black", 750, 830);
  
  fill(0);
  textSize(24);
  text("White", 1000, 830);
  
  //animate asian bars
  
  fill(204, 102, 0);
  rect(230,780,120, height);
   count++;
   if (count!=32){
     height--;
   }
   else
     height=500;
  
}