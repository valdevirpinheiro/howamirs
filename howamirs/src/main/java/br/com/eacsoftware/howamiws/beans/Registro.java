package br.com.eacsoftware.howamiws.beans;

public class Registro {

  String funcionario;
  int data;
  int hora;
  int empNO;
  char tipoPonto;

  public String getFuncionario() {
    return funcionario;
  }

  public void setFuncionario(String funcionario) {
    this.funcionario = funcionario;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public int getHora() {
    return hora;
  }

  public void setHora(int hora) {
    this.hora = hora;
  }

  public int getEmpNO() {
    return empNO;
  }

  public void setEmpNO(int empNO) {
    this.empNO = empNO;
  }

  public char getTipoPonto() {
    return tipoPonto;
  }

  public void setTipoPonto(char tipoPonto) {
    this.tipoPonto = tipoPonto;
  }
}
