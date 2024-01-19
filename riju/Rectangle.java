public class Rectangle
{
  int length,breadth;
   Rectangle(int x,int y)
  {
  	length=x;
  	breadth=y;
  }
  int area()
  {
  	int a =length*breadth;
  	return a;
  }
}
 class RectArea
 {
	public static void main(String args[])
	{
	 Rectangle rect=new Rectangle(10,5);
	 int area =rect.area();
	 System.out.println("Area="+area);
	}
 }
