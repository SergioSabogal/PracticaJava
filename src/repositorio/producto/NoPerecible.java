package repositorio.producto;

import java.time.LocalDate;

public class NoPerecible extends Producto{
    private int lote;
    private LocalDate vencimiento;

    public NoPerecible(String nombre, double precio, int lote, LocalDate vencimiento) {
        super(nombre, precio);
        this.lote = lote;
        this.vencimiento = vencimiento;
    }

    public int getLote() {
        return lote;
    }

    public LocalDate getVencimiento() {
        return vencimiento;
    }

}
