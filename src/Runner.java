
public class Runner {
	public static void main(String[] args) {
		SeaCreature Spongebob = new SeaCreature("Spongebob");
		SeaCreature Patrick = new SeaCreature("Patrick");
		SeaCreature Squidward = new SeaCreature("Squidward");
		Spongebob.eat();
		Spongebob.laugh();
		System.out.println("Patrick");
		Patrick.eat();
		Patrick.laugh();
		System.out.println("Squidward");
		Squidward.eat();
		Squidward.laugh();
	}
}
