import java.io.PrintWriter;
import java.util.LinkedList;

public class Queue<T> {
	
	protected LinkedList<T> file;
	
	public Queue(){
		file=new LinkedList<T>();
	}

	public boolean isEmpty() {
		return file.isEmpty();
	}
	
	public void enqueue(T elt) { // permet de placer un élément dans la file
		file.add(elt);
	}
	
	public T peek() { // permet d'obtenir l'élément en tête de la file sans le retirer
		return file.get(0);
	}
	
	public T dequeue() { // qui permet de retirer l'élément en tête de file
		return file.remove(0);
	}
	
	public void printOn(PrintWriter out) { // imprime le contenu de la file sur le flux de sortie passé en paramètre
		for(int i=0;i<file.size();i++) {
			out.print(file.get(i)+" - ");
		}
		out.flush();
		//out.close();
	}
	
}
