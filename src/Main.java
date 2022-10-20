import com.enrique.PcComponentes.*;

import java.io.OutputStream;

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
        Noxhummer.setId(4);
        Noxhummer.setNombre("Nox hummer ATX");
        Noxhummer.setMarca("Nox");
        Noxhummer.setModelo("Tempest Case");
        Noxhummer.setDimensiones("320X120x70");
        Noxhummer.setPrecio(77);
        System.out.println(nvidia.getId());
        System.out.println(Noxhummer.getNombre());
        System.out.println(Noxhummer.getMarca());
        System.out.println(Noxhummer.getModelo());
        System.out.println(Noxhummer.getDimensiones());
        System.out.println(Noxhummer.getPrecio());

        VentiladorCpu Aerocool = new VentiladorCpu();
        Aerocool.setId(5);
        Aerocool.setNombre("Tempest Cooler");
        Aerocool.setMarca("Tempest");
        Aerocool.setModelo("CPU");
        Aerocool.setPrecio(144);
        System.out.println(Aerocool.getId());
        System.out.println(Aerocool.getNombre());
        System.out.println(Aerocool.getMarca());
        System.out.println(Aerocool.getModelo());
        System.out.println(Aerocool.getPrecio());
    }

}