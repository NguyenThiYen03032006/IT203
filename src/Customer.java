public class Customer extends UserAbstract{
    private String email;
    private String phone;

    @Override
    public void printfInfor() {
        System.out.println(email);
    }
}
