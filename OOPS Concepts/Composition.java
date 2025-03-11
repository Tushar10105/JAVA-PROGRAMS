class Room{
	private String RoomType;
	Room(String RoomType){
		this.RoomType=RoomType;
		}

		void ShowRoomDtls(){
			System.out.println("Room Type: "+RoomType);
			}

	}

	class House{
		private String HouseName;
		private Room R1,R2;
		House(String HouseName,String R1Type,String R2Type){
			this.HouseName=HouseName;
			this.R1=new Room(R1Type);
			this.R2=new Room(R2Type);
			}

			void ShowHouseDtls(){
				System.out.println("HOUSE NAME: "+HouseName);
				R1.ShowRoomDtls();
				R2.ShowRoomDtls();
				}

		}

		public class Composition{
			public static void main(String args[]){
				House obj=new House("DREAM VILLA","Bedroom","Kitchen");
				obj.ShowHouseDtls();
				}
			}