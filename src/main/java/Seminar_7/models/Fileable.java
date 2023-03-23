package Seminar_7.models;

public interface Fileable<T> {
    T read();

    void save(T t);
}