package cz.packaroo;

public class Main {

    public static void main(String[] args) {
        LIFO lifo = new LIFO(5);
        System.out.println(lifo.pop());
        System.out.println(lifo.pop());
        System.out.println("-=-=-=-=-=-=-=-=-=-");
        lifo.push("job.");
        lifo.push("a ");
        lifo.push("need ");
        lifo.push("really ");
        lifo.push("I ");
        for(int i=0; i<5; i++){System.out.print(lifo.pop());}
        System.out.println("\n-=-=-=-=-=-=-=-=-=-");
        FIFO fifo = new FIFO(6);
        System.out.println(fifo.dequeue());
        System.out.println(fifo.dequeue());
        System.out.println("-=-=-=-=-=-=-=-=-=-");
        fifo.enqueue("Living ");
        fifo.enqueue("is ");
        fifo.enqueue("expensive.");
        for(int i=0; i<3; i++){System.out.print(fifo.dequeue());}
    }
}
