package day07_practice_tasks;

public class ItemClients {
    public static void main(String[] args) {

        Item pen = new Item();
        pen.name = "Pen";
        pen.unitPrice = 1.80;
        pen.quantity = 5;
        System.out.println(pen);


        System.out.println();

        Item notebook = new Item();
        notebook.name = "Notebook";
        notebook.unitPrice = 2.80;
        notebook.quantity = 3;
        System.out.println(notebook);

        System.out.println(notebook.calcCost());


    }
}
