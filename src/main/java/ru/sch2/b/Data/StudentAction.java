package ru.sch2.b.Data;

import org.springframework.data.repository.CrudRepository;

/* Мы можем работать с этой сущностью */
/* CRUD операции
* Create
* Read
* Update
* Delete
* */
public interface StudentAction extends CrudRepository<Student,Integer> {

}
