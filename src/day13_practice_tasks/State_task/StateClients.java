package day13_practice_tasks.State_task;

public class StateClients {

    public static void main(String[] args) {

        Virginia virginia = new Virginia("Republican", "Glenn Youngli", "Tim Kare", 853510);
        California california = new California("Democratic", "Gavin Newsom", "Alex Padilla",39567899);
        Texas texas =new Texas("Republican", "Greg Abbott", "John Corny", 29145505);
        Florida florida = new Florida("Republican", "Ron DeSantis", "Marco Rubio", 21538187);

        System.out.println(virginia);
        System.out.println(california);
        System.out.println(texas);
        System.out.println(florida);
    }
}
