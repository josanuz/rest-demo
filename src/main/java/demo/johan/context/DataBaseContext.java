package demo.johan.context;

import org.apache.tomcat.jdbc.pool.PoolProperties;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by User on 16/9/2016.
 */
@Configuration
public class DataBaseContext {

//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource dataSource(){
//        return DataSourceBuilder.create().build();
//    }

    @Bean
    public DataSource dataSource(){
        PoolProperties poolProperties = new PoolProperties();
        poolProperties.setMaxActive(1);
        poolProperties.setMaxIdle(1);
        poolProperties.setMaxWait(1);
        poolProperties.setTestOnBorrow(true);
        poolProperties.setValidationQuery("SELECT 1");
        org.apache.tomcat.jdbc.pool.DataSource ds = new org.apache.tomcat.jdbc.pool.DataSource(poolProperties);
        ds.setUrl("jdbc:postgresql://elmer.db.elephantsql.com:5432/tdadlwvw");
        ds.setUsername("tdadlwvw");
        ds.setPassword("DwerGs6cQ5Anqhc3NgEuHUUAEVzSX2_k");
        ds.setInitialSize(1);
        ds.setDriverClassName("org.postgresql.Driver");
        return ds;
    }
}
