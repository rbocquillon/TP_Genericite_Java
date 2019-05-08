
public class PrioritizedQueue<T extends Comparable<T>> extends Queue<T> {
	
	public PrioritizedQueue(){
		super();
	}
	
	@Override
	public void enqueue(T elt) { //placer un �l�ment dans la file selon sa priorit�
		boolean HasBeenAppened = false;
		if(this.isEmpty()) {
			this.file.addFirst(elt);
		}
		else {
			for(int i=0;i<this.file.size();i++) {
				if(elt.compareTo(file.get(i))>0) {
					this.file.add(i,elt);
					HasBeenAppened = true ;
					break;
				}
			}
			if(!HasBeenAppened) {
				file.add(elt);
			}
		}
	}
	
}
