import java.io.IOException;
import java.util.Scanner;

public class HW09 {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the path to your room file: ");
		String roomFile = scan.nextLine();
		System.out.println("Please enter the path to your treasure file: ");
		String tresFile = scan.nextLine();
		
		FileReader roomReader = new FileReader(roomFile);
		FileReader tresReader = new FileReader(tresFile);
		int roomNum = Integer.parseInt(roomReader.getRecord());
		int tresNum = Integer.parseInt(tresReader.getRecord());
		Treasure[] tresArray = new Treasure[tresNum];
		for(int i = 0; i < tresArray.length; i++){
			tresArray[i] = new Treasure(tresReader.getRecord(), tresReader.getRecord(), Double.parseDouble(tresReader.getRecord()), Integer.parseInt(tresReader.getRecord()));
		}
		Room[] roomArray = new Room[roomNum];
		for(int i = 0; i < roomArray.length; i++){
			if(i < tresArray.length)	
				roomArray[i] = new Room(roomReader.getRecord(), roomReader.getRecord(), tresArray[i]);
			else
				roomArray[i] = new Room(roomReader.getRecord(), roomReader.getRecord());
		}
		
		for(int i = 0; i < roomArray.length; i++){
			System.out.println(roomArray[i]);
		}
		
	}
}
