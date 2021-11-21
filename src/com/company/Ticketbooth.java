package com.company;


public class Ticketbooth {
    private Tickets t;
    private OPUSCard[] opusArray = new OPUSCard[1];

    public Ticketbooth() {

    }

    public Ticketbooth(Tickets t, OPUSCard[] opusArray) {
        this.t = t;
        this.opusArray = opusArray;
    }

    public double totalOfTickets(){
        return this.t.ticketsTotal();
    }

    public int totalOPUSCards(){
        int counter = 0;
        for(OPUSCard o : opusArray){
            counter++;
        }
        return counter;
    }

    public void addOPUS(OPUSCard o){
        if(opusArray[0] == null){
            opusArray[0] = o;
        }else{
            OPUSCard[] newOpusArray = new OPUSCard[opusArray.length+1];
            for(int i = 0; i < opusArray.length; i++){
                newOpusArray[i] = opusArray[i];
            }
            newOpusArray[opusArray.length] = o;
            opusArray = newOpusArray;
        }
    }

    public boolean removeOPUS(){
        boolean condition;
        if(this.opusArray.length == 0){
            condition = false;
        }else{
            opusArray[opusArray.length-1] = null;
            OPUSCard[] newOPUSArray = new OPUSCard[opusArray.length-1];
            for(int i = 0; i < opusArray.length-1; i++){
                newOPUSArray[i] = opusArray[i];
            }
            opusArray = newOPUSArray;
            condition = true;
        }
        return condition;
    }

    public void updateExpiryDate(int index, int month, int year){
        this.opusArray[index].expiryMonth(month);
        this.opusArray[index].expiryYear(year);
    }

    public void addTicket(Tickets t){
        this.t = t;
    }

    public double addTicket(int regular, int junior, int senior, int daily, int weekly ){
        this.t.addTickets(regular, junior, senior, daily, weekly);
        return t.ticketsTotal();
    }

    public double totalValueOfTickets(){
        return this.t.ticketsTotal();
    }

    //To Remove
    public void printOP(){
        for(OPUSCard c: opusArray){
            System.out.println(c);
        }
    }

    public boolean isTicketsEqual(Ticketbooth tb){
        if(tb.t.equals(this.t)){
            System.out.println("NB of tickets is the same");
        }else{
            System.out.println("NB of tickets is NOT the same");
        }
        return tb.t.equals(this.t);
    }

    public boolean isTicketValueEqual(Ticketbooth tb){
        if(tb.t.ticketsTotal() == this.t.ticketsTotal()){
            System.out.println("VALUE of tickets is same");
        }else{
            System.out.println("VALUE of tickets is NOT same");
        }
        return tb.t.ticketsTotal() == this.t.ticketsTotal();
    }

    public boolean equals(Ticketbooth tb){
        return tb.t.ticketsTotal() == this.t.ticketsTotal() && tb.opusArray.length == this.opusArray.length;
    }

    public String toString(){
        String toOutput = this.t + ", ";
        if(opusArray.length == 0){
            toOutput = toOutput + ", No OPUS cards";
        }else {
            for (OPUSCard o : opusArray) {
                toOutput = toOutput + ", " + o;
            }
        }
        return toOutput;
    }

    public String breakdownOfTickets(){
        return this.t.toString();
    }
}
