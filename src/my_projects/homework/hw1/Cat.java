package my_projects.homework.hw1;

import java.util.Objects;

public class Cat {
    private String name;
    private String character;

    public Cat (String name, String character) {
        this.name = name;
        this.character = character;
    }

    //Конструктор с 1 входным параметром.
    // Тут создается копия объекта типа Cat,
    // через передачу новому объекту тех же параметров и их значений,
    // что и у текущего объекта
    public Cat (Cat cat) {
        this.name = cat.getName();
        this.character = cat.getCharacter();
    }

    public String getName() {
        return name;
    }

    public String getCharacter() {
        return character;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    //Переопределяем toString у Cat
    @Override
    public String toString() {
        return name + " " + character;
    }

    //Если не переопределить equals у Cat,то в CatsConstructor не сможем корректно сравнить поле person ->
    //equals в CatsConstructor не сработает
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cat cat = (Cat) obj;
        return Objects.equals(name, cat.name)
                && Objects.equals(character, cat.character);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, character);
    }

}
