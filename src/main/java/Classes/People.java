package Classes;

import java.util.ArrayList;
import java.util.Iterator;

public class People <E extends Person> implements Iterable<E>{
    ArrayList<E> listOfPeople = new ArrayList<>();

    public People() {
    }

    public void addPerson(E person) {
        listOfPeople.add(person);
    }

    public E findById(long id) {
        for(int i = 0; i<listOfPeople.size();i++){
            if(listOfPeople.get(i).getId() == id){
                return listOfPeople.get(i);
            }
        }
        return null;
    }

    public boolean contains(Person person) {
        return listOfPeople.contains(person);
    }

    public void remove(Person person) {
        listOfPeople.remove(person);
    }

    public void remove(long id) {
        for (Person person : listOfPeople) {
            if (person.getId() == id) {
                listOfPeople.remove(person);
                break;
            }
        }
    }

    public void removeAll() {
        listOfPeople.clear();
    }

    public double count() {
        return listOfPeople.size();
    }

    public Person[] toArray() {
        Person[] peopleArray = new Person[listOfPeople.size()];
        for (int i = 0; i < listOfPeople.size(); i++) {
            peopleArray[i] = listOfPeople.get(i);
        }
        return peopleArray;
    }

    @Override
    public Iterator<E> iterator() {
        return listOfPeople.iterator();
    }
    //dfdf

}
