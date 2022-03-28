package taller3.televisores;

public class TV {
    Marca marca;
    int canal = 1;
    int precio = 500;
    boolean estado;
    int volumen = 1;
    Control control;
    static int numTV = 0;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        TV.numTV += 1;
    }

    public Marca getMarca() {
        return this.marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Control getControl() {
        return this.control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return this.volumen;
    }

    public void setVolumen(int volumen) {
        if (volumen < 0 || volumen > 7) {
            return;
        }
        this.volumen = volumen;
    }

    public int getCanal() {
        return this.canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }
    
    public static int getNumTV() {
        return TV.numTV;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }
    public void turnOn() {
        this.estado = true;
    }

    public void turnOff() {
        this.estado = false;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void canalUp() {
        int canalNuevo = this.canal - 1;
        if (canalNuevo < 1 || !this.estado){
            return;
        }
        this.setCanal(canalNuevo);
    }

    public void canalDown() {
        int canalNuevo = this.canal + 1;
        if (canalNuevo > 120 || !this.estado){
            return;
        }
        this.setCanal(canalNuevo);
    }

    public void volumenUp() {
        int volumenNuevo = this.volumen + 1;
        if (volumenNuevo > 7 || this.estado){
            return;
        }
        this.setVolumen(volumenNuevo);
    }

    public void volumenDown() {
        int volumenNuevo = this.volumen - 1;
        if (volumenNuevo < 1 || this.estado){
            return;
        }
        this.setVolumen(volumenNuevo);
    }
}
