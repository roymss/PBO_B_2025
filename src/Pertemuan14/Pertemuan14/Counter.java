package Pertemuan14;

public class Counter {
	//TUGAS 3
	    static int instanceCount = 0;

	    public Counter() {
	        instanceCount++;
	    }

	    public static int getInstanceCount() {
	        return instanceCount;
	    }

}
