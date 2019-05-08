import java.io.PrintWriter;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		Queue<Integer> FileInt = new Queue<Integer>();
		Queue<String> FileString = new Queue<String>();
		Queue<Calendar> FileCal = new Queue<Calendar>();
		System.out.println(FileInt.isEmpty());
		FileInt.enqueue(23);
		System.out.println(FileInt.isEmpty());
		FileString.enqueue("bonjour"); FileString.enqueue("salut");
		System.out.println(FileString.peek());
		PrintWriter out = new PrintWriter(System.out);
		FileString.printOn(out);
		System.out.println(FileString.dequeue());
		//PrintWriter out2 = new PrintWriter(System.out);
		Calendar cal1 = Calendar.getInstance();
		FileCal.enqueue(cal1);
		//FileCal.printOn(out2);
		//ArrayList<Integer> li = new ArrayList<Integer>();
		//li.add(0,0);li.add(1,1);li.add(2,2);
		//li.add(1,59);
		//System.out.println(li.size());
		Task tache1 = new Task(0,"tache pas importante");
		Task tache2 = new Task(1,"tache pas urgente");
		Task tache3 = new Task(2,"tache a faire");
		Task tache4 = new Task(3,"tache urgente");
		Queue<Task> TrucsAFaire = new PrioritizedQueue<Task>();
		TrucsAFaire.enqueue(tache3);
		TrucsAFaire.enqueue(tache1);
		TrucsAFaire.enqueue(tache4);
		TrucsAFaire.enqueue(tache2);
		TrucsAFaire.enqueue(tache4); //une même tâche peut être présente plusieurs fois
		PrintWriter out3 = new PrintWriter(System.out);
		TrucsAFaire.printOn(out3);
	}

}
