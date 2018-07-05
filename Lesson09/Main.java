package by.epam.jb25.Lesson09;

public class Main {

	public static void main(String[] args) {
		PrintedEdition pe = new PrintedEdition("Hamlet", 2015, 50, "London");
		Book b = new Book("Java Basics", 2016, 120, "Minsk", "Technical",
				"18+");
		Magazine m = new Magazine("Burda", 2017, 5, "Minsk", "Fassion",
				"21+", "Y");
		Newspaper n = new Newspaper("New York Times", 2018, 1,
				"Herald Tribune", "Economic", "18", "Y", "Yes)");

		System.out.println(pe.toString());
		System.out.println("-----------");
		System.out.println("Edition Title: " + b.getEditionTitle()
				+ " | Published: " + b.getPublished() + " | Price: "
				+ b.getPrice() + " | PublishingRegion: "
				+ b.getPublishingRegion() + " | Specialization: "
				+ b.getSpecialization() + " | AgeCategoty: "
				+ b.getAgeCategoty());
		System.out.println(b.toString());
		System.out.println();
		System.out.println("Edition Title: " + m.getEditionTitle()
				+ " | Published: " + m.getPublished() + " | Price: "
				+ m.getPrice() + " | PublishingRegion: "
				+ m.getPublishingRegion() + " | Specialization: "
				+ m.getSpecialization() + " | AgeCategoty: "
				+ m.getAgeCategoty() + " | isPeriodical: "
				+ m.getisPeriodical());
		System.out.println(m.toString());
		System.out.println();
		System.out.println("Edition Title: " + n.getEditionTitle()
				+ " | Published: " + n.getPublished() + " | Price: "
				+ n.getPrice() + " | PublishingRegion: "
				+ n.getPublishingRegion() + " | Specialization: "
				+ n.getSpecialization() + " | AgeCategoty: "
				+ n.getAgeCategoty() + " | isPeriodical: "
				+ n.getisPeriodical() + " |it is News: "
				+ n.getisNews());
		System.out.println(n.toString());

	}

}
