package lec03;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        try {
            Class.forName(("org.h2.Driver"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } try (Connection connection = DriverManager.getConnection("jdbc:h2:~/h2db/lecture;Mode=PostgreSQL;　AUTO_SERVER=TRUE;", "設定したユーザー名", "設定したパスワード"); Statement statement=connection.createStatement()){
            ScriptEngine engine = new ScriptEngineManager().getEngineByName("js");

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

}
