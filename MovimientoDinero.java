package edu.udea.main.model;

public class MovimientoDinero {
    //ATRIBUTOS
    private Double montoMovimiento;
    private String conceptoMovimiento;
    public Double montoPositivoNegativo;
    public String usuarioEncargadomovimiento;

    //CONSTRUCTOR
    public MovimientoDinero(Double montoMovimiento, String conceptoMovimiento, Double montoPositivoNegativo, String usuarioEncargadomovimiento) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.montoPositivoNegativo = montoPositivoNegativo;
        this.usuarioEncargadomovimiento = usuarioEncargadomovimiento;
    }

    public void Montos(double montoMovimiento) {
        if (montoMovimiento < this.getMontoMovimiento()) {
            this.setMontoMovimiento(this.getMontoMovimiento() - montoMovimiento);
        } else {
            this.setMontoMovimiento(montoMovimiento + this.getMontoMovimiento());
            System.out.println("Tipo: Positivo");
        }
    }

    //GETTERS AND SETTERS

    public Double getMontoMovimiento() {

        return montoMovimiento;
    }

    public void setMontoMovimiento(Double montoMovimiento) {

        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {

        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {

        this.conceptoMovimiento = conceptoMovimiento;
    }

    public Double getMontoPositivoNegativo() {
        return montoPositivoNegativo;
    }

    public void setMontoPositivoNegativo(Double montoPositivoNegativo) {
        this.montoPositivoNegativo = montoPositivoNegativo;
    }

    public String getUsuarioEncargadomovimiento() {

        return usuarioEncargadomovimiento;
    }

    public void setUsuarioEncargadomovimiento(String usuarioEncargadomovimiento) {
        this.usuarioEncargadomovimiento = usuarioEncargadomovimiento;
    }

}
