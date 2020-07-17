package lang_package;

public class MemoryDemo {
	public static void main(String args[])
	{
		Runtime r = Runtime.getRuntime();
		long mem1 , mem2;
		Integer someints[]= new Integer[10000];
		System.out.println("Total memory :" +r.totalMemory());
		mem1 = r.freeMemory();
		System.out.println("Initial free meomry : " +mem1);
		r.gc();
		mem1 = r.freeMemory();
		System.out.println("Free memory after garbage collection" +mem1);
		for(int i = 0; i<10000;i++)
			someints[i]= new Integer(i);
		mem2 = r.freeMemory()
;
		System.out.println("Free memory after alocation:"+mem2);
		System.out.println("Memory used by alocation :" +mem2);
		for(int i=0;i<10000;i++)
			someints[i]=null;
		r.gc();
		mem2 = r.freeMemory();
		System.out.println("Free memory after collecting" +
" discarded Integers: " + mem2);
		
	}

}
