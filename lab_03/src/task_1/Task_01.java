package task_1;

import java.util.StringTokenizer;

class Message {

    String text;

    Message(String text){
        this.text=text;
    }

    String tostring() {
        return this.text;
    }

    void set_text(String text){
        this.text=text;
    }
}

class SMS extends Message{

    int Contact_no;

    SMS(String text, int Contact_no){

        super(text);
        this.Contact_no=Contact_no;

    }



    void set_contact(int Contact_no)
    {
        this.Contact_no=Contact_no;
    }

    String tostring() {
        return "\nRecipient: "+ this.Contact_no +"\nMessage: "+ this.text;
    }


}


class Email extends SMS{

    String sender;
    String receiver;
    String subject;

    Email(String sender, String receiver, String subject, String text, int Contact_no){
        super(text,Contact_no);
        this.receiver=receiver;
        this.sender=sender;
        this.subject=subject;

    }
    void setSender(String sender){
        this.sender=sender;
    }

    String getSender(){
        return this.sender;
    }


    void setReceiver(String receiver){
        this.receiver=receiver;
    }

    String getReceiver(){
        return this.receiver;
    }

    void setSubject(String subject){
        this.subject=subject;
    }

    String getSubject(){
        return this.subject;
    }

    String tostring() {

        return "Senndr: "+this.sender+"\nReceiver: "+this.receiver+"\nSubject: "+this.subject+ "\nRecipient: "+ this.Contact_no +"\nMessage: "+ this.text;


    }


}



public class Task_01 {
    public static void main(String[] args) {
        Email e = new Email("adil012","Waqar001","Bunk","Chalo ao bunk karen",03123445213);
        SMS s = new SMS("hello",12);
        System.out.println(e.tostring());
        System.out.println(s.tostring());

    }

}
