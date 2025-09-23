public interface Veicolo {
    public double calcolaDestinazione(double distanza, Carburante tipo);
    public String stampaStatus();
    public void setStatus(String status);
    public Carburante getCarburante();
    public double getDistanza();

}
