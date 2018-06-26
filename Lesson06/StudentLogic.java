package by.epam.jb25.Lesson06;

public class StudentLogic {
	public double getAvrMark(Student st) {
		double avr = 0;

		for (double d : st.getMarks()) {
			avr = avr + d;
		}

		avr = avr / st.getCountOfMarks();

		return avr;

}}
