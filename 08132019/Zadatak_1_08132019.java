package cetvrtanedelja;

public class Zadatak_1_08132019 {

	public static void main(String[] args) {
		int z=4,x=9,c=7;
		z=++x; // x se uvecava na 10 i unosi u kucicu z i postaje 10
		c=--z + ++x; // z postaje 9,x postaje 11,c je zbir, odnosno 20
		x=c-- - --z; // z postaje 8,oduzima se od c i smesta u x=12,c smanji na 19
		c=x++ - z--; // c je razlika 4,pa se x uveca na 13 a z smanji na 7
		x=++c + ++z; // c se uveca na 5,z na 8,pa se smesta u x,x=13
		x=--z - --c; // z se manji na 7,c na 4,x je razlika 3
		c=x-- + z--; // zbir se smesti u c=10,x se smanji na 2,z na 6
	
		

}
}