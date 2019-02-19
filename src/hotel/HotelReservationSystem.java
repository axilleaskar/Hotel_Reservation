package hotel;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;




public class HotelReservationSystem {

	
	public static void main(String[] args) throws ParseException {
		int a = 0;
		Amenity[] aArray = new Amenity[50];
		for(int i = 0; i < aArray.length; i++) {
			aArray[i] = new Amenity();
			}
		int c = 0;
		
		Client[] clients = new Client[100];
		for(int i = 0; i < clients.length; i++) {
			clients[i] = new Client();
			}
		Room[] rooms = new Room[100];
		for(int i = 0; i < rooms.length; i++) {
			rooms[i] = new Room();
			}
		Reservation[] reservations = new Reservation[100];
		for(int i = 0; i < reservations.length; i++) {
			reservations[i] = new Reservation();
			}
		boolean isDone = true;
		Scanner s = new Scanner(System.in);
		int myInt = 0;
		//While "0" is not pressed keep the program awake 
		do {
		if(isDone) {
		System.out.println("[1] Insert Amenity ");
		System.out.println("[2] Insert Room (Standard or Superior)");
		System.out.println("[3] Insert Client");
		System.out.println("[4] Book Room");
		System.out.println("[5] Cancel Room Reservation ");
		System.out.println("[6] Order Amenity (Available only in Superior Rooms)");
		System.out.println("[7] Room Availability");
		System.out.println("[0] Exit");
		myInt = s.nextInt();
		}
		//Create a new Amenity object	
		if(myInt == 1) {
			a=0;
			System.out.println("give me id");
			int id = s.nextInt();
			for(int i = 0; i < aArray.length; i++) {
				if(aArray[i].ucode == id) {
					System.out.println("ID already exists");
					System.out.println("give me id");
					id = s.nextInt();
					i--;
					}
				}

			for(int j = 0; j < rooms.length; j++) {
				if(aArray[j].ucode == 0) {
					aArray[j].ucode = id;
					a = j;
					break;
				}
			}
			
			System.out.println("give me price");
			double price = s.nextDouble();
			
			System.out.println("give me description");
			String descr = s.next();
			
			System.out.println("give me category");
			String category = s.next();
			
			aArray[a] = new Amenity(id, category, descr, price);
			
			System.out.println("category: "+ aArray[a].getCategory()+" Description: "+ aArray[0].getDescription());
		//Choose to Create a new Standard room or Superior room which extend from Room 
		}else if(myInt == 2) {
			isDone = false;
			System.out.println("[a] Insert a standard room");
			System.out.println("[b] Insert a superior room");
			
			String x = s.next();
			char option = x.charAt(0);
			
			
			
			
			if(option == 'a') {
				
				
				System.out.println("gif me id");
				int id = s.nextInt();						
				for(int i = 0; i < rooms.length; i++) {
					if(rooms[i].id == id) {
						System.out.println("ID already exists");
						System.out.println("gif me id");
						id = s.nextInt();
						i = -1;
						}
					}

				for(int j = 0; j < rooms.length; j++) {
					if(rooms[j].id == 0) {
						
						a = j;
						
						
						break;
					}
				}
				
					
				System.out.println("give me price");
				double price = s.nextDouble();
				
				System.out.println("give me floor");
				int floor = s.nextInt();
				
				System.out.println("give me size");
				String size = s.next();
				System.out.println(size);
				isDone = true;
			  
			
		
				
				rooms[a] = new StandardRoom(price, floor, id, size);
				System.out.println("id "+ rooms[a].id);
				System.out.println("Press any number to continue");
				
		
			     
		       }else if(option == 'b') {
		    	   
					
					
					System.out.println("gif me id");
					int id = s.nextInt();						
					for(int i = 0; i < rooms.length; i++) {
						if(rooms[i].id == id) {
							System.out.println("ID already exists");
							System.out.println("gif me id");
							id = s.nextInt();
							i = -1;
							}
						}
		
					for(int j = 0; j < rooms.length; j++) {
						if(rooms[j].id == 0) {
							
							a = j;
							
							break;
						}
					}
				
				System.out.println("give me price");
				double price = s.nextDouble();
				
				System.out.println("give me floor");
				int floor = s.nextInt();
				
				System.out.println("give me size");
				String size = s.next();
				isDone = true;
				rooms[a] = new SuperiorRoom(price, floor, id, size);
				
				((SuperiorRoom) rooms[a]).setAmenities(new Amenity());
				System.out.println("id "+ rooms[a].getId());
				System.out.println("Press any number to continue");
				
				
			
	           }else {System.out.println("Wrong Input");}
					
			
	    //Create a new Client        
		}else if(myInt == 3) {
			int b = 0;
			System.out.println("gif me id");
			int id = s.nextInt();
									
			System.out.println("give me Full Name");
			String fullName = s.next();			
		      			
			System.out.println("give me Address");
			String address = s.next();
			
			System.out.println("give me Phone Number");
			int phoneNumber = s.nextInt();
			
			for(int i = 0; i < clients.length; i++) {
				if(clients[i].cId == id) {
					if(fullName != clients[i].fullName) {
						for(int j=0; j < clients.length; j++) {
							if(clients[j].cId == 0) {
								b = j;
								clients[b] = new Client(id , fullName , address , phoneNumber);
								System.out.println("something1");														
								break;
							}
						}
						break;
					}else{
						System.out.println("something");						
						break;
					}					
				}				
			}
			System.out.println("press any Number to continue");
			//Book A room by checking if there is an available room for the date given
		}else if(myInt == 4) {
			int dwmatio = 0;
			int extra = 0;
			int pelatis = 0;
			SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
			System.out.println("give me check-in date like dd-mm-yyyy");
			String checkInDate = s.next();
			
			
			System.out.println("give me check-out date like dd-mm-yyyy");
			String checkOutDate = s.next();
			
			System.out.println("give me Client ID");
			int cid = s.nextInt();
			for(int j=0; j < clients.length; j++) {
				if(cid == clients[j].cId) {
					pelatis = j;
				}
			}
			
			System.out.println("give me Amenity ID, press 0 for no amenities");
			int aId = s.nextInt();
			for(int j=0; j < aArray.length; j++) {
				if(aId == aArray[j].ucode) {
					extra = j;
				}
			}
			
			
			
			for(int i=0; i < reservations.length; i++) {
			  if(reservations[i].checkIn != null && reservations[i].checkOut != null) {
				if((date.parse(checkInDate).after(date.parse(reservations[i].checkOut)) && date.parse(checkOutDate).after(date.parse(checkInDate))) || (date.parse(checkInDate).before(date.parse(checkOutDate)) && date.parse(checkOutDate).before(date.parse(reservations[i].checkIn))))
				{
					
					System.out.println("Available room: " + rooms[i].id);
					
				}else{
					System.out.println("there is no room available");
				}
			  }else {
				  System.out.println("Available room: " + rooms[i].id);
				  if(rooms[i].id == 0) {
					  break;
				  }
			  }
			  
			}
			
			System.out.println("choose room ID, choose 0 if no room is available");
			int resid = s.nextInt();
			for(int j=0; j< rooms.length; j++) {
				if(resid == rooms[j].id && resid != 0) {
					dwmatio = j;
					break;
				}
			}
			System.out.println("give me discount");
			int discount = s.nextInt();
			System.out.println("reservation ID is " + resid);
		    int kratisi = 0;
			
			if(resid != 0) {
				if(aId !=0) {
					for(int i=0; i < reservations.length; i++) {
						if(reservations[i].rId == 0) {							
							kratisi = i;
							break;
						}
					}
				}else {
					for(int i=0; i < reservations.length; i++) {
						if(reservations[i].rId == 0) {
						    kratisi = i;
						    break;
						}
							
					}
				}
			}
			if(aId != 0) {
				reservations[kratisi] = new Reservation(resid, rooms[dwmatio], aArray[extra],clients[pelatis], checkInDate, checkOutDate,discount);
				
			}else {
				reservations[kratisi] = new Reservation(resid, rooms[dwmatio], null,clients[cid], checkInDate, checkOutDate,discount);
			}
			System.out.println("Press any number to continue");
			myInt = s.nextInt();
			
			
		//Delete a Reservation object by giving the reservation id	
		}else if(myInt == 5) {
			System.out.println("give me reservation ID you want to cancel");
			int reservationID = s.nextInt();
			for(int i = 0; i < reservations.length; i++) {
				if(reservations[i].rId == reservationID) {
					reservations[i] = new Reservation( 0 , null, null, null, null , null, 0.0);
					break;
					
				}
			}
			System.out.println("Press any number to continue");
			myInt = s.nextInt();
			//Check if the room is a Superior Room object an then order an amenity by giving the amenity id
		}else if(myInt == 6) {
			int extratwo = 0;
			System.out.println("give me reservation ID");
			int reID = s.nextInt();
			for(int i = 0; i < reservations.length; i++) {
				if(reservations[i].rId == reID && (reservations[i].room instanceof SuperiorRoom)) {
					System.out.println("give me amenity ID");
					int amID = s.nextInt();
					for(int j=0; j < aArray.length; j++) {
						if(amID == aArray[j].ucode) {
							extratwo = j;
						}
					}
					reservations[i].amenity = aArray[extratwo];
					break;
				}
			}
			System.out.println("Press any number to continue");
			myInt = s.nextInt();
		//Check the available rooms
		}else if(myInt == 7) {
			SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
			System.out.println("give me check-in date like dd-mm-yyyy");
			String checkInDate = s.next();
			
			
			System.out.println("give me check-out date like dd-mm-yyyy");
			String checkOutDate = s.next();
			
			for(int i=0; i < reservations.length; i++) {
				
				  if(reservations[i].checkIn != null && reservations[i].checkOut != null) {
					if((date.parse(checkInDate).after(date.parse(reservations[i].checkOut)) && date.parse(checkOutDate).after(date.parse(checkInDate))) || (date.parse(checkInDate).before(date.parse(checkOutDate)) && date.parse(checkOutDate).before(date.parse(reservations[i].checkIn))))
					{
						
						System.out.println("Available room: " + rooms[i].id);
						
					}else{
						System.out.println("there is no room available");
					}
				  }else {
					  System.out.println("Available room: " + rooms[i].id);
					  if(rooms[i].id == 0) {
						  break;
					  }
				  }
			}
		}
		myInt = s.nextInt();
		}while (myInt != 0);
		
	} //end of main
	
	
}
