package pt.iscte.poo.game;

import objects.Manel;
import objects.Wall;
import objects.DonkeyKong;
import objects.Floor;
import objects.Health;
import objects.Princess;
import objects.Sword;
import objects.Trap;
import objects.Door;
import objects.Stair;


import java.io.File;
import java.util.Scanner;

import pt.iscte.poo.gui.ImageTile;
import pt.iscte.poo.gui.ImageGUI;
import pt.iscte.poo.utils.Point2D;
import pt.iscte.poo.utils.Direction;

public class Room {

	private Point2D heroStartingPosition = new Point2D(0, 8);
	private Point2D princessPosition = new Point2D(9, 0);
	private Point2D donkeyKongPosition = new Point2D(4, 4);
	private Manel manel;
	private Princess princess;
	private DonkeyKong donkeyKong;
	


	public Room() {
		manel = new Manel(heroStartingPosition);
		princess = new Princess(princessPosition);
		donkeyKong = new DonkeyKong(donkeyKongPosition);
		ImageGUI.getInstance().addImage(manel);
		ImageGUI.getInstance().addImage(princess);
		ImageGUI.getInstance().addImage(donkeyKong);

		// readRoom("DonkeyKong_122641_Gabriel_122635_Rui_2024_2025");
		///Users/gabrielgonzaga/Desktop/Projeto_POO_DonkeyKong/Projeto-20241105
		// String nextRoomFile = "room0.txt";
		try {
			Scanner sc = new Scanner(new File("Donkeykong_122641_Gabriel_122635_Rui_2024_2025/rooms/room0.txt"));
			// if (sc.hasNextLine()) {
			// 	 nextRoomFile = sc.nextLine().split(";")[1];
			// }
			for (int i = 0; i < 10; i++) {
				if (sc.hasNextLine()) {
					String line = sc.nextLine();
					for (int j = 0; j < 10; j++) {
						char c = line.charAt(j);

						if(c == 'W'){
							ImageGUI.getInstance().addImage(new Wall(j, i));
						}
						else if(c == ' '){
							ImageGUI.getInstance().addImage(new Floor(j, i));
						}
						else if(c == '0'){
							ImageGUI.getInstance().addImage(new Door(j, i));
						}
						else if(c == 'S'){
							ImageGUI.getInstance().addImage(new Stair(j, i));
						}
						else if(c == 's'){
							ImageGUI.getInstance().addImage(new Floor(j, i));
							ImageGUI.getInstance().addImage(new Sword(j, i));
						}
						else if(c == 't'){
							ImageGUI.getInstance().addImage(new Trap(j, i));
						}
						else if(c == 'H'){
							ImageGUI.getInstance().addImage(new Floor(j, i));
							ImageGUI.getInstance().addImage(new Health(j, i));
						}
						else if(c == 'G'){
							ImageGUI.getInstance().addImage(new Floor(j, i));
							ImageGUI.getInstance().addImage(new DonkeyKong(j, i));
						}
						else if(c == 'P'){
							ImageGUI.getInstance().addImage(new Floor(j, i));
							ImageGUI.getInstance().addImage(new Princess(j, i));
						}
					}
				}
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public void moveManel() {
		manel.move();
	}

	// public void readRoom(String filename) {
	// 	try (Scanner sc = new Scanner(new File(filename + ".txt"))) {
	// 		int y = 0;
	// 		while (sc.hasNextLine()) {
	// 			String line = sc.nextLine();
	// 			for (int i = 0; i < line.length(); i++) {
	// 				char tile = line.charAt(i);
	// 				Point2D position = new Point2D(i, y);
	// 				ImageTile imageTile = createImageTile(tile, position);
	// 				if (imageTile != null) {
	// 					ImageGUI.getInstance().addImage(imageTile);
	// 				}
	// 			}
	// 			y++;
	// 		}
	// 	} catch (Exception e) {
	// 		e.printStackTrace();
	// 	}
	// }

	// public ImageTile createImageTile(char tile, Point2D position) {
	// 	switch (tile) {
	// 		case 'W':
	// 			return new Wall(position.getX(), position.getY());
	// 		case 'S':
	// 			return new Stair(position);
	// 		case 's':
	// 			return new Sword(position);
	// 		case 't':
	// 			return new Trap(position);
	// 		case 'H':
	// 			return new Health(position);
	// 		case 'G':
	// 			return new DonkeyKong(position);
	// 		case 'P':
	// 			return new Princess(position);
	// 		case '0':
	// 			return new Door(position);
	// 		default:
	// 			return new Floor(position.getX(), position.getY());
	// 	}
	// }
}


