package cz.packaroo;

public class FIFO<E> extends AArray implements IFIFO {

    private FIFO previous;

    public FIFO(){  //Vytváří frontu
        super();
        this.previous=null;
    }

    public FIFO(E value) {  //Vytváří frontu a vloží na její začátek hodnotu
        super(value);
        this.previous=null;
    }

    @Override
    public void enqueue(Object value) {  //Vloží do poslední položky fronty hodnotu a vytvoří další prázdnou položku za ní
        FIFO last = this;                //Poslední položka má tedy vždy hodnotu null
        while(last.value!=null){
            last=last.previous;
        }
        last.value=value;
        last.previous=new FIFO();
    }

    @Override
    public Object dequeue() {           //Přečte a vymaže první položku, odkáže na druhou položku
        Object returnable = this.value;
        if(this.previous==null){
            this.value=null;
        }else{
            this.value=this.previous.value;
            this.previous=this.previous.previous;
        }
        return returnable;
    }
}
