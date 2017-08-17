package CLASES;

import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;

/**
 *
 * @author AUXPLANTA
 */
public class ConexionPool {
    
    public static DataSource dataSource;    
    private String user = "postgres";
    private String pass = "cdm";
    
    public ConexionPool(){
    BasicDataSource basicDataSource=null;
         if (null==basicDataSource){
             basicDataSource = new BasicDataSource();
             basicDataSource.setDriverClassName("org.postgresql.Driver");
             basicDataSource.setUsername(user);
             basicDataSource.setPassword(pass);
             basicDataSource.setUrl("jdbc:postgresql://localhost:5432/bailaconmigo");
             basicDataSource.setMaxActive(200);
             basicDataSource.setMinIdle(50);
             basicDataSource.setMaxIdle(100);
             dataSource = basicDataSource;
         }
     }

     public DataSource getDataSource(){
         return dataSource;
     }
     
}
