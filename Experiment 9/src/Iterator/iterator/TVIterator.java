package Iterator.iterator;

public interface TVIterator {
    void setChannel(int i);
	void next();
	void previous();
	void last();
	boolean hasNext();
	Object currentChannel();
    boolean hasPrev();
    
}
