package IteratorDesign;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}