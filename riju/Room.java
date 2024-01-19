class Room
{
	int i,w;
	Room (int x,int y)
	{
		i=x;
		w=y;
	}
	Room(int x)
	{
		i=w=x;
	}
	int area()
	{
		int a=i*w;
		return a;
	}
}
class RoomArea
{
	public static void main(String args[])
			{
				Room r=new Room(20,40);
				int area1=r.area();
				System.out.println("Area of the Room1="+area1);
				Room r1=new Room(40);
				int area2=r1.area();
				System.out.println("Area of the Room2="+area2);
			}
}
