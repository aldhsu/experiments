import java.awt.*;

class PointTester {
	public static void main(String[] args) {
		Point object1 = new Point(11,22);
		Point3D object2 = new Point3D(7,6,24);
		int newx = 4;
		int newy = 13;
		int newz = 25;
		int trx = -10;
		int tray = 10;
		int trz = 15;
		System.out.println("THe 2D point is located at(" + object1.x + ", " + object1.y + ")");
		System.out.println("THe 2D point is moving to" + newx + "," + newy);
		object1.move(newx,newy);
		System.out.println("THe 2D point is located at(" + object1.x + ", " + object1.y + ")");
		System.out.println("THe 2D point is being moved by" + trx + "," + tray);
		object1.translate(trx, tray);
		System.out.println("THe 2D point is located at(" + object1.x + ", " + object1.y + ")");
		
		System.out.println("THe 3D point is located at(" + object2.x + ", " + object2.y + "," +object2.z + ")");
		System.out.println("THe 3D point is moving to" + newx + "," + newy + "," + newz);
		object2.move(newx,newy,newz);
		System.out.println("THe 3D point is located at(" + object2.x + ", " + object2.y + "," +object2.z +")");
		System.out.println("THe 3D point is being moved by" + trx + "," + tray + "," + trz);
		object2.translate(trx, tray,trz);
		System.out.println("THe 3D point is located at(" + object2.x + ", " + object2.y + "," + object2.z + ")");
	}
}