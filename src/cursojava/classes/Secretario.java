package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {
  private String registro;
  private String nivelCargo;
  private String experiencia;

  public String getRegistro() {
    return registro;
  }

  public void setRegistro(String registro) {
    this.registro = registro;
  }

  public String getNivelCargo() {
    return nivelCargo;
  }

  public void setNivelCargo(String nivelCargo) {
    this.nivelCargo = nivelCargo;
  }

  public String getExperiencia() {
    return experiencia;
  }

  public void setExperiencia(String experiencia) {
    this.experiencia = experiencia;
  }

  @Override
  public boolean isActive() {
    return false;
  }

  @Override
  public boolean autenticar() {
    if (isActive()) {
      return true;
    }
    return false;
  }
}
