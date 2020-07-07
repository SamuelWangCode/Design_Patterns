package tongji.yy.DataAccessObject;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoImp implements PersonDao {
    private List<Person>persons;
    public PersonDaoImp(){
        persons=new ArrayList<>();
        persons.add(new Person("Tom",0));
        persons.add(new Person("John",1));
        persons.add(new Person("Cat",1));
    }
    @Override
    public List<Person> getAllPerson() {
        return persons;
    }

    @Override
    public Person getPerson(int id) {
        return (Person) persons.stream().filter((p)->p.getId()==id).toArray()[0];

    }

    @Override
    public void updatePerson(Person p) {
        getPerson(p.getId()).setName(p.getName());
    }

    @Override
    public void deletePerson(Person p) {
        persons.remove(getPerson(p.getId()));
    }
}
