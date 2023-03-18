
package Seminar_6.models;

public interface Persister<T>{
    void save(T t);
}