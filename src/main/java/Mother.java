import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.logger.LocalLog;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.DatabaseTable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mother {

    private final static String DATABASE_URL = "jdbc:sqlite:kip.db";
    private Dao<KipAddress, Integer> addressDao;
    private Dao<KipData, Integer> dataDao;
    private String ivb;


    // create an instance of Account
    public static void main(String[] args) throws Exception {
        // turn our static method into an instance of Main
        new Mother().doMain(args);

    }
    private void doMain(String[] args) throws Exception {
        System.setProperty(LocalLog.LOCAL_LOG_LEVEL_PROPERTY, "ERROR");
        //int ivb;
        ConnectionSource connectionSource = null;

        //Вывод данных прибора
        try {
            // create our data-source for the database
            connectionSource = new JdbcConnectionSource(DATABASE_URL);
            addressDao = DaoManager.createDao(connectionSource, KipAddress.class);
            dataDao = DaoManager.createDao(connectionSource, KipData.class);

            // retrieve the data from number

            KipAddress objectus = addressDao.queryForId(1);
            System.out.println("ivb: " + objectus.getIvb());
            System.out.println("Street: " + objectus.getStreet());
            System.out.println("House: " + objectus.getHouse());
            System.out.println("Jeu: " + objectus.getJeu());
            System.out.println("Тип Учёта: " + objectus.getSistema());

            ivb = objectus.getIvb();

        } finally {
            // destroy the data source which should close underlying connections
            if (connectionSource != null) {
                connectionSource.close();
            }
        }


        //Вывод показаний по ИВБ
        try {
            // create our data-source for the database
            connectionSource = new JdbcConnectionSource(DATABASE_URL);
            dataDao = DaoManager.createDao(connectionSource, KipData.class);

            QueryBuilder<KipData, Integer> queryBuilder = dataDao.queryBuilder();
            queryBuilder.where().eq(KipData.IVB_FIELD_NAME, ivb);
            PreparedQuery<KipData> preparedQuery = queryBuilder.prepare();
            List<KipData> accountList = dataDao.query(preparedQuery);
            // retrieve the data from number



            for (KipData v : accountList) {
                System.out.print(("Дата:" + v.getDate()));
                System.out.print((" Время:"+ v.getTime()));
                System.out.print((" Q1:"+ v.getQ1()));
                System.out.print((" Q2:"+ v.getQ2()));
                System.out.print((" V1:"+ v.getV1()));
                System.out.print((" V2:"+ v.getV2()));
                System.out.print((" G1:"+ v.getG1()));
                System.out.print((" G2:"+ v.getG2()));
                System.out.print((" T1:"+ v.getT1()));
                System.out.print((" T2:"+ v.getT2()));
                System.out.print((" T3:"+ v.getT3()));
                System.out.print((" Tp:"+ v.getTw()+ "\n"));
            }

        } finally {
            // destroy the data source which should close underlying connections
            if (connectionSource != null) {
                connectionSource.close();
            }
        }



    }
}


