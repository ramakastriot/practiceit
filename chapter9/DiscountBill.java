public class DiscountBill extends GroceryBill {
    private boolean preferred;
    private int discountCount;
    private double discountAmount;
    
    public DiscountBill(Employee clerk, boolean preferred) {
        super(clerk);
        this.discountCount = 0;
        this.discountAmount = 0;
        this.preferred = preferred;
    }
    
    public double getTotal() {
        return super.getTotal() - discountAmount;
    }
    
    public void add(Item i) {
        super.add(i);
        
        if(preferred && i.getDiscount() > 0) {
            discountCount++;
            discountAmount += i.getDiscount();
        }
    }
    
    public int getDiscountCount() {
        return discountCount;
    }
    
    public double getDiscountAmount() {
        return discountAmount;
    }
    
    public double getDiscountPercent() {
        return (discountAmount * 100) / super.getTotal();
    }
}
