package week3;

public interface IDatabase<T> {
	boolean save(T item);
	T readFirstRecord();
	

}
