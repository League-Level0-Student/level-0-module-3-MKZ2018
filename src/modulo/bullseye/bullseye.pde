void setup() {
  size(800,800);
}

void draw() {  
  for(int i=50; i<100; i++){
        ellipse(i*1, i*2,150,150);
    if(i%2==0){
      fill(0,0,0);
    }
    else{
      fill(#FF001E);
    }
    
  }
}