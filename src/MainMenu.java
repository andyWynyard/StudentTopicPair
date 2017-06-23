import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * To create list of topics that Students
 * will be assigned to
 * @author andyWynyard
 *
 */

public class MainMenu {

	Topics topics = new Topics();
	Students students = new Students();
	List<Students> studentList = new ArrayList<Students>();
	List<Topics> topicList = new ArrayList<Topics>();

	public void menu() {

		boolean enterMore = true;
		Scanner keyboard = new Scanner(System.in);

		do {
			System.out.print("Menu: " + "\n1. Add a topic:" + "\n2. Add a student: " + "\n3. Print assignment");
			String choice = keyboard.next();
			switch (choice) {
			case "1":
				addTopic();
				break;
			case "2":
				addStudent();
				break;
			case "3":
				printAssignment();
				break;
			case "4":

			}
		} while (enterMore == true);

	}

	private void printAssignment() {
		// List<List<String>> studentsAndTopics = new ArrayList<>();
		//
		// int topicLength = topics.getTopics().size();
		// int studentLength = students.getStudents().size();
		//
		// int topPerStud = topicLength / studentLength;
		//
		// for (int i = 0; i < studentLength; i++) {
		// for (int j = 0; j < topPerStud; j++) {
		// String s = students.getStudents().remove(i);
		// students.getStudents().add(s);
		// studentsAndTopics.add(i, students.getStudents());
		// }
		// }
		System.out.println(studentList.size());
		System.out.println(topicList.size());
		int counter = 0;
		for (int i = 0; i < topicList.size(); i++) {
			if (counter != studentList.size()) {
				studentList.get(counter).addTopic(topicList.get(i));
				counter++;
			} else {
				counter = 0;
				studentList.get(counter).addTopic(topicList.get(i));
			}
		}

		for (Students students : studentList) {
			for (Topics topic : students.getTopics()) {
				System.out.println(students.getName() + ": " + topic.getTopicName());
			}
		}

	}

	public void addStudent() {
		boolean choice = true;
		do {
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter student name: ");
			String name = keyboard.next();
			Students s = new Students();
			s.setName(name);
			studentList.add(s);
			System.out.println("Add another student (Y/N): ");
			String entry = keyboard.next();
			if (entry.equalsIgnoreCase("N")) {
				choice = false;

			}
		} while (choice == true);

	}

	public void addTopic() {

		boolean choice = true;
		do {
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter topic: ");
			String topicName = keyboard.next();
			Topics topics = new Topics();
			topics.setTopicName(topicName);
			topicList.add(topics);
			System.out.println(topicList.size());
			System.out.println("Add another Topic (Y/N): ");
			String entry = keyboard.next();
			if (entry.equalsIgnoreCase("N")) {
				choice = false;

			}
		} while (choice == true);

	}
}
