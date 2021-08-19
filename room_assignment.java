package room.assignment;

public class room_assignment {

	int room_no;
	String room_type;
	int room_area;
	boolean ACmachine;
	
	public void setData(int rno, String r_type, int r_area, boolean ACm)
	{
		this.room_no = rno;
		this.room_type = r_type;
		this.room_area = r_area;
		this.ACmachine = ACm;
	}
	
	public void displayData()
	{
		System.out.println("Room no.:"+room_no);
		System.out.println("Room type:"+room_type);
		System.out.println("Room area:"+room_area);
		System.out.println("AC facility:"+ACmachine);
	}
}
