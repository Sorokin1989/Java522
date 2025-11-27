package Classwork5;

import java.sql.*;

public class Classwork5 {
    public static void main(String[] args) {

        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("Good");
            String url = "jdbc:mysql://localhost:3306/java522";
            String username = "root";
            String password = "12345";

            try (Connection connection = DriverManager.getConnection(url, username, password)) {
//                Statement statement = connection.createStatement();
//                statement.executeUpdate(); //DROP, CREATE,INSERT,DELETE,UPDATE(CRUD ОПЕРАЦИИ)
//                statement.executeQuery(); //SELECT (TABLE ResultSet)
//                statement.execute();// BOOLEAN

//                String sqlQuery="create table persons(\n" +
//                        "id int,\n" +
//                        "name nvarchar(50),\n" +
//                        "surname nvarchar(50)\n" +
//                        ")";

//                String sqlQuery="insert into persons(\n" +
//                        "id ,\n" +
//                        "name ,\n" +
//                        "surname\n" +
//                        ") values(1,'фарид','абдулаев'),(2,'дима','абдулаев'),(3,'олег','абдулаев')";


//
//                String sqlQuery="update persons set name='999' where id>2";
//
//                int insertedRows=statement.executeUpdate(sqlQuery);
//                System.out.println(insertedRows+ " было обновлено");
//
//
//
//
//            }
//            System.out.println("Good");
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//


//                String sqlQuery="delete from persons  where id>2";
//
//                int insertedRows=statement.executeUpdate(sqlQuery);
//                System.out.println(insertedRows+ " было удалено");
//
//
//
//
//            }
//            System.out.println("Good");
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }


//
//                String sqlQuery="drop table persons ";
//
//                int insertedRows=statement.executeUpdate(sqlQuery);
//                System.out.println(insertedRows+ " таблица удалена");


//            }
//            System.out.println("Good");
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//


//                int id = 1;
//                String name = "Dima";
//                String surname = "Sorokin');DROP table persons;--'";


//                String sqlQuery = "insert into persons(id,name,surname) values (?,?,?)";
//                        ") values("+id+","+name+","+surname+")"; (неправильно)

//                PreparedStatement statement = connection.prepareStatement(sqlQuery);
//                statement.setInt(1, id);
//                statement.setString(2, name);
//                statement.setString(3, surname);
//                statement.executeUpdate();

//                int insertedRows = statement.executeUpdate();
//
//
//
//
//
//                System.out.println(insertedRows + " строк было добавлено");

         String sql="select * from persons";
         Statement statement = connection.createStatement();
        ResultSet resultSet= statement.executeQuery(sql);

        while (resultSet.next()) {
//            System.out.println(resultSet.getInt("id") +
//                    " " + resultSet.getString("name") +
//                    " " + resultSet.getString("surname"));
            System.out.println(resultSet.getInt(1) +
                    " " + resultSet.getString(2) + " " + resultSet.getString(3));
        }






            }
            System.out.println("Good");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


//        try {
////            Class.forName("com.mysql.cj.jdbc.Driver");
////            System.out.println("Good");
//            String url = "jdbc:mysql://localhost:3306/java522";
//            String username = "root";
//            String password = "12345";
//
//            try (Connection connection = DriverManager.getConnection(url, username, password)) {
//                Statement statement = connection.createStatement();
////                statement.executeUpdate(); //DROP, CREATE,INSERT,DELETE,UPDATE(CRUD ОПЕРАЦИИ)
////                statement.executeQuery(); //SELECT (TABLE ResultSet)
////                statement.execute();// BOOLEAN
//
//            }
//            System.out.println("Good");
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//

//        try {
////            Class.forName("com.mysql.cj.jdbc.Driver");
////            System.out.println("Good");
//            String url="jdbc:mysql://localhost:3306/java522";
//            String username="root";
//            String password="12345";
//
//            DriverManager.getConnection(url,username,password);
//            System.out.println("Good");
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }


//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("Good");
//        } catch (ClassNotFoundException e) {
//            System.out.println("Error: " + e.getMessage());
//        }


    }
}
