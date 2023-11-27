package core;

public interface IStack {

	int getSize() ;
	boolean isEmpty() ;
	void push(Object elm) throws Exception;
	boolean isFull(); 
	Object top();
	Object pop() throws Exception;
	

}
