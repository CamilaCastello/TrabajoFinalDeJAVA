//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArmaDeCorta armaCortaPrueba = new ArmaDeCorta(new Policia("Alexis", "Caseres", 002347), 22,150,"Glock 17", 10, "En uso", true);

        armaCortaPrueba.esEfectivaADistancia();
        System.out.println(armaCortaPrueba.getEstado());


        ArmaDeLarga armaLargaPrueba1 = new ArmaDeLarga(new Policia("Alejandra", "Lopez", 0056320), 42, 700, "AK47", 6, "En mantenimiento", true, "Utilizar solo en casos de codigo rojo", 3);
        armaLargaPrueba1.estaEnCondiones();
        System.out.println(armaLargaPrueba1.getDescripcionDeUso());

        ArmaDeLarga armaLargaDePrueba2 = new ArmaDeLarga(new Policia("Lucero", "Gomez", 00227), 32, 1000, "Scar", 7, "Nueva", false, "Utilizar solo en casos de codigo rojo", 5);
        System.out.println(armaLargaDePrueba2.compareTo(armaLargaPrueba1));
        armaLargaDePrueba2.estaEnCondiones();

    }
}