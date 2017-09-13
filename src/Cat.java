public class Cat {
	private int legs;
	private String name;
	private int lives = 9;

	Cat(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}

	void meow() {
		System.out.println("Meeeeeooooooooooowwwwwwwww!!");
	}
	void legs() {
		System.out.println(legs);
	}

	public void printName() {
		if (name == null)
			System.out.println("I don't know my own name!");
		else
			System.out.println("My name is " + name);
	}

	void kill() {
		lives--;
		if (lives > 0)
			System.out.println("Nice try, but I still have " + lives + " lives left");
		else if (lives < 0)
			System.out.println("That's overkill yo!");
		else
			System.out.println("DEAD CAT :(");
	}

	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */
		Cat fluffy = new Cat("fluffy", 4);
		
		// 1. Make the Cat meow
		fluffy.meow();
		// 2. Get the Cat to print it's name
		fluffy.printName();
		fluffy.legs();
		// 3. Kill the Cat!
		fluffy.kill();
		
	}
}
