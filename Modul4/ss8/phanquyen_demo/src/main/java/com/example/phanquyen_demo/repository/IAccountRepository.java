package com.example.phanquyen_demo.repository;

import com.example.phanquyen_demo.model.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;

@Repository
public interface IAccountRepository extends JpaRepository<Account,Integer> {
    @Query(nativeQuery = true,value = "select ac.* from account ac where username = :username limit 1")
    Account checkUserAccount(@Param("username") String username);

    //    Account findAccountByNameAccount(String name_account);
    @Query(nativeQuery = true,value = "select ac.* from account ac where email = :email limit 1")
    Account checkPhoneAccount(@Param("phone") String phone);
    @Query(nativeQuery = true,value = "select ac.* from account ac where email = :email limit 1")
    Account checkEmailAccount(@Param("email") String email);

    @Query(nativeQuery = true, value = "select ac.* from account ac join role r on ac.role_id = r.id where ac.username like concat('%',:username,'%') and (ac.role_id = :role_id or :role_id = -1)",
            countQuery = "select count(*) from (select ac.* from account ac join role r on ac.role_id = r.id where ac.username like concat('%',:username,'%') and (ac.role_id = :role_id or :role_id = -1)) temp")
     Page<Account> getAllAccountPage(Pageable pageable, @Param("username") String username, @Param("role_id") Integer role_id);

    //    @Query("select a from Account a join Role r on a.role.id = r.id where a.username = :#{#username} ")
//    Account findByAccountName(@Param("username") String username);
    Account findByUsername(String userName);

    @Query(value = "select * from account a where a.username like :name",nativeQuery = true)
    Account getUserInforByUserName(@Param("name") String name);
}
