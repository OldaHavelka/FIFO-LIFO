package cz.packaroo;


//Funkce, které chci, aby FIFO mělo. Tento interface je sice zbytečný, ale zase neuškodí, pokud bych chtěl někdy dělat nějaké jiné FIFO.
public interface IFIFO<E> {
    void enqueue(E value);
    E dequeue();
}
