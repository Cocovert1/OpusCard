package com.company;


// 1DONE - 2DONE - 3DONE - 4DONE - 5DONE - 6DONE - 7DONE - 8DONE - 9DONE - 10DONE - 11DONE

public class Main {

    public static void main(String[] args) {
        Tickets t1 = new Tickets(2, 2, 2 ,2 ,2); //114$
        Tickets t2 = new Tickets(0, 0, 34, 0, 2); //114$
        Tickets t3 = new Tickets(2, 2, 2 ,6 ,1); //114$
        OPUSCard o1 = new OPUSCard(5, 2022,  "Alessio", "STM");
        OPUSCard o2 = new OPUSCard(6, 2023,  "Nico", "STM");

        Ticketbooth tb1 = new Ticketbooth();
        Ticketbooth tb2 = new Ticketbooth();
        Ticketbooth tb3 = new Ticketbooth();
        Ticketbooth tb4 = new Ticketbooth();

        tb1.addTicket(t1);
        tb2.addTicket(t2);
        tb3.addTicket(t3);

        //1 CHECK TOTAL VALUE
        System.out.println(tb1.isTicketValueEqual(tb2));

        System.out.println();

        //2 CHECK EACH NUMBER OF TICKETS
        System.out.println(tb1.isTicketsEqual(tb3));
        System.out.println();

        //3
        System.out.println(tb1.totalOfTickets());
        System.out.println();

        //5
        tb1.addOPUS(o1);
        tb1.addOPUS(o2);

        tb1.printOP();

        System.out.println();

        //4
        System.out.println(tb1.totalOPUSCards());

        System.out.println();

        //6
        tb1.removeOPUS();

        tb1.printOP();

        System.out.println();

        //7
        tb1.updateExpiryDate(0, 6, 2023);
        tb1.printOP();

        System.out.println();

        //8
        System.out.println(tb1.addTicket(1,1,1,1,1));
        System.out.println();

        //9
        tb2.addOPUS(o1);
        tb3.addOPUS(o2);
        System.out.println(tb2.equals(tb3));

        System.out.println();

        //10
        System.out.println(tb1);
        System.out.println();

        //11
        System.out.println(tb1.breakdownOfTickets());
    }
}
