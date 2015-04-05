import java.util.ArrayList;
import java.util.Scanner;


public class Allocation {

	public static ArrayList<Integer>vfs = new ArrayList(0);
	public Scanner input = new Scanner(System.in);
	public void contigousAllocation(String path,int begin,int end){
		File f ;//to get the file to add it to arrayList
		for(int i=begin;i<begin+end;i++){
			vfs.add(i, 1);
		}
	}
	
	public void linkedAllocation(String path,int begin,int end){
		int start = input.nextInt();
		String finish = input.next();
		while(start!=end){
			vfs.add(start,1);
			 start = input.nextInt();
			 finish = input.next();//nil in last input
		}
	}
	public void indexedAllocation(String path ,int index,int begin,int end){
		String blocks = input.nextLine(); //all blocks
		//split blocks
		String []parts = blocks.split(" ");
		int block=0;
		for(int i=0;i<parts.length;i++){
			 block = Integer.parseInt(parts[i]);
			 vfs.add(block,index);//for example add in 1 2 3 4 index 7 
		}
	}
}
