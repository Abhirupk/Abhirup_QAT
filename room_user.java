package room.assignment;

import java.util.Scanner;

public class room_user {

	public static void main(String[] args) 
	{
		room_assignment ra = new room_assignment();
		Scanner in = new Scanner(System.in);
		ra.setData(105, "Deluxe", 256, true);
		ra.displayData();
		
		System.out.println();
		
		ra.setData(106, "Ultra Deluxe", 300, false);
		ra.displayData();
		
		in.close();
		
	}

}
