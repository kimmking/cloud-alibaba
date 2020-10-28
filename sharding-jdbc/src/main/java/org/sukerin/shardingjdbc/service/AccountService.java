package org.sukerin.shardingjdbc.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.sukerin.shardingjdbc.dao.Account;
import org.sukerin.shardingjdbc.dao.AccountDao;

/**
 * @author sukerin
 */
@Service
public class AccountService extends ServiceImpl<AccountDao, Account> {

    @Transactional
    public void insertTest(Integer userNo){
        Account account1 = new Account();
        account1.setUser_no(userNo);
        save(account1);
    }
}
