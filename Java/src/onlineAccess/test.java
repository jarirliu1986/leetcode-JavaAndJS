package onlineAccess;
class color{
	int value;
	color(int x){
		this.value = x;
	}
	public int getvalue(){
		return this.value;
	}
}

public class test {
	public static int question(int x){
		int i = 0;
		while(x != 0){
			x = x &(x-1);
			i++;
		}
		
		return i;
	}

	public static void main(String[] args) {
		color[] colors = new color[5];
		for(int i=0; i<=4; i++){
			colors[i] = new color(i);
			System.out.println(colors[i].getvalue());
		}
		color t = colors[1];
		colors[1] = colors[4];
		colors[4] = t;
		System.out.println(colors[1].getvalue());
	}

}
