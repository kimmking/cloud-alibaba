package org.sukerin.shardingjdbc;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * @author sukerin
 */
//@Configuration
//@EnableTransactionManagement
public class TransactionConfigurator {
//    @Bean
    public PlatformTransactionManager txManager(final DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
