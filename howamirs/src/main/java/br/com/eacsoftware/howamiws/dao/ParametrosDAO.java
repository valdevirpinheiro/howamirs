package br.com.eacsoftware.howamiws.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.com.eacsoftware.howamiws.beans.Registro;

public class ParametrosDAO {


  public static List<Registro> listaRgistrosDiaModulo(Connection con, String empNO) throws SQLException {
    // Processos processos = new Processos();
    java.util.List<Registro> registros = new ArrayList<Registro>();
    DateFormat df = new SimpleDateFormat("yyyy/MM/dd/");
    Date today = Calendar.getInstance().getTime();
    String reportDate = (df.format(today)).replaceAll("/", "");
    int empno = Integer.parseInt(empNO);
    int dataInt = Integer.parseInt(reportDate);
    int dataExemplo = 20150806;
    Statement stmt = con.createStatement();
    StringBuilder sqlBuilder = new StringBuilder();
    sqlBuilder.append("SELECT *  ");
    sqlBuilder.append("FROM empmov WHERE  ");
    sqlBuilder.append("data ='" + dataExemplo + "'   ");
    sqlBuilder.append("AND empno='" + empNO + "';");
    String sql = String.format(sqlBuilder.toString(), empno);
    ResultSet cursor = stmt.executeQuery(sql);
    Registro regPonto = null;
    while (cursor.next()) {
      regPonto = new Registro();
      regPonto.setData(cursor.getInt("data"));
      regPonto.setEmpNO(empno);
      regPonto.setHora(cursor.getInt("hora"));
      regPonto.setTipoPonto((char) cursor.getString("tipo").charAt(0));
      registros.add(regPonto);
      // processo.setNome(cursor.getString("nome"));
      // processos.getProcesso().add(processo);
    }
    return registros;
  }
}
