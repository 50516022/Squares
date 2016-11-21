// y=3.6071x+1.4786
package squares;

public class Squares_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x[] = {0.0, 0.2, 0.4, 0.6, 0.8, 1.0, 1.2 };
		double y[] = {1.4, 2.6, 2.9, 3.4, 4.0, 5.1, 6.1 };
		double theta[] = new double[2];
		Squares_lib slib = new Squares_lib(x,y);
		
		for(int i=0;i<100;i++){
			theta = slib.getDx();
			System.out.println(i+":theta[0]="+theta[0]);
			System.out.println(i+":theta[1]="+theta[1]);
			System.out.println(i+":Objective function="+slib.getRx());
		}
	}

}
