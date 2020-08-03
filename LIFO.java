package cz.packaroo;

public class LIFO<E> extends AArray implements ILIFO {

    private LIFO previous;

    public LIFO(){  //Vytváří stack
        super();
        this.previous=null;
    }

    public LIFO(E value) {  //Vytváří stack a vlkládá na dno první hodnotu
        super(value);
        this.previous=null;
    }

    private LIFO(E value, LIFO previous){  //Vlastní položka, která se přidá na vrchol stacku
        super(value);
        this.previous=previous;
    }

    @Override
    public void push(Object value) {  //Přidá na vrchol zásobníku hodnotu
        this.previous=new LIFO(this.value, this.previous);
        this.value=value;
    }

    @Override
    public Object pop() {  //Přečte a odebere z vrcholu zásobníku hodnotu
        Object returnable = this.value;
        if(this.previous!=null){
            this.value=this.previous.value;
            this.previous=this.previous.previous;
        }else{  //Pokud se nacházíme na dně a přečteme hodnotu, tak taky zmizí. Dále je stack "plný" hodnoty null.
            this.value=null;
        }
        return returnable;
    }
}
