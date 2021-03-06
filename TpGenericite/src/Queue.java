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
	
	public void enqueue(T elt) { // permet de placer un �l�ment dans la file
		file.add(elt);
	}
	
	public T peek() { // permet d'obtenir l'�l�ment en t�te de la file sans le retirer
		return file.get(0);
	}
	
	public T dequeue() { // qui permet de retirer l'�l�ment en t�te de file
		return file.remove(0);
	}
	
	public void printOn(PrintWriter out) { // imprime le contenu de la file sur le flux de sortie pass� en param�tre
		for(int i=0;i<file.size();i++) {
			out.print(file.get(i)+" - ");
		}
		out.flush();
		//out.close();
	}
	
}
