package cz.packaroo;


//Funkce, které chci, aby LIFO mělo. Tento interface je sice zbytečný, ale zase neuškodí, pokud bych chtěl někdy dělat nějaké jiné LIFO.
public interface ILIFO<E> {
    void push(E value);
    E pop();
}
