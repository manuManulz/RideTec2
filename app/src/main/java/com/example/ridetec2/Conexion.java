package com.example.ridetec2;
import android.widget.Toast;

import java.sql.*;
public class Conexion {
    Connection miConexion;
    Statement miSentencia;
    ResultSet miResultado;

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://192.168.1.86:3306/ridetec";
            String usuario="root";
            String pwd="sistemas";
            miConexion=DriverManager.getConnection(servidor,usuario,pwd);
        } catch (ClassNotFoundException e) {
            System.out.println(e+"");
        } catch (Exception e) {

        } finally {
return miConexion;
        }
    }
}
