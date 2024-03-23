public class Custom {
    public static boolean verifyPassport(Person person) {
        boolean passportApproved = (int) (Math.random() * 2) == 0;

        System.out.println(passportApproved
            ? "Congratulations " + person.getName() + ". Your passport was approved!"
            : "We are sorry " + person.getName() + ". We cannot process your application.");
            
        return passportApproved;
    }
}
