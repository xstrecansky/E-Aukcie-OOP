package users;

public class VipBuyer extends Buyer {
    VipBuyer(String username, String password) {
        super(username, password);
    }

    /**
     * @return int
     */
    // Vratime 2 -> VIP kupec
    @Override
    public int getRole() {
        return 2;
    }
}
