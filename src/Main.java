import com.enrique.PcComponentes.*;
public class Main {
    public static void main(String[] args) {
        Procesador amd = new Procesador();
        amd.setId(1);
        amd.setMarca("Ryzen");
        amd.setFabricante("AMD");
        System.out.println(amd.getId());
        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricantes());

        Placa_Base gigabyte = new Placa_Base();
        gigabyte.setId(2);
        gigabyte.setMarca("gigabyte");
        gigabyte.setModelo("b450");
        gigabyte.setFabricante("Asus");
        gigabyte.setPrecio(29);
        System.out.println(gigabyte.getId());
        System.out.println(gigabyte.getMarca());
        System.out.println(gigabyte.getModelo());
        System.out.println(gigabyte.getFabricante());
        System.out.println(gigabyte.getPrecio());

        TarjetaGrafica nvidia = new TarjetaGrafica();
        nvidia.setId(3);
        nvidia.setMarca("Nvidia");
        nvidia.setModelo("3090");
        nvidia.setPuertos("2");
        nvidia.setMemoria("8GB");
        nvidia.setPrecio(320);
        System.out.println(nvidia.getId());
        System.out.println(nvidia.getMarca());
        System.out.println(nvidia.getModelo());
        System.out.println(nvidia.getPuertos());
        System.out.println(nvidia.getMemoria());
        System.out.println(nvidia.getPrecio());

        Caja Noxhummer = new Caja();

    }
}