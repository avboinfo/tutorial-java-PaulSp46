public class Main {
    public static void main(String[] args) throws Exception {
        Mailbox mailList = new Mailbox();
        System.out.println(mailList);

        mailList.newMail(new Email("Mario Sturniolo", "Test", "13-08-2022 22:30", "Questa è una prova"));    
        System.out.println(mailList);

        mailList.removeEmailPos(1);
        System.out.println(mailList);

        mailList.emailSearchString("k");

        mailList.printLog();
    }
}
