package com.taurus.financeapi.modules.spent.repository;

import com.taurus.financeapi.modules.spent.model.Spent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SpentRepository extends JpaRepository<Spent, Integer> {
    List<Spent> findByNameIgnoreCaseContaining(String name);
    List<Spent> findByCategoryId(Integer id);
    List<Spent> findByUserIdOrderByCreatedAtDesc(Integer idUser);
    Boolean existsByCategoryId(Integer categoryId);

    @Query(value = "SELECT SUM(s.value) FROM Spent s WHERE s.fk_user = ?1", nativeQuery = true)
    public Double sumSpentfindByUserId(Integer id);

    @Query(value = "SELECT SUM(s.value) FROM Spent s WHERE s.fk_category = ?1 AND s.fk_user = ?2", nativeQuery = true)
    public Double sumSpentfindByCategoryIdAndUserId(Integer categoryId, Integer userId);

    public Integer countSpentByUserId(Integer idUSer);
}
