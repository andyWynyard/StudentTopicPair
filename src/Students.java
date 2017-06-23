import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * To create list of topics that Students
 * will be assigned to
 * @author andyWynyard
 *
 */

public class Students {
	private String name;

	private List<Topics> topics = new ArrayList<>();

	public List<Topics> getTopics() {
		return topics;
	}

	public void setTopics(List<Topics> topics) {
		this.topics = topics;
	}

	public void addTopic(Topics topic) {
		topics.add(topic);
	}

	// public void addStudent() {
	// boolean choice = true;
	// do {
	// Scanner keyboard = new Scanner(System.in);
	// System.out.print("Enter student name: ");
	// name = keyboard.next();
	// students.add(name);
	// System.out.println("Add another student (Y/N): ");
	// String entry = keyboard.next();
	// if (entry.equalsIgnoreCase("N")) {
	// choice = false;
	//
	// }
	// } while (choice == true);
	//
	// }

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Students(String name, List<Topics> topics) {
		super();
		this.name = name;
		this.topics = topics;
	}
}
