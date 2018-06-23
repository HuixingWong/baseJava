package athletic.sackandquence;

import java.util.LinkedList;
import java.util.Queue;

public class DogCatQueue {

    private Queue<PetEnterQueue> dogQ;
    private Queue<PetEnterQueue> catQ;


    private long count;

    public DogCatQueue() {


        this.dogQ = new LinkedList<>();
        this.catQ = new LinkedList<>();
        this.count = 0;

    }

    public void add(Pet pet) {

        if (pet.getType().equals("dog")) {

            this.dogQ.add(new PetEnterQueue(pet, this.count++));

        } else if (pet.getType().equals("cat")) {

            this.catQ.add(new PetEnterQueue(pet, this.count++));

        } else {

            throw new RuntimeException("this is not cat or dog");
        }

    }

    //理解错误，并不是一下子全部poll出去，而是一次一个，
    //所以导致了刚才不明白怎么让两个queue合并在一起poll的
    public Pet pollAll() {

        if (!this.dogQ.isEmpty() && !this.catQ.isEmpty()) {

            if (this.dogQ.peek().getCount() < this.catQ.peek().getCount()) {

                return this.dogQ.poll().getPet();

            } else {

                return this.catQ.poll().getPet();

            }

        } else if (!this.dogQ.isEmpty()) {

            return this.dogQ.poll().getPet();

        } else if (!this.catQ.isEmpty()) {

            return this.catQ.poll().getPet();

        } else {

            throw new RuntimeException("the queue is empty");
        }

    }


    public Dog pollDog() {

        if (!this.isDogQueueEmpty()) {

            return (Dog) this.dogQ.poll().getPet();


        } else {

            throw new RuntimeException("dog queue is empty");

        }


    }

    public Cat pollCat() {

        if (!this.isCatQueueEmoty()) {

            return (Cat) this.dogQ.poll().getPet();


        } else {

            throw new RuntimeException("cat queue is empty");

        }

    }


    public boolean isEmpty() {

        return this.dogQ.isEmpty() && this.catQ.isEmpty();

    }


    public boolean isDogQueueEmpty() {

        return this.dogQ.isEmpty();

    }

    public boolean isCatQueueEmoty() {

        return this.catQ.isEmpty();
    }


    public static void main(String[] args) {

        DogCatQueue dogCatQueue = new DogCatQueue();

        dogCatQueue.add(new Cat("cat"));
        dogCatQueue.add(new Dog("dog"));

        Pet pet = dogCatQueue.pollAll();
        System.out.println(pet.getType());

        Pet pet1 = dogCatQueue.pollAll();
        System.out.println(pet1.getType());

        Pet pet2 = dogCatQueue.pollAll();
        System.out.println(pet2.getType());


    }

}
