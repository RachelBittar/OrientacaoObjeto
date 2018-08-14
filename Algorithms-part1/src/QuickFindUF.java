
public class QuickFindUF {

	private int[] array;
	
	public QuickFindUF(int N) {	
		array = new int[N];	
		for(int i=0; i<N; i++) {	
			array[i] = i;
		}
		
	}
	
	public void union(int p, int q) {
		int pid = array[p];
		int qid = array[q];
		
		for(int i=0; i< array.length;i++) {
			if(array[p]==pid)
				array[q]=qid;
		}
	}

	
	public boolean connected (int p, int q) {
			
	return array[p]==array[q];
	
		
	}
	
}
