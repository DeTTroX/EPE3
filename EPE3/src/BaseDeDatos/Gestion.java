/*
Copyright 2019 Joaquín Molina, José Inostroza, Zianya Castro

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package BaseDeDatos;

import Panel.updateEstado;
import Panel.updateObservacion;
import Panel.updateTipo;
import Panel.updatoNacion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;



public class Gestion {
   
    Connection conexion = null;
    Statement sentencia = null;
    ResultSet resultados =null;
    String NOMBREBD = "museo.sqlite";
    String URL = "jdbc:sqlite:"+NOMBREBD;
    String DRIVER ="org.sqlite.JDBC";
    
      public void crearBD(){
        
    try{
        Class.forName(DRIVER);
        conexion = DriverManager.getConnection(URL);
        JOptionPane.showMessageDialog(null,"Base de datos creada con exito ","Creada",JOptionPane.INFORMATION_MESSAGE);
    }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null,"Error: " + e.getMessage(),"Error¡",JOptionPane.ERROR_MESSAGE);
        }
    }
    
      public void crearTabla(){
      
    try{
        Class.forName(DRIVER);
        conexion = DriverManager.getConnection(URL);
        sentencia = conexion.createStatement();
        
        String sql="CREATE TABLE SEDE"+"(ID_SEDE TEXT PRIMARY KEY NOT NULL,"+"NOMBRE_S TEXT NOT NULL,"+
                   "TELEFONO INT NOT NULL,"+"CORREO TEXT NOT NULL)";
        
       
        sentencia.executeUpdate(sql);
        sentencia.close();
        conexion.close();
        
        JOptionPane.showMessageDialog(null,"Tabla creada con exito","Creada",JOptionPane.INFORMATION_MESSAGE);
        
    }catch(ClassNotFoundException | SQLException e){
        System.out.println("Error!! "+e.getMessage());
        }
    }
   public void crearTabla2(){
      
    try{
        Class.forName(DRIVER);
        conexion = DriverManager.getConnection(URL);
        sentencia = conexion.createStatement();
        
        String sql="CREATE TABLE ARTICULO"+"(ID_ARTICULO TEXT PRIMARY KEY NOT NULL,"+"NOMBRE TEXT NOT NULL,"+
                   "ESTADO TEXT NOT NULL,"+"NACION TEXT NOT NULL,"+"OBSERVACION TEXT NOT NULL,"+
                   "ID_SEDE_FK TEXT NOT NULL,"+"ID_CLASE_FK INT NOT NULL,"+" FOREIGN KEY(ID_SEDE_FK) REFERENCES SEDE(ID_SEDE),"+
                    "FOREIGN KEY(ID_CLASE_FK) REFERENCES CLASE(ID_CLASE))";
       
        sentencia.executeUpdate(sql);
        sentencia.close();
        conexion.close();
        
        JOptionPane.showMessageDialog(null,"Tabla creada con exito","Creada",JOptionPane.INFORMATION_MESSAGE);
        
    }catch(ClassNotFoundException | SQLException e){
        System.out.println("Error!! "+e.getMessage());
        }
    }
         public void crearTabla3(){
      
    try{
        Class.forName(DRIVER);
        conexion = DriverManager.getConnection(URL);
        sentencia = conexion.createStatement();
        
        String sql="CREATE TABLE CLASE"+"(ID_CLASE INT PRIMARY KEY NOT NULL,"+"TIPO TEXT NOT NULL,"+
                   "FABRICANTE TEXT NOT NULL,"+"ANO INT NOT NULL)";
        
       
        sentencia.executeUpdate(sql);
        sentencia.close();
        conexion.close();
        
        JOptionPane.showMessageDialog(null,"Tabla creada con exito","Creada",JOptionPane.INFORMATION_MESSAGE);
        
    }catch(ClassNotFoundException | SQLException e){
        System.out.println("Error!! "+e.getMessage());
        }
    }
         
    public void insertarDatosTablaUno(String id,String nombre,int telefono,String correo){
       try{
        Class.forName(DRIVER);
        conexion = DriverManager.getConnection(URL);
        sentencia = conexion.createStatement();
        
        String sql="INSERT INTO SEDE "+
                    "(ID_SEDE,NOMBRE_S,TELEFONO,CORREO) VALUES "+
                    "('"+id+"','"+nombre+"','"+telefono+"','"+correo+"')";
       
        sentencia.executeUpdate(sql);
        sentencia.close();
        conexion.close();
        
        JOptionPane.showMessageDialog(null,"Datos insertados ","Creada",JOptionPane.INFORMATION_MESSAGE);
        
    }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null,"Primary key insertada ya esta en existencia");
        }
    
    }
    
      public void insertarDatosTablaDos(String id,String nombre,String estado,String nacion,String observacion,String sede,int clase){
       try{
        Class.forName(DRIVER);
        conexion = DriverManager.getConnection(URL);
        sentencia = conexion.createStatement();
        
        String sql="INSERT INTO ARTICULO "+
                    "(ID_ARTICULO,NOMBRE,ESTADO,NACION,OBSERVACION,ID_SEDE_FK,ID_CLASE_FK) VALUES "+
                    "('"+id+"','"+nombre+"','"+estado+"','"+nacion+"','"+observacion+"','"+sede+"','"+clase+"')";
       
        sentencia.executeUpdate(sql);
        sentencia.close();
        conexion.close();
        
        JOptionPane.showMessageDialog(null,"Datos insertados ","Creada",JOptionPane.INFORMATION_MESSAGE);
        
    }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null,"Primary key insertada ya esta en existencia o Un FK insertado no esta relacionado con sede o clase");
        }
    
    }
        public void insertarDatosTablaTres(int clase,String tipo,String fabricante,int anno){
      
    try{
        Class.forName(DRIVER);
        conexion = DriverManager.getConnection(URL);
        sentencia = conexion.createStatement();
        
        String sql="INSERT INTO CLASE"+
                   "(ID_CLASE,TIPO,FABRICANTE,ANO) VALUES"+
                   "('"+clase+"','"+tipo+"','"+fabricante+"','"+anno+"')";
        
       
        sentencia.executeUpdate(sql);
        sentencia.close();
        conexion.close();
        
        JOptionPane.showMessageDialog(null,"Datos insertados ","Creada",JOptionPane.INFORMATION_MESSAGE);
        
    }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null,"Primary key ya existe");
        }
    }

         public void updateDatosTabla1(){
       try{
        Class.forName(DRIVER);
        conexion = DriverManager.getConnection(URL);
        sentencia = conexion.createStatement();
        String[] opciones = {
           "ID_SEDE", "NOMBRE_S", "TELEFONO", "CORREO"};
        int seleccion = JOptionPane.showOptionDialog(null,"Que desea modificar", "GOD BOY!!",
               JOptionPane.DEFAULT_OPTION,
               JOptionPane.PLAIN_MESSAGE,null,
               opciones, opciones[0]);
        switch (seleccion){
            case 0:
                String ID1 = JOptionPane.showInputDialog(null," ingrese id a modificar");
                String ID2 = JOptionPane.showInputDialog(null," ingrese nueva id");
                    String sql="UPDATE SEDE "+
                    "SET ID_SEDE = '"+ID2+"'"+
                    "WHERE ID_SEDE = '"+ID1+"'";
                    sentencia.executeUpdate(sql);
                    sentencia.close();
                    conexion.close();
                break;
                
            case 1:
                String NOMBRE1=JOptionPane.showInputDialog(null," ingrese ID de nombre a modificar");
                String NOMBRE2=JOptionPane.showInputDialog(null," ingrese nuevo nombre");
                    sql="UPDATE SEDE "+
                    "SET NOMBRE_S = '"+NOMBRE2+"'"+
                    "WHERE ID_SEDE = '"+NOMBRE1+"'";
                    sentencia.executeUpdate(sql);
                    sentencia.close();
                    conexion.close();
               break;
               
            case 2:   
                String FONO1=JOptionPane.showInputDialog(null," ingrese ID de telefono a modificar");
                String FONO2=JOptionPane.showInputDialog(null," ingrese nuevo telefono");
                    sql="UPDATE SEDE "+
                    "SET TELEFONO = '"+FONO2+"'"+
                    "WHERE ID_SEDE = '"+FONO1+"'";
                    sentencia.executeUpdate(sql);
                    sentencia.close();
                    conexion.close();
                    break;
                
            case 3:   
                String CORREO = JOptionPane.showInputDialog(null," ingrese ID de correo a modificar");
                String CORREO2 = JOptionPane.showInputDialog(null," ingrese nuevo correo");
                    sql="UPDATE SEDE "+
                    "SET CORREO = '"+CORREO2+"'"+
                    "WHERE ID_SEDE = '"+CORREO+"'";
                    sentencia.executeUpdate(sql);
                    sentencia.close();
                    conexion.close();
                break;
        }
        
    }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null,"Error!! "+e.getMessage());
    }
}
      public void deleteDatosTabla1(String DEL){
       try{
        Class.forName(DRIVER);
        conexion = DriverManager.getConnection(URL);
        sentencia = conexion.createStatement();
         
        String sql="DELETE FROM SEDE "+
                   "WHERE ID_SEDE ='"+DEL+"';";
        
        sentencia.executeUpdate(sql);
        sentencia.close();
        conexion.close();
       JOptionPane.showMessageDialog(null,"Dato eliminado con exito");
    }catch(ClassNotFoundException | SQLException e){
       JOptionPane.showMessageDialog(null,"El ID insertado no existe");
    }
}
               public void updateDatosTabla2(){
       try{
        Class.forName(DRIVER);
        conexion = DriverManager.getConnection(URL);
        sentencia = conexion.createStatement();
        
        String[] opciones = {
           "ID_ARTICULO","NOMBRE","ESTADO","NACION","OBSERVACION","ID_SEDE_FK","ID_CLASE_FK"};
        int seleccion = JOptionPane.showOptionDialog(null,"Que desea modificar", "GOD BOY!!",
               JOptionPane.DEFAULT_OPTION,
               JOptionPane.PLAIN_MESSAGE,null,
               opciones, opciones[0]);
        switch (seleccion){
            case 0:
                String ID1 = JOptionPane.showInputDialog(null," ingrese id a modificar");
                String ID2 = JOptionPane.showInputDialog(null," ingrese nueva id");
                    String sql="UPDATE ARTICULO "+
                    "SET ID_ARTICULO = '"+ID2+"'"+
                    "WHERE ID_ARTICULO = '"+ID1+"'";
                    sentencia.executeUpdate(sql);
                    sentencia.close();
                    conexion.close();
                break;
                
            case 1:
                String NOMBRE1=JOptionPane.showInputDialog(null," ingrese id de nombre a modificar");
                String NOMBRE2=JOptionPane.showInputDialog(null," ingrese nuevo nombre");
                    sql="UPDATE ARTICULO "+
                    "SET NOMBRE = '"+NOMBRE2+"'"+
                    "WHERE ID_ARTICULO = '"+NOMBRE1+"'";
                    sentencia.executeUpdate(sql);
                    sentencia.close();
                    conexion.close();
               break;
               
            case 2:   
                
                updateEstado estado = new updateEstado();
                estado.setVisible(true);
                break;
                
            case 3:  
                
                updatoNacion nacion = new updatoNacion();
                nacion.setVisible(true);
                break;
            
            case 4:
                
                updateObservacion obser = new updateObservacion();
                obser.setVisible(true);
                break;
                
            case 5:
                String IDS1=JOptionPane.showInputDialog(null," ingrese ID de id_sede_FK a modificar");
                String IDS2=JOptionPane.showInputDialog(null," ingrese nuevo id_sede_FK");
                    sql="UPDATE ARTICULO "+
                    "SET ID_SEDE_FK = '"+IDS2+"'"+
                    "WHERE ID_ARTICULO = '"+IDS1+"'";
                    sentencia.executeUpdate(sql);
                    sentencia.close();
                    conexion.close();
                break;
            case 6:
                String idclas1 = JOptionPane.showInputDialog(null," ingrese ID de id_clase_FK a modificar");
                int idclas2 = Integer.parseInt(JOptionPane.showInputDialog(null," ingrese nueva id_clase_FK"));
                
                    sql="UPDATE ARTICULO "+
                    "SET ID_CLASE_FK = '"+idclas2+"'"+
                    "WHERE ID_ARTICULO = '"+idclas1+"'";
                    sentencia.executeUpdate(sql);
                    sentencia.close();
                    conexion.close();
                break;
        }
        
    }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null,"Error!! "+e.getMessage());
    }
}
      public void deleteDatosTabla2(){
       try{
        Class.forName(DRIVER);
        conexion = DriverManager.getConnection(URL);
        sentencia = conexion.createStatement();
        String DEL = JOptionPane.showInputDialog(null," ingrese id de la columna que desea borrar");
         String sql="DELETE FROM ARTICULO "+
                   "WHERE ID_ARTICULO ='"+DEL+"';";
        
        sentencia.executeUpdate(sql);
        sentencia.close();
        conexion.close();
        
    }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null,"Error!! "+e.getMessage());
    }
}
               public void updateDatosTabla3(){
       try{
        Class.forName(DRIVER);
        conexion = DriverManager.getConnection(URL);
        sentencia = conexion.createStatement();
        String[] opciones = {
           "ID_CLASE","TIPO","FABRICANTE","AÑO"};
        int seleccion = JOptionPane.showOptionDialog(null,"Que desea modificar", "GOD BOY!!",
               JOptionPane.DEFAULT_OPTION,
               JOptionPane.PLAIN_MESSAGE,null,
               opciones, opciones[0]);
        switch (seleccion){
            case 0:
                int idcla1 = Integer.parseInt(JOptionPane.showInputDialog(null," ingrese id_clase a modificar"));
                int idcla2 = Integer.parseInt(JOptionPane.showInputDialog(null," ingrese nueva id_clase"));
                    String sql="UPDATE CLASE "+
                    "SET ID_CLASE = '"+idcla2+"'"+
                    "WHERE ID_CLASE = '"+idcla1+"'";
                    sentencia.executeUpdate(sql);
                    sentencia.close();
                    conexion.close();
                break;
                
            case 1:
               updateTipo tipo = new updateTipo();
               tipo.setVisible(true);
               break;
               
            case 2:   
                String Fab1=JOptionPane.showInputDialog(null," ingrese ID de fabricante a modificar");
                String Fab2=JOptionPane.showInputDialog(null," ingrese nuevo fabricante");
                    sql="UPDATE CLASE "+
                    "SET FABRICANTE = '"+Fab2+"'"+
                    "WHERE ID_CLASE = '"+Fab1+"'";
                    sentencia.executeUpdate(sql);
                    sentencia.close();
                    conexion.close();
                    break;
                
            case 3:   
                int ano1 = Integer.parseInt(JOptionPane.showInputDialog(null," ingreseID de año a modificar"));
                int ano2 = Integer.parseInt(JOptionPane.showInputDialog(null," ingrese nuevo año"));
                    sql="UPDATE CLASE "+
                    "SET ANO = '"+ano2+"'"+
                    "WHERE ID_CLASE= '"+ano1+"'";
                    sentencia.executeUpdate(sql);
                    sentencia.close();
                    conexion.close();
                break;
        }
        
    }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null,"Error!! "+e.getMessage());
    }
}
      public void deleteDatosTabla3(){
       try{
        Class.forName(DRIVER);
        conexion = DriverManager.getConnection(URL);
        sentencia = conexion.createStatement();
        String DEL = JOptionPane.showInputDialog(null," ingrese id de la columna que desea borrar");
         String sql="DELETE FROM CLASE "+
                   "WHERE ID_CLASE ='"+DEL+"';";
        
        sentencia.executeUpdate(sql);
        sentencia.close();
        conexion.close();
        
    }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null,"Error!! "+e.getMessage());
    }
}
        public void updateDatosEstado(String ID1,String ID2){
        try{
        Class.forName(DRIVER);
        conexion = DriverManager.getConnection(URL);
        sentencia = conexion.createStatement();
       
                    String sql="UPDATE ARTICULO "+
                    "SET ESTADO = '"+ID2+"'"+
                    "WHERE ID_ARTICULO = '"+ID1+"'";
                    
        sentencia.executeUpdate(sql);
        sentencia.close();
        conexion.close();
           
        }catch(ClassNotFoundException | SQLException e){
        System.out.println("Error!! "+e.getMessage());
    }
}
                    public void updateDatosOBS(String ID1,String ID2){
        try{
        Class.forName(DRIVER);
        conexion = DriverManager.getConnection(URL);
        sentencia = conexion.createStatement();
       
                    String sql="UPDATE ARTICULO "+
                    "SET OBSERVACION = '"+ID2+"'"+
                    "WHERE ID_ARTICULO = '"+ID1+"'";
                    
        sentencia.executeUpdate(sql);
        sentencia.close();
        conexion.close();
           
        }catch(ClassNotFoundException | SQLException e){
        System.out.println("Error!! "+e.getMessage());
    }
}
            public void updateDatosNAC(String ID1,String ID2){
        try{
        Class.forName(DRIVER);
        conexion = DriverManager.getConnection(URL);
        sentencia = conexion.createStatement();
       
                    String sql="UPDATE ARTICULO "+
                    "SET NACION = '"+ID2+"'"+
                    "WHERE ID_ARTICULO = '"+ID1+"'";
                    
        sentencia.executeUpdate(sql);
        sentencia.close();
        conexion.close();
           
        }catch(ClassNotFoundException | SQLException e){
        System.out.println("Error!! "+e.getMessage());
    }
}

        public void updateDatosTipo(int ID1,String ID2){
        try{
        Class.forName(DRIVER);
        conexion = DriverManager.getConnection(URL);
        sentencia = conexion.createStatement();
       
                    String sql="UPDATE CLASE "+
                    "SET TIPO = '"+ID2+"'"+
                    "WHERE ID_CLASE = '"+ID1+"'";
                    
        sentencia.executeUpdate(sql);
        sentencia.close();
        conexion.close();
           
        }catch(ClassNotFoundException | SQLException e){
        System.out.println("Error!! "+e.getMessage());
    }
}
 
       public void mostrarDatos(JTable tabla){
         try{
        Class.forName(DRIVER);
        conexion = DriverManager.getConnection(URL);
        sentencia = conexion.createStatement();
        String sql = "SELECT * FROM SEDE";
        resultados = sentencia.executeQuery(sql);
        int fila=0;
        while(resultados.next()){
            tabla.setValueAt(resultados.getString("ID_SEDE"),fila,0);
            tabla.setValueAt(resultados.getString("NOMBRE_S"),fila,1);
            tabla.setValueAt(resultados.getInt("TELEFONO"),fila,2);
            tabla.setValueAt(resultados.getString("CORREO"),fila,3);
            fila++;
        }
        resultados.close();
        sentencia.close();
        conexion.close();
        
    }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null,"Error!! "+e.getMessage());
        }
    }
        public void mostrarDatos2(JTable tabla){
         try{
        Class.forName(DRIVER);
        conexion = DriverManager.getConnection(URL);
        sentencia = conexion.createStatement();
        String sql = "SELECT * FROM ARTICULO";
        resultados = sentencia.executeQuery(sql);
        int fila=0;
        while(resultados.next()){
            tabla.setValueAt(resultados.getString("ID_ARTICULO"),fila,0);
            tabla.setValueAt(resultados.getString("NOMBRE"),fila,1);
            tabla.setValueAt(resultados.getString("ESTADO"),fila,2);
            tabla.setValueAt(resultados.getString("NACION"),fila,3);
            tabla.setValueAt(resultados.getString("OBSERVACION"),fila,4);
            tabla.setValueAt(resultados.getString("ID_SEDE_FK"),fila,5);
            tabla.setValueAt(resultados.getInt("ID_CLASE_FK"),fila,6);
            fila++;
        }
        resultados.close();
        sentencia.close();
        conexion.close();
        
    }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null,"Error!! "+e.getMessage());
        }
    }
         public void mostrarDatos3(JTable tabla){
         try{
        Class.forName(DRIVER);
        conexion = DriverManager.getConnection(URL);
        sentencia = conexion.createStatement();
        String sql = "SELECT * FROM CLASE";
        resultados = sentencia.executeQuery(sql);
        int fila=0;
        while(resultados.next()){
            tabla.setValueAt(resultados.getInt("ID_CLASE"),fila,0);
            tabla.setValueAt(resultados.getString("TIPO"),fila,1);
            tabla.setValueAt(resultados.getString("FABRICANTE"),fila,2);
            tabla.setValueAt(resultados.getInt("ANO"),fila,3);
            fila++;
        }
        resultados.close();
        sentencia.close();
        conexion.close();
        
    }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null,"Error!! "+e.getMessage());
        }
    }
 public void mostrarDatosPR1(JTable tabla){
         try{
        Class.forName(DRIVER);
        conexion = DriverManager.getConnection(URL);
        sentencia = conexion.createStatement();
        String sql = "SELECT NOMBRE_S,ARTICULO.NOMBRE,ARTICULO.OBSERVACION "+
                     "FROM SEDE "+
                     "JOIN ARTICULO "+
                     "ON SEDE.ID_SEDE=ARTICULO.ID_SEDE_FK;";
        resultados = sentencia.executeQuery(sql);
        int fila=0;
        while(resultados.next()){
            tabla.setValueAt(resultados.getString("NOMBRE_S"),fila,0);
            tabla.setValueAt(resultados.getString("NOMBRE"),fila,1);
            tabla.setValueAt(resultados.getString("OBSERVACION"),fila,2);
            fila++;
        }
        resultados.close();
        sentencia.close();
        conexion.close();
        
    }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null,"Error!! "+e.getMessage());
        }
    }

  public void mostrarDatosPR2(JTable tabla){
         try{
        Class.forName(DRIVER);
        conexion = DriverManager.getConnection(URL);
        sentencia = conexion.createStatement();
        String sql = "SELECT  ARTICULO.NOMBRE, ARTICULO.ESTADO, ARTICULO.NACION, CLASE.TIPO, CLASE.FABRICANTE,SEDE.NOMBRE_S "+
                     "FROM CLASE "+
                     "JOIN ARTICULO "+
                     "ON ARTICULO.ID_CLASE_FK=CLASE.ID_CLASE "+
                     "JOIN SEDE ON SEDE.ID_SEDE=ARTICULO.ID_SEDE_FK;";
        resultados = sentencia.executeQuery(sql);
        int fila=0;
        while(resultados.next()){
            tabla.setValueAt(resultados.getString("NOMBRE"),fila,0);
            tabla.setValueAt(resultados.getString("ESTADO"),fila,1);
            tabla.setValueAt(resultados.getString("NACION"),fila,2);
            tabla.setValueAt(resultados.getString("TIPO"),fila,3);
            tabla.setValueAt(resultados.getString("FABRICANTE"),fila,4);
            tabla.setValueAt(resultados.getString("NOMBRE_S"),fila,5);
            fila++;
        }
        resultados.close();
        sentencia.close();
        conexion.close();
        
    }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null,"Error!! "+e.getMessage());
        }
    }
}
