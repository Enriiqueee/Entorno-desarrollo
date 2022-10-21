import com.enrique.PcComponentes.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Procesador amd = new Procesador();
        amd.setId(1);
        amd.setMarca("Ryzen");
        amd.setFabricante("AMD");
        System.out.println(amd.getId());
        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricantes());

        PlacaBase gigabyte = new PlacaBase();
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

        DiscoDuro Seagate = new DiscoDuro();
        Seagate.setId(6);
        Seagate.setMarca("Barracuda");
        Seagate.setCapacidad("240GB");
        Seagate.setDimensiones("3,5");
        System.out.println(Seagate.getId());
        System.out.println(Seagate.getMarca());
        System.out.println(Seagate.getDimensiones());
        System.out.println(Seagate.getCapacidad());

        FuenteAlimentacion nox = new FuenteAlimentacion();
        nox.setId(7);
        nox.setMarca("Nox Urano");
        nox.setPotencia("650W");
        nox.setDimensiones("150X140X85");
        System.out.println(nox.getId());
        System.out.println(nox.getMarca());
        System.out.println(nox.getDimensiones());
        System.out.println(nox.getPotencia());

        TarjetaSonido Asus = new TarjetaSonido();
        Asus.setId(8);
        Asus.setMarca("Xonar");
        Asus.setModelo("Xonar SE Interno 5.1");
        Asus.setPrecio(32);
        System.out.println(Asus.getId());
        System.out.println(Asus.getMarca());
        System.out.println(Asus.getModelo());
        System.out.println(Asus.getPrecio());

        GrabadoraDVD LG = new GrabadoraDVD();
        LG.setId(9);
        LG.setMarca("Asus");
        LG.setDimensiones("146x41");
        LG.setPrecio(17);
        System.out.println(LG.getId());
        System.out.println(LG.getDimensiones());
        System.out.println(LG.getPrecio());

        Monitor Benq = new Monitor();
        Benq.setId(10);
        Benq.setMarca("Benq Zowie");
        Benq.setFrecuencia(144);
        Benq.setFabricante("Benq Corporations");
        Benq.setPrecio(200);
        System.out.println(Benq.getId());
        System.out.println(Benq.getMarca());
        System.out.println(Benq.getFrecuencia());
        System.out.println(Benq.getFabricante());
        System.out.println(Benq.getPrecio());

        Teclado Forgeon = new Teclado();
        Forgeon.setId(11);
        Forgeon.setMarca("Forgeon");
        Forgeon.setModelo("Clutch Blue");
        Forgeon.setConexion("USB");
        System.out.println(Forgeon.getId());
        System.out.println(Forgeon.getMarca());
        System.out.println(Forgeon.getModelo());
        System.out.println(Forgeon.getConexion());

        Raton logitech = new Raton();
        logitech.setId(12);
        logitech.setMarca("Logitech");
        logitech.setModelo("G705 Wireless");
        logitech.setConexion("USB or Wireless");
        System.out.println(logitech.getId());
        System.out.println(logitech.getMarca());
        System.out.println(logitech.getModelo());
        System.out.println(logitech.getConexion());

        Altavoz Woxter = new Altavoz();
        Woxter.setId(13);
        Woxter.setMarca("Woxter");
        Woxter.setModelo("Biss Bass 95");
        Woxter.setConexion("USB");
        System.out.println(Woxter.getId());
            System.out.println(Woxter.getMarca());
        System.out.println(Woxter.getModelo());
        System.out.println(Woxter.getConexion());
    }

}