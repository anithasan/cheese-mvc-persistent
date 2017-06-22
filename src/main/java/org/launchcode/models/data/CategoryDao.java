package org.launchcode.models.data;

import org.launchcode.models.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ANITHASN on 6/20/2017.
 */
public interface CategoryDao extends CrudRepository<Category, Integer> {
}
