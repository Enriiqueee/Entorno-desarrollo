import com.enrique.PcComponentes.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("!");
        Procesador amd = new Procesador();
        amd.setId(1);
        amd.setMarca("Ryzen");
        amd.setFabricante("AMD");
        System.out.println(amd.getId());
        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricantes());
        Placa_Base asus = new Placa_Base();
        asus.setId(1);
        asus.setMarca("gmb");
        asus.setPrecio(29);
        System.out.println(asus.getId());
        System.out.println(asus.getMarca());
        System.out.println(asus.getPrecio());
        TarjetaGrafica nvidia = new TarjetaGrafica();
        nvidia.setId(2);
        nvidia.setMarca("Nvidia");
        nvidia.setModelo("3090");
        nvidia.setMemoria("8GB");
        System.out.println(nvidia.getId());
        System.out.println(nvidia.getMarca());
        System.out.println(nvidia.getModelo());
        System.out.println(nvidia.getMemoria());

    }
}