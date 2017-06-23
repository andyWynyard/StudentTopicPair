import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * To create list of topics that Students
 * will be assigned to
 * @author andyWynyard
 *
 */

public class Topics {
	private String topicName;
	private List<String> topics = new ArrayList<>();

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
		
	}
	

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public Topics(String topicName, List<String> topics) {
		super();
		this.topicName = topicName;
		this.topics = topics;
	}

	public Topics() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public void addTopic() {
//
//		MainMenu menu = new MainMenu();
//		boolean choice = true;
//		do {
//			Scanner keyboard = new Scanner(System.in);
//			System.out.print("Enter topic: ");
//			topicName = keyboard.next();
//			topics.add(topicName);
//			System.out.println("Add another Topic (Y/N): ");
//			String entry = keyboard.next();
//			if (entry.equalsIgnoreCase("N")) {
//				choice = false;
//				menu.menu();
//
//			}
//		} while (choice == true);
//
//	}
}
