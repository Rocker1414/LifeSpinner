import java.util.Random;

// Michael Gargano
// Chris Rogers
// Game of Life Spinner
// Returns int number with corresponding string color 
public class RandSpin {
	int num = 0;
	public RandSpin() {
		Random rand = new Random();
		num = rand.nextInt(10) + 1;
	}
	public String getColor(){
		if (num == 1 ||num == 6){
			return "yellow";
		}
		if (num == 2 ||num == 7){
			return "red";
		}
		if (num == 3 ||num == 8){
			return "purple";
		}
		if (num == 4 ||num == 9){
			return "green";
		}
		if (num == 5 ||num == 10){
			return "blue";
		}
		else return "error?";
	}
	public int getNum(){
		return num;
	}
}
