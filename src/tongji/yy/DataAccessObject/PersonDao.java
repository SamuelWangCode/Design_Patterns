package tongji.yy.DataAccessObject;

import java.util.List;

public interface PersonDao {
    public List<Person> getAllPerson();
    public Person getPerson(int id);
    public void updatePerson(Person p);
    public void deletePerson(Person p);

}
