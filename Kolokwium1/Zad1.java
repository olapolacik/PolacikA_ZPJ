interface MyIterator {
    
    boolean hasPrevious();
    boolean hasNext();
    int getNext();
    int getPrevious();
}

class Zad1 implements MyIterator {
    private int[] tab; 
    private int currentIdx;

    public Zad1(int[] tab) {
        this.tab = tab;
        this.currentIdx = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIdx < tab.length;
    }

    @Override
    public int getNext() {
        return tab[currentIdx++];
    }

    @Override
    public boolean hasPrevious() {
        return currentIdx > 0;
    }

    @Override
    public int getPrevious() {
        return tab[--currentIdx];
    }
}


