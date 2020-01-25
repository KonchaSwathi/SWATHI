package app;


public interface  Shape {
	   
	   void input();
	   void area();
}
class Rectangle implements Shape{
	  int length;
	  int breadth;
	  int area;
      Rectangle()
     {
	  this.length= length;
	  this.breadth=breadth;
	 }
    public void area() {
    	area=length*breadth;
    }
}	  
class square implements shape{
      int area;
      square()
      {
    	  this.area=area;
      }
     public void area(){
    	area=area*area;
     }
class circle implements shape{
	int area;
	double pi;
	int radius;
	
}
      
	

	   
	   
	   
	   
	   
       
	   
	   

}
