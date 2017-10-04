import java.util.Random;

public class NetflixMovie {
	public static void main(String[] args) {
		Random rating = new Random();
		Movie movie = new Movie("The Great Escape", rating.nextInt(6));
		movie.getTicketPrice();
		System.out.println(movie.getTicketPrice());
		Movie movie2 = new Movie("AntBoy", rating.nextInt(6));
		movie2.getTicketPrice();
		System.out.println(movie2.getTicketPrice());
		Movie movie3 = new Movie("Captain America Civil War", rating.nextInt(6));
		movie3.getTicketPrice();
		System.out.println(movie3.getTicketPrice());
		Movie movie4 = new Movie("Moana", rating.nextInt(6));
		movie4.getTicketPrice();
		System.out.println(movie4.getTicketPrice());
		Movie movie5 = new Movie("White Chicks", rating.nextInt(6));
		movie5.getTicketPrice();
		System.out.println(movie5.getTicketPrice());
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(movie);
		queue.addMovie(movie2);
		queue.addMovie(movie3);
		queue.addMovie(movie4);
		queue.addMovie(movie5);
		queue.sortMoviesByRating();
		queue.printMovies();
		System.out.println("The best movie is " + queue.getBestMovie());
		System.out.println("The second best movie is " + queue.getSecondBestMovie());

	}
}
