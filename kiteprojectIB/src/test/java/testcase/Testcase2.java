package testcase;


public class Testcase2 {
	static String Player1="KL. Rahul";
	static String player2="M. Agrawal";
	static String Player3="C.Pujara";
	static String Player4="V. Kohli";
	
public void Score(int run,int ball,int boundary,int six) {
	System.out.println("Runs="+run);
	System.out.println("Ball="+ball);
	System.out.println("boundary="+boundary);
	System.out.println("six="+six);
}	
 
public float Firstinn(float a,float b) {
	float c= a/b;
	return c;
}

public static void main(String[] args) {
	System.out.println("1st inn batting card ");
	System.out.println();
	System.out.println(Player1);
    Main ref=new Main();
	ref.Score(12, 35,1,0);
	System.out.println("strick rate="+ref.Firstinn(12,35));
	System.out.println();
	System.out.println(player2);
	ref.Score(15, 35, 3, 0);
	System.out.println("strick rate="+ref.Firstinn(15,35));
	System.out.println();
	System.out.println(Player3);
	ref.Score(43, 77, 7, 0);
	System.out.println("strick rate="+ref.Firstinn(43,77));
	System.out.println();
	System.out.println(Player4);
	ref.Score(79,201,12,1);
	System.out.println("strick rate="+ref.Firstinn(79,201));
	System.out.println();
}
}


}
