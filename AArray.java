package cz.packaroo;


//Abstraktní třída, která mi říká, že každý potomek musí mít value a tyto dva konstruktory.
//Neexistuje provedení LIFA ani FIFA, kde prostě nebudu mít vlastní hodnotu toho, co chci udržet.
//AArray(E value) je taky nadbytečný, ale to jsem si uvědomil až moc pozdě :)
public abstract class AArray<E> {
    protected E value;

    protected AArray(){
        this.value=null;
    }

    protected AArray(E value) {
        this.value = value;
    }
}
