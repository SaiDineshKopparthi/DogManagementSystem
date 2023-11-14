/**
 * 
 */
package com.kopparthiClasses.DMS.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kopparthiClasses.DMS.Models.Dog;

/**
 * @author Sai Dinesh Kopparthi
 * Nov 12, 2023
 */
public interface DogRepository extends CrudRepository<Dog, Integer>{

	List<Dog> findByName(String name);
}
