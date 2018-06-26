package by.epam.jb25.Lesson06;

public class Group {
	private Student[] students;

	private int countOfStudents = 0;

	public Group(int groupSize) {
		students = new Student[groupSize];
	}

	public boolean add(Student st) {
		if (countOfStudents >= students.length) {
			return false;
		}

		students[countOfStudents] = st;//
		countOfStudents++;
		return true;
	}

	public Student[] getStudents() {
		
		return students;
	}

	public int getCountOfStudents() {
		// TODO Auto-generated method stub
		return countOfStudents;
	}




	}

